package model;

public enum Uloga{
	Neprijavljen(0) ,Obican(1), Admin(2);
	
	private Uloga(int id) {
		this.id = id;
	}

	private final int id;
	
	public int getId() {
		return this.id;
	}
	
	public static Uloga getById(int id) {
		for(Uloga u : Uloga.values()) {
			if(u.getId() == id) return u;
		}
		return Uloga.Neprijavljen;
	}
}

