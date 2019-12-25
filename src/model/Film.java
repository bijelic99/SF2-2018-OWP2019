package model;

import java.util.ArrayList;

public class Film extends NamedIdentifiable {
	private ArrayList<Zanr> zanrovi;
	private Osoba reziser;
	private ArrayList<Osoba> glumci;
	private int trajanje;
	private String distributer;
	private String zemljaPorekla;
	private int godinaProizvodnje;
	private String opis;
	private Boolean obrisan;
	private String pathDoSlike;
	
	public Film(int id, String naziv, ArrayList<Zanr> zanrovi, Osoba reziser, ArrayList<Osoba> glumci, int trajanje,
			String distributer, String zemljaPorekla, int godinaProizvodnje, String opis, Boolean obrisan, String pathDoSlike) {
		super(id, naziv);
		this.zanrovi = zanrovi;
		this.reziser = reziser;
		this.glumci = glumci;
		this.trajanje = trajanje;
		this.distributer = distributer;
		this.zemljaPorekla = zemljaPorekla;
		this.godinaProizvodnje = godinaProizvodnje;
		this.opis = opis;
		this.setObrisan(obrisan);
		this.setPathDoSlike(pathDoSlike);
	}
	public Film() {
		this(0, "", new ArrayList<Zanr>(), new Osoba(), new ArrayList<Osoba>(), 0, "", "", 0, "", false, "");
	}
	public ArrayList<Zanr> getZanrovi() {
		return zanrovi;
	}
	public void setZanrovi(ArrayList<Zanr> zanrovi) {
		this.zanrovi = zanrovi;
	}
	public Osoba getReziser() {
		return reziser;
	}
	public void setReziser(Osoba reziser) {
		this.reziser = reziser;
	}
	public ArrayList<Osoba> getGlumci() {
		return glumci;
	}
	public void setGlumci(ArrayList<Osoba> glumci) {
		this.glumci = glumci;
	}
	public int getTrajanje() {
		return trajanje;
	}
	public void setTrajanje(int trajanje) {
		this.trajanje = trajanje;
	}
	public String getDistributer() {
		return distributer;
	}
	public void setDistributer(String distributer) {
		this.distributer = distributer;
	}
	public String getZemljaPorekla() {
		return zemljaPorekla;
	}
	public void setZemljaPorekla(String zemljaPorekla) {
		this.zemljaPorekla = zemljaPorekla;
	}
	public int getGodinaProizvodnje() {
		return godinaProizvodnje;
	}
	public void setGodinaProizvodnje(int godinaProizvodnje) {
		this.godinaProizvodnje = godinaProizvodnje;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
	public Boolean getObrisan() {
		return obrisan;
	}
	public void setObrisan(Boolean obrisan) {
		this.obrisan = obrisan;
	}
	public String getPathDoSlike() {
		return pathDoSlike;
	}
	public void setPathDoSlike(String pathDoSlike) {
		this.pathDoSlike = pathDoSlike;
	}
	
	
	
}
