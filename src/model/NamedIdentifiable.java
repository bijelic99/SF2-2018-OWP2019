package model;

public abstract class NamedIdentifiable extends Identifiable {
	
	private String naziv;
	
	public NamedIdentifiable(int id, String naziv) {
		super(id);
		setNaziv(naziv);
		// TODO Auto-generated constructor stub
	}

	public NamedIdentifiable() {
		this(-1, "");
	}
	
	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	

}
