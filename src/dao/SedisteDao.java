package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.function.Predicate;

import model.Identifiable;
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
	
	public ArrayList<ZauzetoSediste> getZauzetostSedistaForSala(Sala sala, int terminId){
		return null;
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

}
