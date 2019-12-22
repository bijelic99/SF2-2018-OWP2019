package controller.register;

import java.io.IOException;
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
public class RegisterServlet extends HttpServlet {
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
		try {
			ObjectMapper om = new ObjectMapper();
			String korisnikJSON = request.getParameter("data");
			KorisnikFromFrontend korisnikShort = om.readerFor(KorisnikFromFrontend.class).readValue(korisnikJSON);
			Korisnik korisnik = new Korisnik(korisnikShort);
			DaoInterface.korisnikDao.add(korisnik);
			response.setStatus(HttpServletResponse.SC_OK);
		} catch (Exception e) {
			response.sendError(406, e.getMessage());
		}
		
	}

}
