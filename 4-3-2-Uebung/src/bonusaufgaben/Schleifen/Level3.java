package bonusaufgaben.Schleifen;

public class Level3 {
	/* Level 3
	 * Schreiben Sie ein Programm, das alle geraden Zahlen zwischen 1 und 20 ausgibt.
	 */
	public static void main(String[] args) {
		for (int i = 1 ; i <= 20 ; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

	}

}
