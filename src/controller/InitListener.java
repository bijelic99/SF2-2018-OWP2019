package controller;

import java.util.ArrayList;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import dao.ConnectionManager;
import dao.DaoInterface;
import model.Film;
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
		// TODO Auto-generated constructor stub
		ConnectionManager.open();
		System.out.println("Povezano");
		
		System.out.println();
		/*
		 * //test Film f = new Film(); f.setNaziv("testFilm"); f.setReziser(new
		 * Osoba(0,"Test")); ArrayList<Osoba> glumci = new ArrayList<Osoba>();
		 * glumci.add(new Osoba(0,"Test")); glumci.add(new Osoba(0,"Dejan"));
		 * glumci.add(new Osoba(0, "Letitia Dean")); f.setGlumci(glumci);
		 * ArrayList<Zanr> zanrovi = new ArrayList<Zanr>(); zanrovi.add(new
		 * Zanr(0,"Komedija")); zanrovi.add(new Zanr(0,"Horor")); zanrovi.add(new
		 * Zanr(0,"Murder Mystery")); f.setZanrovi(zanrovi);
		 * f.setGodinaProizvodnje(2019); f.setTrajanje(121*60);
		 * 
		 * try { DaoInterface.filmDao.add(f); } catch (Exception e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
//		try {
//			DaoInterface.filmDao.getAll().stream().forEach(f -> {
//				System.out.println(f.toString());
//				try {
//					System.out.println(((Film)f).getReziser().getNaziv());
//					
//					if(((Film)f).getId() == 21) {
//						Film film = (Film)f;
//						ArrayList<Osoba> a = new ArrayList<Osoba>();
//						a.add(new Osoba(5, "Mario"));
//						a.add(new Osoba(5, "Luigi"));
//						film.setGlumci(a);
//						ArrayList<Zanr> b = new ArrayList<Zanr>();
//						b.add(new Zanr(4,"horor"));
//						b.add(new Zanr(4,"tragikomedija"));
//						film.setZanrovi(b);
//						DaoInterface.filmDao.update(film);
//					}
//					
//				} catch (Exception e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			});
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			System.out.println(DaoInterface.osobaDao.add(new Osoba(1, "test")));
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		// TODO Auto-generated method stub

	}

}
