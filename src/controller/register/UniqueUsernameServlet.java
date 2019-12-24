package controller.register;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Enumeration;
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
		try {
			String jsonUsername = request.getReader().readLine();
			//System.out.println(jsonUsername);
			Map<String,String> usernameMap = om.readValue(jsonUsername, Map.class);
			Map<String,Boolean> available = new HashMap<String, Boolean>();
			//System.out.println(usernameMap.get("username"));
			if (DaoInterface.korisnikDao.get(i -> {
				Korisnik k = (Korisnik) i;
				return k.getUsername().equals(usernameMap.get("username").trim());
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

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}

	@Override
	protected void doOptions(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doOptions(arg0, arg1);
	}

	
	
	
	
	

}
