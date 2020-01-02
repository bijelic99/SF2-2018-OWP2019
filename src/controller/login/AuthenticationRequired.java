package controller.login;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServlet;
import model.Uloga;

public abstract class AuthenticationRequired extends HttpServlet {
	private boolean AuthRequiered = false;
	private Map<String, Uloga> authenticatedMethodsForRole;
	
	public boolean isAuthRequiered() {
		return AuthRequiered;
	}
	public void setAuthRequiered(boolean authRequiered) {
		AuthRequiered = authRequiered;
	}
	public Map<String, Uloga> getAuthenticatedMethodsForRole() {
		return authenticatedMethodsForRole;
	}
	public void setAuthenticatedMethodsForRole(Map<String, Uloga> authenticatedMethodsForRole) {
		this.authenticatedMethodsForRole = authenticatedMethodsForRole;
	}
	
	
	
	
	

}
