package controller.karta;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import dao.DaoInterface;
import miscellaneous.DataParsingHelper;
import model.Identifiable;
import model.Karta;

/**
 * Servlet implementation class KartaServlet
 */
public class KartaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public KartaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ObjectMapper om = new ObjectMapper();
		try {
			Map<String, String[]> paramMap = request.getParameterMap();
			if(paramMap.keySet().isEmpty()) {
				ArrayList<Identifiable> karte = DaoInterface.kartaDao.getAll();
				response.getWriter().write(om.writeValueAsString(karte));
				response.getWriter().close();
			}
			else if(paramMap.containsKey("id")) {
				String[] ids = request.getParameterValues("id");
				if(ids!= null) {
					int id = Integer.parseInt(ids[0]);
					Karta karta =(Karta) DaoInterface.kartaDao.get(id);
					response.getWriter().write(om.writeValueAsString(karta));
					response.getWriter().close();
				}
			}
			else {
				Stream<Identifiable> stream = DaoInterface.kartaDao.getAll().stream();
				if(paramMap.containsKey("projekcijaId")) {
					
					stream = stream.filter(i->((Karta)i).getProjekcija().getId() == Integer.parseInt(paramMap.get("projekcijaId")[0]));
				}
				if(paramMap.containsKey("sedisteId")) {
					stream = stream.filter(i->((Karta)i).getSediste().getId() == Integer.parseInt(paramMap.get("sedisteId")[0]));
				}
				if(paramMap.containsKey("korisnikId")) {
					stream = stream.filter(i->((Karta)i).getKorisnik().getId() == Integer.parseInt(paramMap.get("korisnikId")[0]));
				}
				response.getWriter().write(om.writeValueAsString(stream.collect(Collectors.toCollection(ArrayList::new))));
				response.getWriter().close();
			}
			response.setStatus(HttpServletResponse.SC_OK);
			
		} catch (Exception e) {
			request.setAttribute("error", HttpServletResponse.SC_NOT_FOUND);
			request.getRequestDispatcher("/Failure").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ObjectMapper om = new ObjectMapper();
		
		try {
			response.setContentType("application/json; utf-8");
			String jsonKarte = DataParsingHelper.getJsonFromBufferReader(request.getReader());
			Karta[] karte = om.readerFor(Karta[].class).readValue(jsonKarte);
			for(int i = 0; i<karte.length; i++) {
				karte[i].setId(DaoInterface.kartaDao.add(karte[i]));
			}
			request.setAttribute("karte", om.writeValueAsString(karte));
			request.getRequestDispatcher("/Success").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("error", HttpServletResponse.SC_CONFLICT);
			request.setAttribute("error-message", HttpServletResponse.SC_CONFLICT);
			request.setAttribute("greska", e.getMessage());
			request.getRequestDispatcher("/Failure").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String strKartaId = request.getParameter("id");
			if(strKartaId != null) {
				int kartaId = Integer.parseInt(strKartaId);
				Karta karta = (Karta) DaoInterface.kartaDao.get(kartaId);
				DaoInterface.kartaDao.delete(karta);
			} else throw new Exception("Id not provided");
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("error", HttpServletResponse.SC_NOT_FOUND);
			request.setAttribute("greska", e.getMessage());
			request.getRequestDispatcher("/Failure").forward(request, response);
			
		}
	}

}
