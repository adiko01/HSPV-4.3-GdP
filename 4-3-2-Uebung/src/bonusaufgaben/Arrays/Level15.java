package bonusaufgaben.Arrays;

public class Level15 {
	/* Level 15
	 * Schreiben Sie ein Java-Programm,
	 * das eine Methode matrixMultiplication(int[][] a, int[][] b) implementiert,
	 * die zwei Matrizen multipliziert.
	 * Die Methode soll ein neues 2D-Array zurückgeben,
	 * das das Ergebnis der Multiplikation enthält.
	 * Verwenden Sie dazu Schleifen. Testen Sie Ihre Methode,
	 * indem Sie zwei 2x2-Matrizen mit zufälligen Ganzzahlen erstellen und multiplizieren.
	 */
	public static void main(String[] args) {
		System.out.print("Bonusaufgaben - Arrays - Level 15 \n"
				+ "Matrix Mulitplikation\n"
				+ "\n");
		int[][] a = new int[2][2];
		int[][] b = new int[2][2];
		for (int i = 0; i < 2 ; i++) {
			a[i][i] = 1;
			b[i][i] = 1;
		}
		System.out.println("Ergebnis:");
		for (int[] i : matrixMultiplication(a,b)) {
			System.out.println(i[0] + "  " + i[1]);
		}
	}
	private static int[][] matrixMultiplication(int[][] a, int[][] b) {
		int[][] ret = null;

		if (a[0].length == b.length) {
			int zeilena = a.length;
			int spaltena = a[0].length;
			int spalenb = b[0].length;

			ret = new int[zeilena][spalenb];

			for (int i = 0; i < zeilena; i++) {
				for (int j = 0; j < spalenb; j++) {
					ret[i][j] = 0;
					for (int k = 0; k < spaltena; k++) {
					  ret[i][j] += a[i][k] * b[k][j];
					}
				}
			}
		} else {
			int zeilen = a.length;
			int spalten = a[0].length;

			ret = new int[zeilen][spalten];
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[0].length; j++) {
					ret[i][j] = 0;
				}
			}
		}
		return ret;
	}
}
