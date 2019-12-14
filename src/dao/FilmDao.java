package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.stream.Collectors;

import model.Film;
import model.Identifiable;
import model.Osoba;

public class FilmDao implements DaoInterface, LogickoBrisanjeDaoInterface {

	@Override
	public int add(Identifiable object) throws Exception {
		Film film = (Film)object;
		Connection connection = ConnectionManager.getConnection();
		PreparedStatement preparedStatement = null;
		String query = "";
		try {
			connection.setAutoCommit(false);
			connection.commit();
			film.setZanrovi(film.getZanrovi().stream().map(z -> {
				try {
					z.setId(DaoInterface.zanrDao.add(z));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} return z;}).collect(Collectors.toCollection(ArrayList::new)));
			Osoba reziser = film.getReziser();
			reziser.setId(DaoInterface.osobaDao.add(reziser));
			film.setGlumci(film.getGlumci().stream().map(o->{
				try {
					o.setId(DaoInterface.osobaDao.add(o));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return o;
			}).collect(Collectors.toCollection(ArrayList::new)));
			
			query = "insert into film(naziv, reziser_id, trajanje, distributer, zemlja_porekla, godina_proizvodnje, opis)"
					+ " values(?, ?, ?, ?, ?, ?, ?);"
					+ "select last_insert_rowid() from film;";
			preparedStatement = connection.prepareStatement(query);
			int i=0;
			preparedStatement.setString(i++, film.getNaziv());
			preparedStatement.setInt(i++, film.getReziser().getId());
			preparedStatement.setInt(i++, film.getTrajanje());
			preparedStatement.setString(i++, film.getDistributer());
			preparedStatement.setString(i++, film.getZemljaPorekla());
			preparedStatement.setInt(i++, film.getGodinaProizvodnje());
			preparedStatement.setString(i++, film.getOpis());
			
			film.setId(preparedStatement.executeQuery().getInt(1));
			preparedStatement.close();
			
			film.getZanrovi().stream().forEach(z->{
				try {
					String zanrQuery = "insert into film_zanr values(?, ?);";
					PreparedStatement zanrPreparedStatement = connection.prepareStatement(zanrQuery);
					zanrPreparedStatement.setInt(1, film.getId());
					zanrPreparedStatement.setInt(2, z.getId());
					zanrPreparedStatement.executeUpdate();
					zanrPreparedStatement.close();
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
			
			film.getGlumci().stream().forEach(o->{
				try {
					String zanrQuery = "insert into film_glumac values(?, ?);";
					PreparedStatement zanrPreparedStatement = connection.prepareStatement(zanrQuery);
					zanrPreparedStatement.setInt(1, film.getId());
					zanrPreparedStatement.setInt(2, o.getId());
					zanrPreparedStatement.executeUpdate();
					zanrPreparedStatement.close();
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			});
			
			connection.commit();
			return film.getId();
		}
		catch(Exception e){
			connection.rollback();
			throw e;
		}
		finally {
			try {
				preparedStatement.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}

	@Override
	public boolean update(Identifiable object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Identifiable object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Identifiable get(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Identifiable> get(FilterInterface filterFunction) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Identifiable> getAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Identifiable object, boolean logickoBrisanje) {
		// TODO Auto-generated method stub
		return false;
	}

}
