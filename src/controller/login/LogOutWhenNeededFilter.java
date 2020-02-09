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
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Korisnik;

/**
 * Servlet Filter implementation class LogOutWhenNeededFilter
 */
public class LogOutWhenNeededFilter implements Filter {
	private ServletContext context;
    /**
     * Default constructor. 
     */
    public LogOutWhenNeededFilter() {
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
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		
		HttpServletRequest req = (HttpServletRequest) request;
		Korisnik korisnik = (Korisnik) req.getSession().getAttribute("loggedInUser");
		if(korisnik != null) {
		HashMap<Integer, Korisnik> hmk = (HashMap<Integer, Korisnik>) this.context.getAttribute("izmenjeniKorisnci");
		if(hmk.containsKey(korisnik.getId())) {
			hmk.remove(korisnik.getId());
			this.context.setAttribute("izmenjeniKorisnci", hmk);
			req.getRequestDispatcher("/api/Logout").forward(req, (HttpServletResponse)response);
			return;
			}
		}
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		this.context = fConfig.getServletContext();
	}

}
