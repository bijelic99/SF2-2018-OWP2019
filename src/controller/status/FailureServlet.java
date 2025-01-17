package controller.status;

import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Servlet implementation class FailureServlet
 */
public class FailureServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FailureServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Error: <br>");
		Object error = request.getAttribute("error");
		response.getWriter().append(error != null ? error.toString() : "");
		response.getWriter().close();
		response.setStatus(200);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ObjectMapper om = new ObjectMapper();
		response.setContentType("application/json; charset=UTF-8");
		response.setStatus(request.getAttribute("error") != null ? (int) request.getAttribute("error") : HttpServletResponse.SC_OK);
		response.sendError(request.getAttribute("error") != null ? (int) request.getAttribute("error") : HttpServletResponse.SC_OK, request.getAttribute("error-message") != null ? request.getAttribute("error-message").toString() : "");
		Map<String, Object> returnData = new HashMap<String, Object>();
		returnData.put("successful", false);
		Enumeration enumeration = request.getAttributeNames();
		while(enumeration.hasMoreElements()) {
			String key = enumeration.nextElement().toString();
			returnData.put(key, request.getAttribute(key));
		}
		response.getWriter().write(om.writeValueAsString(returnData));
		response.getWriter().close();
	}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

}
