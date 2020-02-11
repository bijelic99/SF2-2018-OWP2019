package controller;

import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import dao.ConnectionManager;
import dao.DaoInterface;
import model.Film;
import model.Korisnik;
import model.Osoba;
import model.Zanr;

/**
 * Application Lifecycle Listener implementation class InitListener
 *
 */
public class InitListener implements ServletContextListener {

	/**
	 * Default constructor.
	 */
	public InitListener() {
		
		
		
		
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		ConnectionManager.open(arg0.getServletContext().getRealPath("/"));
		System.out.println("Povezano");
		ServletContext sc = arg0.getServletContext();
		HashMap<Integer, Korisnik> hmk = new HashMap<Integer, Korisnik>();
		sc.setAttribute("izmenjeniKorisnci", hmk);	
		}

}
