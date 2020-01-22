package controller.projekcija;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.util.StringJoiner;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import dao.DaoInterface;
import model.Film;
import model.Identifiable;
import model.Projekcija;

/**
 * Servlet implementation class ProjekcijaServlet
 */
public class ProjekcijaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ProjekcijaServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ObjectMapper om = new ObjectMapper();
		try {
			response.setContentType("application/json; utf-8");
			Map<String, String[]> paramMap = request.getParameterMap();
			if (paramMap.keySet().isEmpty()) {
				ArrayList<Identifiable> projekcije = DaoInterface.projekcijaDao.getAll();
				response.getWriter().write(om.writeValueAsString(projekcije));
				response.getWriter().close();
			} else if (paramMap.containsKey("id")) {
				String[] ids = request.getParameterValues("id");
				if (ids != null) {
					int id = Integer.parseInt(ids[0]);
					Projekcija projekcija = (Projekcija) DaoInterface.projekcijaDao.get(id);
					response.setStatus(HttpServletResponse.SC_OK);
					response.getWriter().write(om.writeValueAsString(projekcija));
					response.getWriter().close();
				}
			} else if (paramMap.containsKey("searchString")) {
				final String searchString = paramMap.get("searchString")[0].trim();
				ArrayList<Identifiable> list = DaoInterface.projekcijaDao
						.get(p -> /*
									 * { if(!searchString.isEmpty()) { Film film = (Film)f; StringJoiner sj = new
									 * StringJoiner(" ");
									 * sj.add(film.getNaziv()).add(film.getTrajanje()+"").add(film.getDistributer())
									 * .add(film.getZemljaPorekla()).add(film.getGodinaProizvodnje()+"").add(film.
									 * getReziser()+"");
									 * film.getZanrovi().stream().forEach(z->sj.add(z.getNaziv()));
									 * film.getGlumci().stream().forEach(o->sj.add(o.getNaziv())); String filmString
									 * = sj.toString(); String[] searchArray = searchString.split(" "); return
									 * Arrays.stream(searchArray).reduce(true, (value, element)-> value &&
									 * filmString.toUpperCase().contains(element.toUpperCase()), (value1, value2)->
									 * value1 && value2); } else return true; }
									 */ {
							if (!searchString.isEmpty()) {
								SimpleDateFormat sdf = new SimpleDateFormat("hh:mm dd-MM-yyyy");
								Projekcija projekcija = (Projekcija) p;
								StringJoiner sj = new StringJoiner(" ");
								sj.add(projekcija.getId() + "").add(projekcija.getFilm().getNaziv())
										.add(projekcija.getTipProjekcije().getNaziv())
										.add(projekcija.getSala().getNaziv())
										.add(sdf.format(projekcija.getDatumVremePrikazivanja()))
										.add(projekcija.getCenaKarte() + "");
								String projekcijaString = sj.toString();
								String[] searchArray = searchString.split(" ");
								return Arrays.stream(searchArray).reduce(true, (value, element)-> {
									if(element.matches(	"^\\[\\d{2}/\\d{2}/\\d{4} [0-5]{1,2}:[0-5]{1,2} \\- \\d{2}/\\d{2}/\\d{4} [0-5]{1,2}:[0-5]{1,2}\\]$")) {
										String[] strDates = element.replace("[", "").replace("]","").trim().split(" ");
										SimpleDateFormat sdfd = new SimpleDateFormat("dd/MM/yyyy hh:mm");
										try {
											Date pocetak = sdfd.parse(strDates[0].trim());
											Date kraj = sdfd.parse(strDates[1].trim());
											return value && (pocetak.before(projekcija.getDatumVremePrikazivanja()) && kraj.after(projekcija.getDatumVremePrikazivanja()));
										} catch (ParseException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
											return false;
										}
										
										
									}
									else return value && (projekcijaString.toLowerCase().contains(element.toLowerCase()));
								}, (value1, value2)-> value1 && value2);
								
							} else
								return true;
						});
				 
				 
				response.getWriter().write(om.writeValueAsString(list));
				response.getWriter().close();
			}
		} catch (Exception e) {
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
