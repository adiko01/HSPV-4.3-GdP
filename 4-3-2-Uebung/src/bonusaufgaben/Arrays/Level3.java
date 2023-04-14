package bonusaufgaben.Arrays;

public class Level3 {
	/* Level 3
	 * Schreibe ein Java-Programm,
	 * das ein Array mit 5 Integer-Zahlen erstellt
	 * und dann die Summe und den Durchschnitt dieser Zahlen berechnet und auf der Konsole ausgibt.
	 */
	public static void main(String[] args) {
		System.out.print("Bonusaufgaben - Arrays - Level 3 \n"
				+ "Summe und Durschnitt eines Arrays\n"
				+ "\n");
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		
		int sum = 0;
		for (int i : a) {
			sum += i;
		}
		Double durchschnitt = sum / (double) a.length;
		
		System.out.println("Die Summe des Arrays ist: " + sum + " und der Durchschnitt " + durchschnitt);
	}

}
