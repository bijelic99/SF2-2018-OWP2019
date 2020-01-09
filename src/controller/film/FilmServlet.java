package controller.film;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Enumeration;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.naming.ContextAccessController;

import com.fasterxml.jackson.databind.ObjectMapper;

import dao.DaoInterface;
import miscellaneous.DataParsingHelper;
import model.Film;
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
			String[] ids = null;
			ids = request.getParameterValues("id");
			if(ids!= null) {
				int id = Integer.parseInt(ids[0]);
				Film film = (Film) DaoInterface.filmDao.get(id);
				response.setStatus(HttpServletResponse.SC_OK);
				response.getWriter().write(om.writeValueAsString(film));
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
