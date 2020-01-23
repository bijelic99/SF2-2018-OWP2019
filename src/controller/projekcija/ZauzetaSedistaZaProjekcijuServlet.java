package controller.projekcija;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import dao.DaoInterface;
import model.ZauzetoSediste;

/**
 * Servlet implementation class ZauzetaSedistaZaProjekcijuServlet
 */
public class ZauzetaSedistaZaProjekcijuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ZauzetaSedistaZaProjekcijuServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ObjectMapper om = new ObjectMapper();
		try {
			response.setContentType("application/json; utf-8");
			Map<String, String[]> paramMap = request.getParameterMap();
			if(paramMap.containsKey("projekcijaId")) {
				int projekcijaId = Integer.parseInt(paramMap.get("projekcijaId")[0]);
				ArrayList<ZauzetoSediste> lista = DaoInterface.sedisteDao.getZauzetostSedistaForProjekcija(projekcijaId);
				response.getWriter().write(om.writeValueAsString(lista));
				response.setStatus(HttpServletResponse.SC_OK);
			}
			else throw new Exception("Morate obezbediti projekcijaId");
			
		} catch (Exception e) {
			e.printStackTrace();
			request.getRequestDispatcher("/Failure").forward(request, response);
		}
	}

}
