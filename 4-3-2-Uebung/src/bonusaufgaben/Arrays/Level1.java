package bonusaufgaben.Arrays;

public class Level1 {
	/* Level 1
	 * Schreiben Sie ein Programm,
	 * das ein Array mit 10 ganzen Zahlen initialisiert
	 * und dann alle Elemente des Arrays ausgibt.
	 */
	public static void main (String[] args) {
		System.out.print("Bonusaufgaben - Arrays - Level 1 \n"
				+ "\n"
				+ "\n");
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		for (int i : a) {
			System.out.println(i);
		}
	}
}
