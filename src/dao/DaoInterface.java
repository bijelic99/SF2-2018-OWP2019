package dao;

import java.util.ArrayList;

import model.Identifiable;

public interface DaoInterface {
	
	public int add(Identifiable object) throws Exception;
	public boolean update(Identifiable object);
	public boolean delete(Identifiable object);
	public Identifiable get(int id) throws Exception;
	public ArrayList<Identifiable> get(FilterInterface filterFunction) throws Exception;
	public ArrayList<Identifiable> getAll() throws Exception;
	
}
