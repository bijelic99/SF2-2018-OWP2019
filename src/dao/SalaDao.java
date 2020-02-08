package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import model.Identifiable;
import model.Sala;

public class SalaDao implements DaoInterface {

	@Override
	public int add(Identifiable object) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean update(Identifiable object) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Identifiable object) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Identifiable get(int id) throws Exception {
		Sala sala = null;
		Connection connection = ConnectionManager.getConnection();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		String query = "";
		try {
			query = "select id, naziv from sala where id = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, id);
			resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				sala = new Sala();
				sala.setId(resultSet.getInt(1));
				sala.setNaziv(resultSet.getString(2));
				sala.setPodrzaniTipoviProjekcija(DaoInterface.tipProjekcijeDao.getTipProjekcijeForSala(sala.getId(), connection));
				
				
			}

		} catch (Exception e) {

			throw e;
		} finally {
			try {
				resultSet.close();
			} catch (Exception e) {

			}
			try {
				preparedStatement.close();
			} catch (Exception e) {

			}
			try {
				connection.close();
			} catch (Exception e) {

			}

		}
		
		return sala;
	}

	@Override
	public ArrayList<Identifiable> get(Predicate<Identifiable> filterFunction) throws Exception {
		// TODO Auto-generated method stub
		return getAll().stream().filter(filterFunction).collect(Collectors.toCollection(ArrayList::new));
	}

	@Override
	public ArrayList<Identifiable> getAll() throws Exception {
		ArrayList<Identifiable> sale = new ArrayList<Identifiable>();
		Connection connection = ConnectionManager.getConnection();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		String query = "";
		try {
			query = "select id, naziv from sala";
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				Sala sala = new Sala();
				sala.setId(resultSet.getInt(1));
				sala.setNaziv(resultSet.getString(2));
				sala.setPodrzaniTipoviProjekcija(DaoInterface.tipProjekcijeDao.getTipProjekcijeForSala(sala.getId(), connection));
				
				sale.add(sala);
			}

		} catch (Exception e) {

			throw e;
		} finally {
			try {
				resultSet.close();
			} catch (Exception e) {

			}
			try {
				preparedStatement.close();
			} catch (Exception e) {

			}
			try {
				connection.close();
			} catch (Exception e) {

			}

		}
		return sale;
	}
	
	public boolean checkIfSalaIsFree(int salaId, Date startDate, Date endDate, Connection connection) throws Exception{
		PreparedStatement preparedStatement = null;
		String query = "";
		try {
			//treba testirati
			query = "select sala.id from projekcija join sala on projekcija.id = sala.id "
					+ "join film on film.id = projekcija.film_id "
					+ "where sala.id = ? and projekcija.datum_vreme_projekcije <= ? "
					+ "and (DATETIME(projekcija.datum_vreme_projekcije, ('+' || film.trajanje || ' seconds'))) >= ?";
			preparedStatement = connection.prepareStatement(query);
			int i = 1;
			preparedStatement.setInt(i++, salaId);
			preparedStatement.setDate(i++, new java.sql.Date(startDate.getTime()));
			preparedStatement.setDate(i++, new java.sql.Date(endDate.getTime()));
			
			return !preparedStatement.executeQuery().next();

		} catch (Exception e) {

			throw e;
		} finally {
			try {
				preparedStatement.close();
			} catch (Exception e) {

			}

		}
	}
	
	public boolean checkIfSalaIsFree(int salaId, int projekcijaId, Date startDate, Date endDate, Connection connection) throws Exception{
		PreparedStatement preparedStatement = null;
		String query = "";
		try {
			//treba testirati
			query = "select sala.id from projekcija join sala on projekcija.id = sala.id "
					+ "join film on film.id = projekcija.film_id "
					+ "where projekcija.id != ? and sala.id = ? and projekcija.datum_vreme_projekcije <= ? "
					+ "and (DATETIME(projekcija.datum_vreme_projekcije, ('+' || film.trajanje || ' seconds'))) >= ?";
			preparedStatement = connection.prepareStatement(query);
			int i = 1;
			preparedStatement.setInt(i++, projekcijaId);
			preparedStatement.setInt(i++, salaId);
			preparedStatement.setDate(i++, new java.sql.Date(startDate.getTime()));
			preparedStatement.setDate(i++, new java.sql.Date(endDate.getTime()));
			
			return !preparedStatement.executeQuery().next();

		} catch (Exception e) {

			throw e;
		} finally {
			try {
				preparedStatement.close();
			} catch (Exception e) {

			}

		}
	}

}
