package uebung5;

public class Aufgabe_2 {
	/** Aufgabe 2
	 * Erstellen Sie ein zweidimensionales Array der Größe 10x10 Felder. In drei zufälligen Fel-
	 * dern dieser Matrix speichern Sie den Wert 1, in den restlichen den Wert 0 ab. Schreiben
	 * Sie dann eine Methode, die das erzeugte Array auf dem Bildschirm ausgibt, so dass es
	 * in etwa so aussieht:
	 * 			|0|0|0|0|0|0|0|0|0|0|
	 *			|0|0|0|0|0|0|0|0|0|0|
	 * 			|0|0|0|0|0|0|1|0|0|0|
	 *			|0|0|0|0|0|0|0|0|0|0|
	 *			|0|0|0|0|0|0|0|0|0|0|
	 * 			|0|0|0|0|0|0|0|0|0|0|
	 *			|0|0|0|0|0|0|0|0|0|0|
	 *			|1|0|0|0|0|0|0|0|0|0|
	 *			|0|0|0|1|0|0|0|0|0|0|
	 *			|0|0|0|0|0|0|0|0|0|0|
	 */
	public static void main (String[] args) {
		
		//Das Arry
		int[][] ARRY = new int[10][10];
		
		
		// Erstellung der Zufallszahlen
		for (int i = 0; i<3; i++) {
			int l = (int) (Math.random() * 10);
			int r = (int) (Math.random() * 10);
			ARRY[l][r] = 1;
		}
		
		printArryMatrix(ARRY);
	}
	
	private static void printArryMatrix(int[][] ARR) {
		for (int l = 0; l < 10 ; l++) {
			System.out.print("|");
			for (int r = 0; r < 10 ; r++) {
				System.out.print("" + ARR[l][r] + "|");
			}
			System.out.print("\n");
		}
	}
}
