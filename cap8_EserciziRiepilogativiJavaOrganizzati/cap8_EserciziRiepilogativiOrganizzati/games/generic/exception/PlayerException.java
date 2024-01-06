package games.generic.exception;

public class PlayerException extends Exception {
	public PlayerException(String message) {
		super("Eccezione riguardare il player: " + message);
	}

}
