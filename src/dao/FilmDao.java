package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.stream.Collectors;

import model.Film;
import model.Identifiable;
import model.Osoba;
import model.Zanr;

public class FilmDao implements DaoInterface, LogickoBrisanjeDaoInterface {

	@Override
	public int add(Identifiable object) throws Exception {
		Film film = (Film) object;
		Connection connection = ConnectionManager.getConnection();
		PreparedStatement preparedStatement = null;
		String query = "";
		try {
			connection.setAutoCommit(false);
			connection.commit();
			film.setZanrovi(film.getZanrovi().stream().map(z -> {
				try {
					z.setId(DaoInterface.zanrDao.add(z));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return z;
			}).collect(Collectors.toCollection(ArrayList::new)));
			Osoba reziser = film.getReziser();
			reziser.setId(DaoInterface.osobaDao.add(reziser));
			film.setGlumci(film.getGlumci().stream().map(o -> {
				try {
					o.setId(DaoInterface.osobaDao.add(o));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return o;
			}).collect(Collectors.toCollection(ArrayList::new)));

			query = "insert into film(naziv, reziser_id, trajanje, distributer, zemlja_porekla, godina_proizvodnje, opis)"
					+ " values(?, ?, ?, ?, ?, ?, ?);";
			preparedStatement = connection.prepareStatement(query);
			int i = 1;
			preparedStatement.setString(i++, film.getNaziv());
			preparedStatement.setInt(i++, film.getReziser().getId());
			preparedStatement.setInt(i++, film.getTrajanje());
			preparedStatement.setString(i++, film.getDistributer());
			preparedStatement.setString(i++, film.getZemljaPorekla());
			preparedStatement.setInt(i++, film.getGodinaProizvodnje());
			preparedStatement.setString(i++, film.getOpis());
			preparedStatement.executeUpdate();
			preparedStatement.close();
			query = "select last_insert_rowid();";
			preparedStatement = connection.prepareStatement(query);
			film.setId(preparedStatement.executeQuery().getInt(1));
			preparedStatement.close();

			film.getZanrovi().stream().forEach(z -> {
				try {
					String zanrQuery = "insert into film_zanr values(?, ?);";
					PreparedStatement zanrPreparedStatement = connection.prepareStatement(zanrQuery);
					zanrPreparedStatement.setInt(1, film.getId());
					zanrPreparedStatement.setInt(2, z.getId());
					zanrPreparedStatement.executeUpdate();
					zanrPreparedStatement.close();

				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});

			film.getGlumci().stream().forEach(o -> {
				try {
					String zanrQuery = "insert into film_glumac values(?, ?);";
					PreparedStatement zanrPreparedStatement = connection.prepareStatement(zanrQuery);
					zanrPreparedStatement.setInt(1, film.getId());
					zanrPreparedStatement.setInt(2, o.getId());
					zanrPreparedStatement.executeUpdate();
					zanrPreparedStatement.close();
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			});

			connection.commit();
			return film.getId();
		} catch (Exception e) {
			connection.rollback();
			throw e;
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
		Film film = (Film) object;
		Connection connection = ConnectionManager.getConnection();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		String query = "";
		try {
			connection.setAutoCommit(false);
			connection.commit();

			connection.commit();

		} catch (Exception e) {
			connection.rollback();
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
		return false;
	}

	@Override
	public boolean delete(Identifiable object, boolean logickoBrisanje) throws Exception {
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
		Film film = null;
		Connection connection = ConnectionManager.getConnection();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		String query = "";
		try {
			query = "select id, naziv, reziser_id, trajanje, distributer, zemlja_porekla, godina_proizvodnje, opis from film where id = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, id);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				int i = 1;
				film = new Film();
				film.setId(resultSet.getInt(i++));
				film.setNaziv(resultSet.getString(i++));
				film.setReziser((Osoba) DaoInterface.osobaDao.get(resultSet.getInt(i++)));
				film.setTrajanje(resultSet.getInt(i++));
				film.setDistributer(resultSet.getString(i++));
				film.setZemljaPorekla(resultSet.getString(i++));
				film.setGodinaProizvodnje(resultSet.getInt(i++));
				film.setOpis(resultSet.getString(i++));
				film.setZanrovi(DaoInterface.zanrDao.getZanrForFilm(film.getId()));
				film.setGlumci(DaoInterface.osobaDao.getGlumciForFilm(film.getId()));

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
		return film;
	}

	@Override
	public ArrayList<Identifiable> get(FilterInterface filterFunction) throws Exception {
		return getAll().stream().filter(i -> filterFunction.filter(i)).collect(Collectors.toCollection(ArrayList::new));
	}

	@Override
	public ArrayList<Identifiable> getAll() throws Exception {
		ArrayList<Identifiable> filmovi = new ArrayList<Identifiable>();
		Connection connection = ConnectionManager.getConnection();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		String query = "";
		try {
			query = "select id, naziv, reziser_id, trajanje, distributer, zemlja_porekla, godina_proizvodnje, opis from film where obrisan = false";
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				int i = 1;
				Film film = new Film();
				film.setId(resultSet.getInt(i++));
				film.setNaziv(resultSet.getString(i++));
				film.setReziser((Osoba) DaoInterface.osobaDao.get(resultSet.getInt(i++)));
				film.setTrajanje(resultSet.getInt(i++));
				film.setDistributer(resultSet.getString(i++));
				film.setZemljaPorekla(resultSet.getString(i++));
				film.setGodinaProizvodnje(resultSet.getInt(i++));
				film.setOpis(resultSet.getString(i++));
				film.setZanrovi(DaoInterface.zanrDao.getZanrForFilm(film.getId()));
				film.setGlumci(DaoInterface.osobaDao.getGlumciForFilm(film.getId()));
				filmovi.add(film);

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
		return filmovi;
	}

}
