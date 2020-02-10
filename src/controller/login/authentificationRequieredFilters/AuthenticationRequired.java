package controller.login.authentificationRequieredFilters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;

import model.Korisnik;

/**
 * Servlet Filter implementation class AuthenticationRequired
 */
public class AuthenticationRequired implements Filter {

    /**
     * Default constructor. 
     */
    public AuthenticationRequired() {
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
		if(korisnik != null) {
			
			chain.doFilter(request, response);
		
		}
		else httpRequest.getRequestDispatcher("/Unauthorized").forward(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
