package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.function.Predicate;

import org.eclipse.jdt.internal.compiler.parser.TerminalTokens;

import model.Identifiable;
import model.Karta;
import model.Korisnik;
import model.Projekcija;
import model.Sala;
import model.Sediste;
import model.ZauzetoSediste;

public class SedisteDao implements DaoInterface {

	
	public ArrayList<Sediste> getSedistaForSala(Sala sala) throws Exception {
		ArrayList<Sediste> sedista = new ArrayList<Sediste>();
		Connection connection = ConnectionManager.getConnection();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		String query = "";
		
		try {
			query = "select id, redni_broj from sediste where sala_id = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, sala.getId());
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Sediste sediste = new Sediste();
				sediste.setId(resultSet.getInt(1));
				sediste.setRedniBroj(resultSet.getInt(2));
				sediste.setSala(sala);
				sedista.add(sediste);
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
		
		return sedista;
	}
	
	public ArrayList<ZauzetoSediste> getZauzetostSedistaForProjekcija(int projekcijaId, Connection connection) throws Exception {
		ArrayList<ZauzetoSediste> sedista = new ArrayList<ZauzetoSediste>();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		String query = "";
		
		try {
			query = "select sediste.id, sediste.sala_id, sediste.redni_broj, (case when karta.id is not null then 1 else 0 end ) as zauzeto" + 
					" from projekcija" + 
					" join  sala on sala.id = projekcija.sala_id" + 
					" join sediste on sala.id = sediste.sala_id" + 
					" left join karta on karta.sediste_id = sediste.id and karta.projekcija_id = projekcija.id" + 
					" where projekcija.id = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, projekcijaId);
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				int i = 1;
				ZauzetoSediste sediste = new ZauzetoSediste();
				sediste.setId(resultSet.getInt(i++));
				sediste.setSala((Sala) DaoInterface.salaDao.get(resultSet.getInt(i++)));
				sediste.setRedniBroj(resultSet.getInt(i++));
				sediste.setZauzeto(resultSet.getBoolean(i++));
				sedista.add(sediste);
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
		}
		
		return sedista;
	}
	
	public ArrayList<ZauzetoSediste> getZauzetostSedistaForProjekcija(int projekcijaId) throws Exception {
		Connection connection = ConnectionManager.getConnection();
		try {
			return getZauzetostSedistaForProjekcija(projekcijaId, connection);
		} finally {
			connection.close();
		}
	}
	
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
		Sediste sediste = null;
		Connection connection = ConnectionManager.getConnection();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		String query = "";

		try {
			query = "select id, redni_broj, sala_id from sediste where id = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, id);
			resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				int i = 1;
				sediste = new Sediste();
				sediste.setId(resultSet.getInt(i++));
				sediste.setRedniBroj(resultSet.getInt(i++));
				sediste.setSala((Sala) DaoInterface.salaDao.get(resultSet.getInt(i++)));
				

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
		return sediste;
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

}
