package model;

public class Sediste extends Identifiable {
	private int redniBroj;
	private Sala sala;
	
	public Sediste(int id, int redniBroj, Sala sala) {
		super(id);
		this.redniBroj = redniBroj;
		this.sala = sala;
	}
	public Sediste() {
		this(0, 0, new Sala());
	}
	public int getRedniBroj() {
		return redniBroj;
	}
	public void setRedniBroj(int redniBroj) {
		this.redniBroj = redniBroj;
	}
	public Sala getSala() {
		return sala;
	}
	public void setSala(Sala sala) {
		this.sala = sala;
	}
	
	
}
