package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.Identifiable;
import model.Osoba;
import model.Zanr;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class OsobaDao implements DaoInterface {

	@Override
	public int add(Identifiable object) throws Exception {
		Osoba osoba = (Osoba) object;
		Connection connection = ConnectionManager.getConnection();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			connection.setAutoCommit(false);
			connection.commit();
			String query = "Select count(*) from osoba where lower(osoba.ime_prezime) = lower(?)";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, osoba.getNaziv());
			resultSet = preparedStatement.executeQuery();

			if (resultSet.getInt(1) > 0) {
				preparedStatement.close();
				connection.rollback();

			} else {
				preparedStatement.close();
				query = "insert into osoba(ime_prezime) values(?);";
				preparedStatement = connection.prepareStatement(query);
				preparedStatement.setString(1, osoba.getNaziv());
				preparedStatement.executeUpdate();

				connection.commit();
			}
			query = "select id from osoba where lower(osoba.ime_prezime) = lower(?)";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, osoba.getNaziv());
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

	@Override
	public boolean update(Identifiable object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Identifiable object) {
		// TODO Auto-generated method stub
		throw new NotImplementedException();
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

	public ArrayList<Osoba> getGlumciForFilm(int id) throws Exception{
		ArrayList<Osoba> osobe = new ArrayList<Osoba>();
		Connection connection = ConnectionManager.getConnection();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		String query = "";
		try {
			query = "select glumac_id, ime_prezime from film_glumac join osoba on glumac_id = id where film_id = ?;";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, id);
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Osoba osoba = new Osoba();
				osoba.setId(resultSet.getInt(1));
				osoba.setNaziv(resultSet.getString(2));
				osobe.add(osoba);
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
		return osobe;
	}

}
