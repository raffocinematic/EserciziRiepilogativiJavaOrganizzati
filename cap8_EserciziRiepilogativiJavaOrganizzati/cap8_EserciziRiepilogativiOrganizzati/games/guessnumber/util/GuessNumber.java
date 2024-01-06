package games.guessnumber.util;
//creaiamo questa classe con un unico metodo statico che genera il numero casuale tra 1 e il num max che gli viene passato in 
//input

import java.util.Random;

public class GuessNumber {
	private static final Random RANDOM = new Random();

	public static int generateRandomNumber(int max) {
		return 1 + RANDOM.nextInt(max);
	}

}
