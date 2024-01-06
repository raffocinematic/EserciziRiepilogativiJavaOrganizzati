package games.generic.data;

public abstract class Player {
	private int id;
	private String name;
// non ho capito perchè il test non funzionasse e desse output null, poi ho capito che c'era un errore qui
	//invece di String name c'era String string.
	public Player(int id, String name) {
		this.setId(id);
		this.setName(name);
	}
	
	public abstract boolean play();

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Player " + id + " : " + name;
	}
}
