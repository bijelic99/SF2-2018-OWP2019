package controller.film;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.naming.ContextAccessController;

import com.fasterxml.jackson.databind.ObjectMapper;

import dao.DaoInterface;
import miscellaneous.DataParsingHelper;
import model.Film;
import model.Identifiable;
import model.KorisnikFromFrontend;
import model.Uloga;

/**
 * Servlet implementation class FilmServlet
 */
public class FilmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FilmServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ObjectMapper om = new ObjectMapper();
		try {
			response.setContentType("application/json; utf-8");
			Map<String, String[]> paramMap = request.getParameterMap();
			if(paramMap.keySet().isEmpty()) {
				ArrayList<Identifiable> filmovi = DaoInterface.filmDao.getAll();
				response.getWriter().write(om.writeValueAsString(filmovi));
				response.getWriter().close();
			}
			else if(paramMap.containsKey("id")) {
			String[] ids = request.getParameterValues("id");
			if(ids!= null) {
				int id = Integer.parseInt(ids[0]);
				Film film = (Film) DaoInterface.filmDao.get(id);
				response.setStatus(HttpServletResponse.SC_OK);
				response.getWriter().write(om.writeValueAsString(film));
				response.getWriter().close();
			}
			}
			else if (paramMap.containsKey("searchString")) {
				final String searchString = paramMap.get("searchString")[0].trim();
				ArrayList<Identifiable> list = DaoInterface.filmDao.get(f->{
					if(!searchString.isEmpty()) {
						Film film = (Film)f;
						StringJoiner sj = new StringJoiner(" ");
						sj.add(film.getNaziv()).add(film.getTrajanje()+"").add(film.getDistributer()).add(film.getZemljaPorekla()).add(film.getGodinaProizvodnje()+"").add(film.getReziser()+"");
						film.getZanrovi().stream().forEach(z->sj.add(z.getNaziv()));
						film.getGlumci().stream().forEach(o->sj.add(o.getNaziv()));
						String filmString = sj.toString();
						String[] searchArray = searchString.split(" ");
						return Arrays.stream(searchArray).reduce(true, (value, element)-> value && filmString.toUpperCase().contains(element.toUpperCase()), (value1, value2)-> value1 && value2);
					} else return true;
				});
				response.getWriter().write(om.writeValueAsString(list));
				response.getWriter().close();
			}
		} catch (Exception e) {
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ObjectMapper om = new ObjectMapper();
		try {
			String jsonFilm = DataParsingHelper.getJsonFromBufferReader(request.getReader());
			//System.out.println(jsonFilm);
			Film film = om.readerFor(Film.class).readValue(jsonFilm);
			if(film.getDistributer().isEmpty()) throw new Exception();
			if(film.getZemljaPorekla().isEmpty()) throw new Exception();
			int id = DaoInterface.filmDao.add(film);
			request.setAttribute("id", id);
			request.getRequestDispatcher("/Success").forward(request, response);
			
		} catch (Exception e) {
			request.getRequestDispatcher("/Failure").forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ObjectMapper om = new ObjectMapper();
		try {
			String jsonFilm = DataParsingHelper.getJsonFromBufferReader(request.getReader());
			Film film = om.readerFor(Film.class).readValue(jsonFilm);
			DaoInterface.filmDao.update(film);
			request.getRequestDispatcher("/Success").forward(request, response);
			
		} catch (Exception e) {
			request.getRequestDispatcher("/Failure").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String strFilmId = request.getParameter("id");
			if(strFilmId != null) {
			int filmId = Integer.parseInt(strFilmId);
			Film film = (Film) DaoInterface.filmDao.get(filmId);
			DaoInterface.filmDao.delete(film, !DaoInterface.filmDao.filmHasProjections(film.getId()));
			} else throw new Exception("Id not provided");
			
			request.getRequestDispatcher("/Success").forward(request, response);
			
		} catch (Exception e) {
			e.printStackTrace();
			request.getRequestDispatcher("/Failure").forward(request, response);
		}
	}
	@Override
	protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("aaaaaaa");
	}

}
