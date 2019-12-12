package model;

import java.util.Date;

public class Korisnik extends Identifiable {
	private String username;
	private String password;
	private Date datumRegistracije;
	private Uloga uloga;
	public Korisnik(int id, String username, String password, Date datumRegistracije, Uloga uloga) {
		super(id);
		this.username = username;
		this.password = password;
		this.datumRegistracije = datumRegistracije;
		this.uloga = uloga;
	}
	public Korisnik() {
		this(0, "", "", new Date(), new Uloga(1, "Obican"));
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getDatumRegistracije() {
		return datumRegistracije;
	}
	public void setDatumRegistracije(Date datumRegistracije) {
		this.datumRegistracije = datumRegistracije;
	}
	public Uloga getUloga() {
		return uloga;
	}
	public void setUloga(Uloga uloga) {
		this.uloga = uloga;
	}
	
	
}
