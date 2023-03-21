package uebung5;

import java.util.Scanner;

public class Aufgabe_3 {
	/** Aufgabe 3
	 * Erstellen Sie ein Programm, mit dem der Nutzer prüfen kann, ob es sich bei einer
	 * eingegebenen Zeichenkette um ein Palindrom handelt.
	 */
	public static void main (String[] args) {
		System.out.print("Übung 5 - Aufgabe3 - Ansatz 1\n"
				+ "Palindromprüfung\n"
				+ "\n"
				+ "Bitte gebe dein Wort ein: ");
		//Lese das Wort ein
		String word = new Scanner(System.in).nextLine().toLowerCase();
		
		//Annahme, das Wort ist ein Palindrom
		boolean pal = true;
		
		//Überprüfe die Buchstaben
		for (int i = 0; i<word.length() ; i++) {
			//Es geht effizienter, aber das funktioniert auch so
			if (word.charAt(i)==word.charAt((word.length()-i-1))) {
				//Die Annahme ist bis jetzt Wahr
			} else {
				//Annahme wiederlegt, das Wort ist kein Palindrom
				pal = false;
				//Beende die for-Schleife
				break;
			}
		}
		//Auswertung, ob das Wort ein Palindrom war.
		if (pal) {
			System.out.print("Das Word ist ein Palindrom.\n");
		} else {
			System.out.print("Das Word ist kein Palindrom.\n");
		}
		
	}
}
