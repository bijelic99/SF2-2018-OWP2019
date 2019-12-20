package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.function.Predicate;

import model.Film;
import model.Identifiable;
import model.Korisnik;
import model.Osoba;
import model.Uloga;

public class KorisnikDao implements DaoInterface {

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
		Connection connection = ConnectionManager.getConnection();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		String query = "";
		try {
			query = "select id, username, password, datum_registracije, uloga_id, obrisan from korisnik where id = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, id);
			resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				int i = 1;
				Korisnik korisnik = new Korisnik();
				korisnik.setId(resultSet.getInt(i++));
				korisnik.setUsername(resultSet.getString(i++));
				korisnik.setPassword(resultSet.getString(i++));
				korisnik.setDatumRegistracije(new Date(resultSet.getDate(i++).getTime()));
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Identifiable> getAll() throws Exception {
		ArrayList<Identifiable> korisnici = new ArrayList<Identifiable>();
		Connection connection = ConnectionManager.getConnection();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		String query = "";
		try {
			query = "select id, username, password, datum_registracije, uloga_id, obrisan from korisnik where obrisan = false;";
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				int i = 1;
				Korisnik korisnik = new Korisnik();
				korisnik.setId(resultSet.getInt(i++));
				korisnik.setUsername(resultSet.getString(i++));
				korisnik.setPassword(resultSet.getString(i++));
				korisnik.setDatumRegistracije(new Date(resultSet.getDate(i++).getTime()));
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

}
