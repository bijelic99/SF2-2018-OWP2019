package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.Identifiable;
import model.Zanr;

public class ZanrDao implements DaoInterface {

	@Override
	public int add(Identifiable object) throws Exception {
		Zanr zanr = (Zanr) object;
		Connection connection = ConnectionManager.getConnection();
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

}
