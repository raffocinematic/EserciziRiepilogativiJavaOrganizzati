package games.guessnumber.business;

import java.util.Scanner;

import games.generic.business.Game;
import games.guessnumber.util.GuessNumber;

import java.util.Random;

//ESERCIZIO CAP 8 _ UU
//applicazione che chiede all'utente di indovinare un numero casuale compreso tra 1 e 100 e conta anche il numero di
//tentativi.
//ps: usa nomi classi in inglese per abituarti
public class GuessNumberGame implements Game {

	private static final int MAX_NUMBER = 100;
	private Scanner scanner;
	private int attemptsNumber;
	private int numberToGuess;

	public GuessNumberGame() {
		init();
		start();
		play();
		end();
	}
//facciamo gli override dei metodi dichiarati nella interfaccia Game
	@Override
	public void init() {
		scanner = new Scanner(System.in);
		numberToGuess = GuessNumber.generateRandomNumber(MAX_NUMBER);
	}

	@Override
	public void start() {
		System.out.println("Ho pensato a un numero tra 1 e " + MAX_NUMBER + ", indovinalo!");
	}

	@Override
	//metodo ricorsivo, richiama sè stesso fino a quando l'utente non ha indovinato il numero
	public void play() {
		attemptsNumber++;
		int number = scanner.nextInt();
		if (number < numberToGuess) {
			System.out.println("Troppo basso, ritenta");
		} else if (number > numberToGuess) {
			System.out.println("Troppo alto, ritenta");
		} else {
			return;
		}
		play();
	}

	@Override
	public void end() {
		System.out.println("Complimenti, Hai indovinato dopo " + attemptsNumber + " tentativi");
	}
// il main ha semplicemente instanziato l'oggetto GuessNumberGame chiamandone in costruttore, questo poi ha invocato i metodi
	//definiti dall'interfaccia, che sono stati implementati.
	public static void main(String[] args) {
		new GuessNumberGame();
	}
}
