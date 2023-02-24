package selbststudium;

public class Aufgabe_1_3_Nur_2_3 {
	/** Diese Version Streicht nur die Vielfachen von 2 und 3 aus dem Arry
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

		// Suche die Vielfache von 2 und 3
		for (int i = 1; i < 100; i++) {
			if (ARR[i] != 0) {
				if (ARR[i] % 2 == 0) {
					ARR[i] = 0;
				} else if (ARR[i] % 3 == 0) {
					ARR[i] = 0;
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
