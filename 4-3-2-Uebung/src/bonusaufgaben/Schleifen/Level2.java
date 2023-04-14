package bonusaufgaben.Schleifen;

public class Level2 {
	/* Level 2
	 * Schreibe ein Java-Programm, das die Summe der Zahlen von 1 bis 100 berechnet und auf der Konsole ausgibt.
	 */
	
	public static void main (String[] args) {
		System.out.print("Bonusaufgaben - Schleifen  - Level 12 \n"
				+ "Summe 1 bis 100\n"
				+ "\n");
		int sum = 0;
		for (int i = 1 ; i <= 100 ; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
