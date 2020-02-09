package controller.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LogoutServlet
 */
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogoutServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie[] cookies = request.getCookies();
		if(cookies != null)
		for(Cookie cookie : cookies) {
			if(cookie.getName().equals("korisnik")) {
				cookie.setMaxAge(0);
				response.addCookie(cookie);
				
			}
		}
		HttpSession session = request.getSession();
		session.invalidate();
		response.setHeader("Access-Control-Expose-Headers", "logOutOnArrival");
		response.setHeader("logOutOnArrival", "true");
		
		request.getRequestDispatcher("/Success").forward(request, response);
	}

}
