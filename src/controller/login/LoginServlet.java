package controller.login;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;

import dao.DaoInterface;
import model.Identifiable;
import model.Korisnik;
import model.KorisnikFromFrontend;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ObjectMapper om = new ObjectMapper();
		try {
			
			String credentials = "";
			String row = "";
			do {
			credentials += row;
			row = request.getReader().readLine();
			}
			while(row != null);
			KorisnikFromFrontend korisnikLogin = om.readerFor(KorisnikFromFrontend.class).readValue(credentials);
			List<Identifiable> nadjeniKorisnici = DaoInterface.korisnikDao.get(k -> {
				Korisnik ko = (Korisnik)k;
				return ko.getUsername().equals(korisnikLogin.getUsername()) && ko.getPassword().equals(korisnikLogin.getPassword());
			});
			if(!nadjeniKorisnici.isEmpty()) {
				Korisnik korisnik =  (Korisnik) nadjeniKorisnici.get(0);
				
				HttpSession session = request.getSession();
				session.setAttribute("loggedInUser", korisnik);
				
				HashMap<String, Object> resHm = new HashMap<String, Object>();
				resHm.put("user", korisnik);
				resHm.put("successful", true);
				response.setContentType("application/json; charset=UTF-8");
				response.setStatus(HttpServletResponse.SC_OK);
				response.getWriter().write(om.writeValueAsString(resHm));
				response.getWriter().close();
				
				
				
			}
			else throw new Exception("Wrong username or password");
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			request.getRequestDispatcher("/Failure").forward(request, response);
		}
	}

}
