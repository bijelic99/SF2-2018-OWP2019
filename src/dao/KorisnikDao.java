package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import javax.swing.text.Utilities;

import model.Identifiable;
import model.Korisnik;
import model.Uloga;

public class KorisnikDao implements DaoInterface, LogickoBrisanjeDaoInterface {

	@Override
	public int add(Identifiable object) throws Exception {
		Connection connection = ConnectionManager.getConnection();
		PreparedStatement preparedStatement = null;
		String query = "";
		try {
			Korisnik korisnik = (Korisnik)object;
			query = "insert into korisnik(username, password, uloga_id) values(?, ?, ?)";
			preparedStatement = connection.prepareStatement(query);
			int i = 1;
			preparedStatement.setString(i++, korisnik.getUsername());
			preparedStatement.setString(i++, korisnik.getPassword());
			preparedStatement.setInt(i++, korisnik.getUloga().getId());
			preparedStatement.executeUpdate();
			preparedStatement.close();
			
			query = "select last_insert_rowid();";
			preparedStatement = connection.prepareStatement(query);
			korisnik.setId(preparedStatement.executeQuery().getInt(1));
			return korisnik.getId();

		} finally {
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
	public boolean update(Identifiable object) throws Exception {
		Connection connection = ConnectionManager.getConnection();
		PreparedStatement preparedStatement = null;
		String query = "";
		try {
			Korisnik korisnik = (Korisnik)object;
			query = "update korisnik set username = ?, password = ?, uloga_id = ?, obrisan = ? where id = ?";
			preparedStatement = connection.prepareStatement(query);
			int i = 1;
			preparedStatement.setString(i++, korisnik.getUsername());
			preparedStatement.setString(i++, korisnik.getPassword());
			preparedStatement.setInt(i++, korisnik.getUloga().getId());
			preparedStatement.setBoolean(i++, korisnik.getObrisan());
			preparedStatement.setInt(i++, korisnik.getId());
			preparedStatement.executeUpdate();
			preparedStatement.close();
			
		
			return true;

		} finally {
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
	public boolean delete(Identifiable object) throws Exception {
		Connection connection = ConnectionManager.getConnection();
		PreparedStatement preparedStatement = null;
		String query = "";
		try {
			Korisnik korisnik = (Korisnik)object;
			query = "delete from korisnik where id = ?";
			preparedStatement = connection.prepareStatement(query);
			int i = 1;
			preparedStatement.setInt(i++, korisnik.getId());
			preparedStatement.executeUpdate();
			preparedStatement.close();
			
		
			return true;

		} finally {
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
	public Identifiable get(int id) throws Exception {
		Connection connection = ConnectionManager.getConnection();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		String query = "";
		try {
			query = "select id, username, password, strftime('%s', datetime(datum_registracije)) as datum_registracije, uloga_id, obrisan from korisnik where id = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, id);
			resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				int i = 1;
				Korisnik korisnik = new Korisnik();
				korisnik.setId(resultSet.getInt(i++));
				korisnik.setUsername(resultSet.getString(i++));
				korisnik.setPassword(resultSet.getString(i++));
				korisnik.setDatumRegistracije(new java.util.Date(resultSet.getLong(i++)));
				korisnik.setUloga(Uloga.getById(resultSet.getInt(i++)));
				korisnik.setObrisan(resultSet.getBoolean(i++));
				return korisnik;
				

			} else throw new Exception("Korisnik nije pronadjen");

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
		
		
	}

	@Override
	public ArrayList<Identifiable> get(Predicate<Identifiable> filterFunction) throws Exception {
		return getAll().stream().filter(filterFunction).collect(Collectors.toCollection(ArrayList::new));
	}

	@Override
	public ArrayList<Identifiable> getAll() throws Exception {
		ArrayList<Identifiable> korisnici = new ArrayList<Identifiable>();
		Connection connection = ConnectionManager.getConnection();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		String query = "";
		try {
			query = "select id, username, password,  strftime('%s', datetime(datum_registracije)) as datum_registracije, uloga_id, obrisan from korisnik where obrisan = false;";
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				int i = 1;
				Korisnik korisnik = new Korisnik();
				korisnik.setId(resultSet.getInt(i++));
				korisnik.setUsername(resultSet.getString(i++));
				korisnik.setPassword(resultSet.getString(i++));
				korisnik.setDatumRegistracije(new java.util.Date(resultSet.getLong(i++)));
				korisnik.setUloga(Uloga.getById(resultSet.getInt(i++)));
				korisnik.setObrisan(resultSet.getBoolean(i++));
				korisnici.add(korisnik);
				

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
		
		return korisnici;
	}

	@Override
	public boolean delete(Identifiable object, boolean logickoBrisanje) throws Exception {
		if(logickoBrisanje) {
			((Korisnik)object).setObrisan(true);
			update(object);
		}
		else delete(object);
		return true;
	}

}
