package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import model.Film;
import model.Identifiable;
import model.Osoba;
import model.Zanr;
import model.Projekcija;

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
			
			query = "insert into film_slika values(?, ?)";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, film.getId());
			preparedStatement.setString(2, film.getPathDoSlike());
			preparedStatement.executeUpdate();

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
		String query = "";
		try {
			connection.setAutoCommit(false);
			connection.commit();

			film.setGlumci(film.getGlumci().stream().map(o -> {
				try {
					o.setId(DaoInterface.osobaDao.add(o,connection));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return o;
			}).collect(Collectors.toCollection(ArrayList::new)));

			String glumci = film.getGlumci().stream().map(o -> o.getId()+"").reduce("", (ids, id)-> ids+id+", ");
			glumci = glumci.trim();
			glumci = glumci.substring(0, glumci.length()-1);
			
			//System.out.println(glumci);
			query = "delete from film_glumac where film_id = ? and glumac_id not in ( "+glumci+" )";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, film.getId());
			preparedStatement.executeUpdate();
			preparedStatement.close();
			
			for(Osoba o : film.getGlumci()) {
				query = "INSERT OR IGNORE INTO film_glumac " + 
						"values(?,?)";
				preparedStatement = connection.prepareStatement(query);
				preparedStatement.setInt(1, film.getId());
				preparedStatement.setInt(2, o.getId());
				preparedStatement.executeUpdate();
				preparedStatement.close();
				}

			film.setZanrovi(film.getZanrovi().stream().map(z -> {
				try {
					z.setId(DaoInterface.zanrDao.add(z, connection));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return z;
			}).collect(Collectors.toCollection(ArrayList::new)));

			String zanrovi = film.getZanrovi().stream().map(z -> z.getId()+"").reduce("", (ids, id) -> ids+id+", ");
			zanrovi = zanrovi.trim();
			zanrovi = zanrovi.substring(0, zanrovi.length()-1);
			
			//System.out.println(zanrovi);
			query = "delete from film_zanr where film_id = ? and zanr_id not in ( "+zanrovi+" )";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, film.getId());
			preparedStatement.executeUpdate();
			preparedStatement.close();
			
			for(Zanr z : film.getZanrovi()) {
				query = "INSERT OR IGNORE INTO film_zanr " + 
						"values(?,?)";
				preparedStatement = connection.prepareStatement(query);
				preparedStatement.setInt(1, film.getId());
				preparedStatement.setInt(2, z.getId());
				preparedStatement.executeUpdate();
				preparedStatement.close();
				}
			
			
			if(film.getReziser().getId() != 0) film.getReziser().setId(DaoInterface.osobaDao.add(film.getReziser()));
			
			query = "update film_slika set linkDoSlike = ? where film_id = ?";
			preparedStatement.setString(1, film.getPathDoSlike());
			preparedStatement.setInt(2, film.getId());
			preparedStatement.executeUpdate();
			preparedStatement.close();
			
			
			query = "update film set naziv = ?,"
					+ ( film.getReziser().getId() != 0 ? " reziser_id = ?," : ", ")
					+ " trajanje = ?, distributer = ?,"
					+ " zemlja_porekla = ?, godina_proizvodnje = ?,"
					+ " opis = ?, obrisan = ? where id = ?";
			preparedStatement = connection.prepareStatement(query);
			int i = 1;
			preparedStatement.setString(i++, film.getNaziv());
			if(film.getReziser().getId() != 0) preparedStatement.setInt(i++, film.getReziser().getId());
			preparedStatement.setInt(i++, film.getTrajanje());
			preparedStatement.setString(i++, film.getDistributer());
			preparedStatement.setString(i++, film.getZemljaPorekla());
			preparedStatement.setInt(i++, film.getGodinaProizvodnje());
			preparedStatement.setString(i++, film.getOpis());
			preparedStatement.setBoolean(i++, film.getObrisan());
			preparedStatement.setInt(i++, film.getId());
			preparedStatement.executeUpdate();
			
			connection.commit();
			return true;
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
	public boolean delete(Identifiable object, boolean logickoBrisanje) throws Exception {
		if(logickoBrisanje) {
			Film f = (Film)object;
			f.setObrisan(true);
			return update(f);
		}
		else return delete(object);
	}

	@Override
	public boolean delete(Identifiable object) throws Exception {
		Film film = (Film) object;
		Connection connection = ConnectionManager.getConnection();
		PreparedStatement preparedStatement = null;
		String query = "";
		try {
			connection.setAutoCommit(false);
			connection.commit();

			
			query = "delete from film_glumac where film_id = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, film.getId());
			preparedStatement.executeUpdate();
			preparedStatement.close();

			
			query = "delete from film_zanr where film_id = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, film.getId());
			preparedStatement.executeUpdate();
			preparedStatement.close();
			
			query = "delete from film_slika where film_id = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, film.getId());
			preparedStatement.executeUpdate();
			
			query = "delete from film where id = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, film.getId());
			preparedStatement.executeUpdate();
			
			
			
			connection.commit();
			return true;
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
	public Identifiable get(int id) throws Exception {
		Film film = null;
		Connection connection = ConnectionManager.getConnection();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		String query = "";
		try {
			query = "select id, naziv, reziser_id, trajanje, distributer, zemlja_porekla, godina_proizvodnje, opis, ifnull(linkDoSlike, '') from film left join film_slika on film.id = film_slika.film_id where id = ?";
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
				film.setPathDoSlike(resultSet.getString(i++));

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
	public ArrayList<Identifiable> get(Predicate<Identifiable> filterFunction) throws Exception {
		return getAll().stream().filter(filterFunction).collect(Collectors.toCollection(ArrayList::new));
	}

	@Override
	public ArrayList<Identifiable> getAll() throws Exception {
		ArrayList<Identifiable> filmovi = new ArrayList<Identifiable>();
		Connection connection = ConnectionManager.getConnection();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		String query = "";
		try {
			query = "select id, naziv, reziser_id, trajanje, distributer, zemlja_porekla, godina_proizvodnje, opis, ifnull(linkDoSlike, '') from film left join film_slika on film.id = film_slika.film_id where obrisan = false";
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
				film.setPathDoSlike(resultSet.getString(i++));
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
	
	public Boolean filmHasProjections(int filmId) throws Exception {
		return DaoInterface.projekcijaDao.get(p-> ((Projekcija)p).getFilm().getId() == filmId).isEmpty();
	}

}
