package model;

public class ZauzetoSediste extends Sediste {
	private boolean zauzeto;
	
	public ZauzetoSediste(Sediste sediste,Boolean zauzeto) {
		super(sediste.getId(), sediste.getRedniBroj(), sediste.getSala());
		this.zauzeto = zauzeto;
	}
	
	public ZauzetoSediste(){
		this(new Sediste(), false);
	}

	public boolean isZauzeto() {
		return zauzeto;
	}

	public void setZauzeto(boolean zauzeto) {
		this.zauzeto = zauzeto;
	}
	

}
