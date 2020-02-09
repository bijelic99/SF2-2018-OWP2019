package controller.login;

import java.io.IOException;
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
		else if(cookies != null) {
			for(Cookie cookie : cookies) {
				if(cookie.getName().equals("korisnik")) {
					korisnik = om.readerFor(Korisnik.class).readValue(cookie.getValue());
					session.setAttribute("loggedInUser", korisnik);
					chain.doFilter(request, response);
					return;
				}
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
