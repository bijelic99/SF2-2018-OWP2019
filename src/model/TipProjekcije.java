package model;

public class TipProjekcije extends NamedIdentifiable {

	public TipProjekcije() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TipProjekcije(int id, String naziv) {
		super(id, naziv);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return ((TipProjekcije) arg0).getId() == this.getId();
	}

	

}
