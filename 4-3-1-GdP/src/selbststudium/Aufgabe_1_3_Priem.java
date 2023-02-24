package selbststudium;

public class Aufgabe_1_3_Priem {
	/** Diese Version streicht alle nicht Priemzahlen aus dem Arry
	 * 
	 * @param ars
	 */
	public static void main(String[] ars) {
		// Das ARRY
		int[] ARR = new int[100];

		// Befüllen des Arry
		for (int i = 1; i <= 100; i++) {
			ARR[(i - 1)] = i;
		}

		// Setze die 1 auf 0
		ARR[0] = 0;

		// Suche die Vielfache
		for (int i = 1; i < 100; i++) {
			if (ARR[i] != 0) {
				for (int o = (i + 1); o < 100; o++) {
					if (ARR[o] % ARR[i] == 0) {
						ARR[o] = 0;
					}
				}
			}
		}

		// Ausgabe des Arry
		System.out.print("| ");
		for (int i = 0; i < ARR.length-1; i++) {
			if (ARR[i]!=0) {
				System.out.print(ARR[i] + " | ");
			}
		}
	}
}
