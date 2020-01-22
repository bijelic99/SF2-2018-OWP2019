package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.function.Predicate;
import java.util.stream.Collectors;


import model.Film;
import model.Identifiable;
import model.Projekcija;
import model.Sala;
import model.TipProjekcije;

public class ProjekcijaDao implements DaoInterface, LogickoBrisanjeDaoInterface {

	@Override
	public int add(Identifiable object) throws Exception {
		Projekcija projekcija = (Projekcija) object;
		Connection connection = ConnectionManager.getConnection();
		PreparedStatement preparedStatement = null;
		String query = "";

		try {
			connection.setAutoCommit(false);
			connection.commit();
			
			
			
			query = "insert into projekcija(film_id, tip_projekcije_id, sala_id, datum_vreme_projekcije, cene_karte) values(?, ?, ?, ?)";
			int i = 1;
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(i++, projekcija.getFilm().getId());
			preparedStatement.setInt(i++, projekcija.getTipProjekcije().getId());
			preparedStatement.setInt(i++, projekcija.getSala().getId());
			preparedStatement.setDate(i++, new java.sql.Date(projekcija.getDatumVremePrikazivanja().getTime()));
			preparedStatement.setDouble(i++, projekcija.getCenaKarte());
			preparedStatement.executeUpdate();
			
			if(!projekcija.getSala().getPodrzaniTipoviProjekcija().contains(projekcija.getTipProjekcije())) {
				connection.rollback();
				throw new Exception("Sala ne podrzava taj tip projekcije");
			}
			if(projekcija.getDatumVremePrikazivanja().before(new Date())) {
				connection.rollback();
				throw new Exception("Nije moguce rezervisati salu u proslosti");
			}
			if(!DaoInterface.salaDao.checkIfSalaIsFree(projekcija.getSala().getId(), 
					projekcija.getDatumVremePrikazivanja(), 
					new Date(projekcija.getDatumVremePrikazivanja().getTime() + projekcija.getFilm().getTrajanje()*1000), 
					connection)){
				connection.rollback();
				throw new Exception("Nije moguce rezervisati termin, sala nije slobodna");
			}
			
			connection.commit();
			preparedStatement.close();

			query = "select last_insert_rowid();";
			preparedStatement = connection.prepareStatement(query);
			projekcija.setId(preparedStatement.executeQuery().getInt(1));
			preparedStatement.close();

			return projekcija.getId();

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
		Projekcija projekcija = (Projekcija) object;
		Connection connection = ConnectionManager.getConnection();
		PreparedStatement preparedStatement = null;
		String query = "";

		try {
			connection.setAutoCommit(false);
			connection.commit();
			
			query = "update projekcija set film_id = ?, tip_projekcije_id = ?, sala_id = ?, datum_vreme_projekcije = ?, cene_karte = ?, obrisan = ?";
			int i = 1;
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(i++, projekcija.getFilm().getId());
			preparedStatement.setInt(i++, projekcija.getTipProjekcije().getId());
			preparedStatement.setInt(i++, projekcija.getSala().getId());
			preparedStatement.setDate(i++, new java.sql.Date(projekcija.getDatumVremePrikazivanja().getTime()));
			preparedStatement.setDouble(i++, projekcija.getCenaKarte());
			preparedStatement.setBoolean(i++, projekcija.getObrisan());
			preparedStatement.executeUpdate();
			
			if(!projekcija.getSala().getPodrzaniTipoviProjekcija().contains(projekcija.getTipProjekcije())) {
				connection.rollback();
				throw new Exception("Sala ne podrzava taj tip projekcije");
			}
			if(projekcija.getDatumVremePrikazivanja().before(new Date())) {
				connection.rollback();
				throw new Exception("Nije moguce rezervisati termin u proslosti");
			}
			if(!DaoInterface.salaDao.checkIfSalaIsFree(projekcija.getSala().getId(), projekcija.getId(), 
					projekcija.getDatumVremePrikazivanja(), 
					new Date(projekcija.getDatumVremePrikazivanja().getTime() + projekcija.getFilm().getTrajanje()*1000), 
					connection)){
				connection.rollback();
				throw new Exception("Nije moguce rezervisati termin, sala nije slobodna");
			}
			
			connection.commit();
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
		Projekcija projekcija = (Projekcija) object;
		Connection connection = ConnectionManager.getConnection();
		PreparedStatement preparedStatement = null;
		String query = "";
		
		try {
			query = "delete from projekcija where id = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, projekcija.getId());
			preparedStatement.executeUpdate();

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
		Projekcija projekcija = null;
		Connection connection = ConnectionManager.getConnection();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		String query = "";

		try {
			query = "select id, film_id, tip_projekcije_id, sala_id, strftime('%s', datetime(datum_vreme_projekcije)) as datum_vreme_projekcije, cena_karte from projekcija where id = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, id);
			resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				int i = 1;
				projekcija = new Projekcija();
				projekcija.setId(resultSet.getInt(i++));
				projekcija.setFilm((Film) DaoInterface.filmDao.get(resultSet.getInt(i++)));
				projekcija.setTipProjekcije((TipProjekcije) DaoInterface.tipProjekcijeDao.get(resultSet.getInt(i++)));
				projekcija.setSala((Sala) DaoInterface.salaDao.get(resultSet.getInt(i++)));
				projekcija.setDatumVremePrikazivanja(new Date(resultSet.getLong(i++) * 1000));
				projekcija.setCenaKarte(resultSet.getDouble(i++));
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

		return projekcija;
	}

	@Override
	public ArrayList<Identifiable> get(Predicate<Identifiable> filterFunction) throws Exception {
		// TODO Auto-generated method stub
		return getAll().stream().filter(filterFunction).collect(Collectors.toCollection(ArrayList::new));
	}

	@Override
	public ArrayList<Identifiable> getAll() throws Exception {
		ArrayList<Identifiable> projekcije = new ArrayList<Identifiable>();
		Connection connection = ConnectionManager.getConnection();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		String query = "";

		try {
			query = "select id, film_id, tip_projekcije_id, sala_id, strftime('%s', datetime(datum_vreme_projekcije)) as datum_vreme_projekcije, cena_karte from projekcija where obrisan = false;";
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				int i = 1;
				Projekcija projekcija = new Projekcija();
				projekcija.setId(resultSet.getInt(i++));
				projekcija.setFilm((Film) DaoInterface.filmDao.get(resultSet.getInt(i++)));
				projekcija.setTipProjekcije((TipProjekcije) DaoInterface.tipProjekcijeDao.get(resultSet.getInt(i++)));
				projekcija.setSala((Sala) DaoInterface.salaDao.get(resultSet.getInt(i++)));
				projekcija.setDatumVremePrikazivanja(new Date(resultSet.getLong(i++) * 1000));
				projekcija.setCenaKarte(resultSet.getDouble(i++));

				projekcije.add(projekcija);
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
		return projekcije;

	}

	@Override
	public boolean delete(Identifiable object, boolean logickoBrisanje) throws Exception {
		if(logickoBrisanje) {
			Projekcija p  = (Projekcija)object;
			p.setObrisan(true);
			return update(p);
		}
		else return delete(object);
	}

}
