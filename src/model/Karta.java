package model;

import java.util.Date;

public class Karta extends Identifiable {
	private Projekcija projekcija;
	private Sediste sediste;
	private Date datumVremeProdaje;
	private Korisnik korisnik;
	public Karta(int id, Projekcija projekcija, Sediste sediste, Date datumVremeProdaje, Korisnik korisnik) {
		super(id);
		this.projekcija = projekcija;
		this.sediste = sediste;
		this.datumVremeProdaje = datumVremeProdaje;
		this.korisnik = korisnik;
	}
	public Karta(int id) {
		this(0,new Projekcija(), new Sediste(), new Date(), new Korisnik());
	}
	public Projekcija getProjekcija() {
		return projekcija;
	}
	public void setProjekcija(Projekcija projekcija) {
		this.projekcija = projekcija;
	}
	public Sediste getSediste() {
		return sediste;
	}
	public void setSediste(Sediste sediste) {
		this.sediste = sediste;
	}
	public Date getDatumVremeProdaje() {
		return datumVremeProdaje;
	}
	public void setDatumVremeProdaje(Date datumVremeProdaje) {
		this.datumVremeProdaje = datumVremeProdaje;
	}
	public Korisnik getKorisnik() {
		return korisnik;
	}
	public void setKorisnik(Korisnik korisnik) {
		this.korisnik = korisnik;
	}
	
	
}
