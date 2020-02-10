package controller.film;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import dao.DaoInterface;

/**
 * Servlet implementation class Izvestavanje
 */
public class Izvestavanje extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Izvestavanje() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Date vremeOd = null;
		Date vremeDo = null;
		try {
			Map<String, String[]> params = request.getParameterMap();
			if(params.containsKey("od")) {
				Long odLong = Long.parseLong(params.get("od")[0]);
				vremeOd = new Date(odLong);
			}
			if(params.containsKey("do")) {
				Long doLong = Long.parseLong(params.get("do")[0]);
				vremeDo = new Date(doLong);
			}
			if(vremeOd != null && vremeDo != null) {
				ArrayList<HashMap<String, Object>> al = DaoInterface.filmDao.getIzvestajForFilms(vremeOd, vremeDo);
				ObjectMapper om = new ObjectMapper();
				response.getWriter().write(om.writeValueAsString(al));
				response.setStatus(HttpServletResponse.SC_OK);
				response.getWriter().close();
			}
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("error", HttpServletResponse.SC_BAD_REQUEST);
			request.setAttribute("error-message", "Los zahtev");
			request.getRequestDispatcher("/Failure").forward(request, response);
		}
	}

}
