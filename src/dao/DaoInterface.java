package dao;

import java.util.ArrayList;
import java.util.function.Predicate;

import model.Identifiable;

public interface DaoInterface {
	
	public int add(Identifiable object) throws Exception;
	public boolean update(Identifiable object) throws Exception;
	public boolean delete(Identifiable object) throws Exception;
	public Identifiable get(int id) throws Exception;
	public ArrayList<Identifiable> get(Predicate<Identifiable> filterFunction) throws Exception;
	public ArrayList<Identifiable> getAll() throws Exception;
	
	public static FilmDao filmDao = new FilmDao();
	public static ZanrDao zanrDao = new ZanrDao();
	public static OsobaDao osobaDao = new OsobaDao();
	public static KorisnikDao korisnikDao = new KorisnikDao();
	public static ProjekcijaDao projekcijaDao = new ProjekcijaDao();
	
}
