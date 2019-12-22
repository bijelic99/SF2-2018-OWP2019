package controller.register;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import dao.DaoInterface;
import model.Korisnik;

/**
 * Servlet implementation class UniqueUsernameServlet
 */
public class UniqueUsernameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UniqueUsernameServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		ObjectMapper om = new ObjectMapper();
		response.setContentType("application/json; charset=UTF-8");
		Map<String, Boolean> available = new HashMap<String, Boolean>();
		
		
		String username = request.getParameter("data");
		System.out.println(username);
		try {
			
			if (DaoInterface.korisnikDao.get(i -> {
				Korisnik k = (Korisnik) i;
				return k.getUsername() == username;
			}).isEmpty())
				available.put("available", true);
			else
				available.put("available", false);
			response.getWriter().write(om.writeValueAsString(available));
			response.getWriter().close();
			response.setStatus(HttpServletResponse.SC_OK);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	
	

}
