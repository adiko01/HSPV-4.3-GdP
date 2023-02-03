package uebung3;

public class Aufgabe9a {
	/**
	 * Aufgabe 9
	 * a) Schreiben Sie ein Programm, das auf der Konsole mittels verschachtelter Schleifen
	 * einen “Tannenbaum” ausgibt. Die Ausgabe soll in etwa so aussehen:
	 * *
	 * **
	 * ***
	 * ****
	 * *****
	 */
	public static void main(String[] args) {
		//Schleife für die Zeilen
		for (int line = 0; line<5 ; line++) {
			//Schleife für die Sterne, soviele * erstellen wie die Nummer der Zeile ist
			for (int star = 0; star<=line; star++) {
				System.out.print("*");
			}
			//Zeilenumbruch ergänzen
			System.out.print("\n");
		}
	}

}
