package model;

import java.util.ArrayList;

public class Sala extends NamedIdentifiable {
	
	
	private ArrayList<TipProjekcije> podrzaniTipoviProjekcija;

	public ArrayList<TipProjekcije> getPodrzaniTipoviProjekcija() {
		return podrzaniTipoviProjekcija;
	}

	public void setPodrzaniTipoviProjekcija(ArrayList<TipProjekcije> podrzaniTipoviProjekcija) {
		this.podrzaniTipoviProjekcija = podrzaniTipoviProjekcija;
	}

	public Sala(int id, String naziv, ArrayList<TipProjekcije> podrzaniTipoviProjekcija) {
		super(id, naziv);
		this.podrzaniTipoviProjekcija = podrzaniTipoviProjekcija;
	}

	public Sala() {
		this(-1, "", new ArrayList<TipProjekcije>());
	}
	
	

}
