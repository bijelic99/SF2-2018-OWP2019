package model;

public abstract class Identifiable {
	public Identifiable(int id) {
		super();
		this.id = id;
	}
	
	

	public Identifiable() {
		this(-1);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private int id;
	
}
