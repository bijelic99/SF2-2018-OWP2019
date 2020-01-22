package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import model.Identifiable;
import model.Sala;
import model.TipProjekcije;

public class TipProjekcijeDao implements DaoInterface {

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
		TipProjekcije tipProjekcije = null;
		Connection connection = ConnectionManager.getConnection();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		String query = "";
		try {
			query = "select id, naziv from tip_projekcije where id = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, id);
			resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				tipProjekcije = new TipProjekcije();
				tipProjekcije.setId(resultSet.getInt(1));
				tipProjekcije.setNaziv(resultSet.getString(2));
				
				
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
		return tipProjekcije;
	}

	@Override
	public ArrayList<Identifiable> get(Predicate<Identifiable> filterFunction) throws Exception {
		// TODO Auto-generated method stub
		return getAll().stream().filter(filterFunction).collect(Collectors.toCollection(ArrayList::new));
	}

	@Override
	public ArrayList<Identifiable> getAll() throws Exception {
		ArrayList<Identifiable> tipoviProjekcije = new ArrayList<Identifiable>();
		Connection connection = ConnectionManager.getConnection();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		String query = "";
		try {
			query = "select id, naziv from tip_projekcije";
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				TipProjekcije tipProjekcije = new TipProjekcije();
				tipProjekcije.setId(resultSet.getInt(1));
				tipProjekcije.setNaziv(resultSet.getString(2));
				tipoviProjekcije.add(tipProjekcije);
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
		return tipoviProjekcije;
	}
	public ArrayList<TipProjekcije> getTipProjekcijeForSala(int salaId, Connection connection) throws Exception {
		ArrayList<TipProjekcije> tipoviProjekcije = new ArrayList<TipProjekcije>();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		String query = "";
		try {
			query = "select id, naziv from tip_projekcije join tip_projekcije_u_sali on tip_projekcije.id = tip_projekcije_u_sali.tip_projekcije_id where sala_id = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, salaId);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				TipProjekcije tipProjekcije = new TipProjekcije();
				tipProjekcije.setId(resultSet.getInt(1));
				tipProjekcije.setNaziv(resultSet.getString(2));
				tipoviProjekcije.add(tipProjekcije);
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
			

		}
		return tipoviProjekcije;
	}
}
