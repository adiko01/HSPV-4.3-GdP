package uebung5;

import java.util.Scanner;

public class Aufgabe_3_V2 {
	/** 
	 * Dies ist eine andere Implementation der Aufgabe 3
	 * 
	 * Aufgabe 3
	 * Erstellen Sie ein Programm, mit dem der Nutzer prüfen kann, ob es sich bei einer
	 * eingegebenen Zeichenkette um ein Palindrom handelt.
	 */
	public static void main(String[] args) {
		System.out.print("Übung 5 - Aufgabe3 - Ansatz V2\n"
				+ "Palindromprüfung\n"
				+ "\n"
				+ "Bitte gebe dein Wort ein: ");
		String word = new Scanner(System.in).nextLine().toLowerCase();
		
		if (isPalindrom(word)) {
			System.out.println("Das Wort " + word + " ist ein Palindrom");
		} else {
			System.out.println("Das Wort " + word + " ist KEIN Palindrom");
		}
	}
	
	/**
	 * Überprüft, ob ein Übergebener Strin ein Palindrom ist
	 * @param word Das zu überprüfende Wort
	 * @return {@code true} wenn es ein Palindrom ist und
	 * {@code false} wenn es kein Palindrom ist
	 */
	public static boolean isPalindrom (String word) {
		//Falls das Wort nicht in kleinen Buchstaben übergeben wird
		word = word.toLowerCase();
		
		// Länge des Wortes auslesen
		int max = word.length();
		
		/* Teile durch 2, da nur das halbe Wort überprüft werden muss,
		 * denn wenn das Zeichen an Stelle 0 das geleiche ist wie das an Stelle max,
		 * dann ist auch umgekehrt das Zeichen an Stelle max das gleiche wie an Stelle 0
		 * 
		 * Sollte das Wort eine ungerade Anzahl an Zeichen haben,
		 * dann kann das mittlere Zeichen ignoriert werden, da es mit sich selbst verglichen wird.
		 * (Somit ist es egal, dass beim Teilen einer ungeraden Länge die 0,5 abgeschnitten wird.)
		 */
		max = max / 2;
		
		for (int i = 0; i < max; i++) {
			if(word.charAt(i) == word.charAt((word.length() -1 - i))) {
				//Nothing
			} else {
				/* Es wurde ein nicht Übereinstimmendes Zeichen gefunden,
				 * darum ist das Word kein Palindrom
				 */
				return false;
			}
		}
		// Da kein nicht passendes Zeichen gefunden wurde, handelt es sich um ein Palindrom
		return true;
	}
}
