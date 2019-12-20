package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.function.Predicate;

import model.Film;
import model.Identifiable;
import model.Osoba;
import model.Zanr;

public class ZanrDao implements DaoInterface {
	
	@Override
	public int add(Identifiable object) throws Exception {
		Zanr zanr = (Zanr) object;
		Connection connection = ConnectionManager.getConnection();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {

			
			String query = "Select count(*) from zanr where lower(zanr.naziv) = lower(?)";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, zanr.getNaziv());
			resultSet = preparedStatement.executeQuery();

			if (resultSet.getInt(1) > 0) {
				preparedStatement.close();
				connection.rollback();

			} else {
				preparedStatement.close();
				query = "insert into zanr(naziv) values(?);";
				preparedStatement = connection.prepareStatement(query);
				preparedStatement.setString(1, zanr.getNaziv());
				preparedStatement.executeUpdate();

				
			}
			query = "select id from zanr where lower(zanr.naziv) = lower(?)";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, zanr.getNaziv());
			return preparedStatement.executeQuery().getInt(1);

		} finally {
			try {
				resultSet.close();
			} catch (Exception e1) {

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

	}

	public int add(Identifiable object, Connection connection) throws Exception {
		// Da bi radila sa transakcijom prosledjuje se connection, ne zatvara je
		Zanr zanr = (Zanr) object;

		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {

			connection.setAutoCommit(false);
			connection.commit();
			String query = "Select count(*) from zanr where lower(zanr.naziv) = lower(?)";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, zanr.getNaziv());
			resultSet = preparedStatement.executeQuery();

			if (resultSet.getInt(1) > 0) {
				preparedStatement.close();
				connection.rollback();

			} else {
				preparedStatement.close();
				query = "insert into zanr(naziv) values(?);";
				preparedStatement = connection.prepareStatement(query);
				preparedStatement.setString(1, zanr.getNaziv());
				preparedStatement.executeUpdate();

				connection.commit();
			}
			query = "select id from zanr where lower(zanr.naziv) = lower(?)";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, zanr.getNaziv());
			return preparedStatement.executeQuery().getInt(1);

		} finally {
			try {
				resultSet.close();
			} catch (Exception e1) {

			}
			try {
				preparedStatement.close();
			} catch (Exception e) {

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
	public ArrayList<Identifiable> get(Predicate<Identifiable> filterFunction) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Identifiable> getAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Zanr> getZanrForFilm(int filmId) throws Exception {
		ArrayList<Zanr> zanrovi = new ArrayList<Zanr>();
		Connection connection = ConnectionManager.getConnection();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		String query = "";
		try {
			query = "select zanr_id, naziv from film_zanr join zanr on zanr_id = id where film_id = ? ";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, filmId);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				Zanr zanr = new Zanr();
				zanr.setId(resultSet.getInt(1));
				zanr.setNaziv(resultSet.getString(2));
				zanrovi.add(zanr);
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
		return zanrovi;
	}

}
