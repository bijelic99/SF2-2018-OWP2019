package controller.login.authentificationRequieredFilters.adminRoleRequieredFilter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import model.Korisnik;
import model.Uloga;

/**
 * Servlet Filter implementation class AdminRoleRequieredFilter
 */
public class AdminRoleRequieredFilter implements Filter {

    /**
     * Default constructor. 
     */
    public AdminRoleRequieredFilter() {
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
		//Ova vrsta filtera bi trebalo uvek da ide posle AuthenticationRequiered Filtera
		
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpSession session = httpRequest.getSession();
		Korisnik korisnik = (Korisnik) httpRequest.getAttribute("loggedInUser");
		if(korisnik != null) {
			if(korisnik.getUloga() == Uloga.Admin) chain.doFilter(request, response);
			else httpRequest.getRequestDispatcher("/Unauthorized").forward(request, response);
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
