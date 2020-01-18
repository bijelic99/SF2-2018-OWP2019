package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import model.Identifiable;
import model.Karta;
import model.Korisnik;
import model.Projekcija;
import model.Sediste;

public class KartaDao implements DaoInterface {

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
		Karta karta = null;
		Connection connection = ConnectionManager.getConnection();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		String query = "";

		try {
			query = "select id, projekcija_id, sediste_id, korisnik_id, strftime('%s', datetime(datum_vreme_prodaje)) as datum_vreme_prodaje from karta where id = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, id);
			resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				int i = 1;
				karta = new Karta();
				karta.setId(resultSet.getInt(i++));
				karta.setProjekcija((Projekcija) DaoInterface.projekcijaDao.get(resultSet.getInt(i++)));
				karta.setSediste((Sediste) DaoInterface.sedisteDao.get(resultSet.getInt(i++)));
				karta.setKorisnik((Korisnik) DaoInterface.korisnikDao.get(resultSet.getInt(i++)));
				karta.setDatumVremeProdaje(new Date(resultSet.getLong(i++)*1000));
				
				
			}
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
		return karta;
	}

	@Override
	public ArrayList<Identifiable> get(Predicate<Identifiable> filterFunction) throws Exception {
		// TODO Auto-generated method stub
		return getAll().stream().filter(filterFunction).collect(Collectors.toCollection(ArrayList::new));
	}

	@Override
	public ArrayList<Identifiable> getAll() throws Exception {
		ArrayList<Identifiable> karte = new ArrayList<Identifiable>();
		Connection connection = ConnectionManager.getConnection();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		String query = "";

		try {
			query = "select id, projekcija_id, sediste_id, korisnik_id, strftime('%s', datetime(datum_vreme_prodaje)) as datum_vreme_prodaje from karta where obrisan = false";
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				int i = 1;
				Karta karta = new Karta();
				karta.setId(resultSet.getInt(i++));
				karta.setProjekcija((Projekcija) DaoInterface.projekcijaDao.get(resultSet.getInt(i++)));
				karta.setSediste((Sediste) DaoInterface.sedisteDao.get(resultSet.getInt(i++)));
				karta.setKorisnik((Korisnik) DaoInterface.korisnikDao.get(resultSet.getInt(i++)));
				karta.setDatumVremeProdaje(new Date(resultSet.getLong(i++)*1000));
				
				karte.add(karta);
			}
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
		return karte;
	}

}
