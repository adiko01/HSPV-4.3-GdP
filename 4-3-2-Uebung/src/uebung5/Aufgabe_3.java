package uebung5;

import java.util.Scanner;

public class Aufgabe_3 {
	/** Aufgabe 3
	 * Erstellen Sie ein Programm, mit dem der Nutzer prüfen kann, ob es sich bei einer
	 * eingegebenen Zeichenkette um ein Palindrom handelt.
	 */
	public static void main (String[] args) {
		System.out.print("Übung 5 - Aufgabe3\n"
				+ "Palindromprüfung\n"
				+ "\n"
				+ "Bitte gebe dein Wort ein: ");
		String word = new Scanner(System.in).nextLine().toLowerCase();
		boolean pal = true;
		for (int i = 0; i<word.length() ; i++) {
			//Es geht effizienter, aber das funktioniert auch so
			if (word.charAt(i)==word.charAt((word.length()-i-1))) {
				//Nothing
			} else {
				pal = false;
				break;
			}
		}
		if (pal) {
			System.out.print("Das Word ist ein Palindrom.\n");
		} else {
			System.out.print("Das Word ist kein Palindrom.\n");
		}
		
	}
}
