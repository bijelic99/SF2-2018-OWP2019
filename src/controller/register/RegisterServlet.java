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
import model.KorisnikFromFrontend;

/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends controller.login.AuthenticationRequired {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
   
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Map<String,Boolean> successfull = new HashMap<String, Boolean>();
		ObjectMapper om = new ObjectMapper();
		try {
			
			String korisnikJSON =  request.getReader().readLine();
			//System.out.println(korisnikJSON);
			KorisnikFromFrontend korisnikShort = om.readerFor(KorisnikFromFrontend.class).readValue(korisnikJSON);
			Korisnik korisnik = new Korisnik(korisnikShort);
			DaoInterface.korisnikDao.add(korisnik);
			request.getRequestDispatcher("/Success").forward(request, response);
		} catch (Exception e) {
			request.getRequestDispatcher("/Failure").forward(request, response);
		}
		
	}

}
