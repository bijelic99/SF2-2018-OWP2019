package controller.miscellaneous;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import dao.DaoInterface;
import model.Identifiable;

/**
 * Servlet implementation class FilmskiRadniciServlet
 */
public class FilmskiRadniciServlet extends controller.login.AuthenticationRequired {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FilmskiRadniciServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			response.setContentType("application/json; utf-8");
			ObjectMapper om = new ObjectMapper();
			ArrayList<Identifiable> osobe = DaoInterface.osobaDao.getAll();
			response.getWriter().write(om.writeValueAsString(osobe));
			//System.out.println(om.writeValueAsString(osobe));
			response.setStatus(HttpServletResponse.SC_OK);
		} catch (Exception e) {
			e.printStackTrace();
			response.setStatus(HttpServletResponse.SC_EXPECTATION_FAILED);
		}
	}

}
