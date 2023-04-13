package bonusaufgaben.Schleifen;

public class Level2 {
	/* Level 2
	 * Schreibe ein Java-Programm, das die Summe der Zahlen von 1 bis 100 berechnet und auf der Konsole ausgibt.
	 */
	
	public static void main (String[] args) {
		int sum = 0;
		for (int i = 1 ; i <= 100 ; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
