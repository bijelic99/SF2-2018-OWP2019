package controller.korisnik;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import dao.DaoInterface;

/**
 * Servlet implementation class KorisnikServlet
 */
public class KorisnikServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public KorisnikServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			ObjectMapper om = new ObjectMapper();
			Map<String, String[]> paramMap = request.getParameterMap();
			if (paramMap.keySet().isEmpty()) {
				response.getWriter().write(om.writeValueAsString(DaoInterface.korisnikDao.getAll()));
				return;
			} else if (paramMap.containsKey("id")) {
				response.getWriter().write(om.writeValueAsString(DaoInterface.korisnikDao.get(Integer.parseInt(paramMap.get("id")[0]))));
				return;
			}
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("error", HttpServletResponse.SC_NOT_ACCEPTABLE);
			request.setAttribute("errorMasage", "Oblik zahteva ne odgovara");
			request.getRequestDispatcher("/Failure").forward(request, response);
			
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
