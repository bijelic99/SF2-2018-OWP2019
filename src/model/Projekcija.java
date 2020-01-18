package model;

import java.util.Date;

public class Projekcija extends Identifiable {
	
	private Film film;
	private TipProjekcije tipProjekcije;
	private Sala sala;
	private Date datumVremePrikazivanja = new Date();
	private double cenaKarte;
	private Boolean obrisan;
	
	public Projekcija(int id, Film film, TipProjekcije tipProjekcije, Sala sala, Date datumVremePrikazivanja,
			double cenaKarte, boolean obrisan) {
		super(id);
		this.film = film;
		this.tipProjekcije = tipProjekcije;
		this.sala = sala;
		this.datumVremePrikazivanja = datumVremePrikazivanja;
		this.cenaKarte = cenaKarte;
		this.obrisan = obrisan;
	}
	public Projekcija() {
		this(0, new Film(), new TipProjekcije(), new Sala(), new Date(), 0.0, false);
	}
	public Film getFilm() {
		return film;
	}
	public void setFilm(Film film) {
		this.film = film;
	}
	public TipProjekcije getTipProjekcije() {
		return tipProjekcije;
	}
	public void setTipProjekcije(TipProjekcije tipProjekcije) {
		this.tipProjekcije = tipProjekcije;
	}
	public Sala getSala() {
		return sala;
	}
	public void setSala(Sala sala) {
		this.sala = sala;
	}
	public Date getDatumVremePrikazivanja() {
		return datumVremePrikazivanja;
	}
	public void setDatumVremePrikazivanja(Date datumVremePrikazivanja) {
		this.datumVremePrikazivanja = datumVremePrikazivanja;
	}
	public double getCenaKarte() {
		return cenaKarte;
	}
	public void setCenaKarte(double cenaKarte) {
		this.cenaKarte = cenaKarte;
	}
	public Boolean getObrisan() {
		return obrisan;
	}
	public void setObrisan(Boolean obrisan) {
		this.obrisan = obrisan;
	}
	
	

}
