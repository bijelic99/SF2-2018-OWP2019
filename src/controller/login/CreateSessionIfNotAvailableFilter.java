package controller.login;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;

import dao.DaoInterface;
import model.Identifiable;
import model.Korisnik;

/**
 * Servlet Filter implementation class CreateSessionIfNotAvailableFilter
 */
public class CreateSessionIfNotAvailableFilter implements Filter {
	
    /**
     * Default constructor. 
     */
    public CreateSessionIfNotAvailableFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		ObjectMapper om = new ObjectMapper();
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		Cookie[] cookies = httpRequest.getCookies();
		HttpSession session = httpRequest.getSession();
		Korisnik korisnik = (Korisnik) session.getAttribute("loggedInUser");
		
		if(korisnik != null ) {
			
			
			chain.doFilter(request, response);
			return;
		}
		else if(httpRequest.getHeader("logging-out") == null && httpRequest.getHeader("logged-in") != null && httpRequest.getHeader("logged-in").equals("true") && httpRequest.getHeader("logged-in-user") != null) {
			String[] creds = httpRequest.getHeader("logged-in-user").split("|");
				try {
					ArrayList<Identifiable> listaKor = DaoInterface.korisnikDao.get(k-> ((Korisnik)k).getUsername().equals(creds[0]) && ((Korisnik)k).getPassword().equals(creds[1]));
					korisnik = !listaKor.isEmpty() ? (Korisnik) listaKor.get(0) : null;
					if(korisnik != null) session.setAttribute("loggedInUser", korisnik);
					System.out.println("zapoceo sesiju");
					chain.doFilter(request, response);
					return;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			
		}
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
