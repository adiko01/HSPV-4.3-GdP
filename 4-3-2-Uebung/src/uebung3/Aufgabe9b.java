package uebung3;

public class Aufgabe9b {
	/**
	 * Aufgabe 9
	 * a) Schreiben Sie ein Programm, das auf der Konsole mittels verschachtelter Schleifen
	 * einen “Tannenbaum” ausgibt. Die Ausgabe soll in etwa so aussehen:
	 * *
	 * **
	 * ***
	 * ****
	 * *****
	 * b) Ändern Sie das Programm so ab, dass die Ausgabe wie folgt aussieht:
	 *    *
	 *   ***
	 *  *****
	 * *******
	 * 
	 */
	public static void main(String[] args) {
		//Zeilen Schleife
	    for (int i = 0; i < 4; i++) {
	    	//Leerzeichen Schleife
	    	for (int j = 4 - i; j > 1; j--) {
	    		System.out.print(" ");
	    	}
	    	//Schleife für Sterne
	    	for (int j = 0; j <= (2 * i); j++) {
	    		System.out.print("*");
	    	}
	    	System.out.println();
	    }
	}

}
