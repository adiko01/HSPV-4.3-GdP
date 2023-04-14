package bonusaufgaben.Arrays;

public class Level2 {
	/* Level 2
	 * Schreibe ein Java-Programm,
	 * das ein Array mit 10 Zahlen erstellt
	 * und dann die größte und kleinste Zahl im Array auf der Konsole ausgibt.
	 */
	public static void main(String[] args) {
		System.out.print("Bonusaufgaben - Arrays - Level 2 \n"
				+ "Kleinste Zahle im Array\n"
				+ "\n");
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		int m = Integer.MAX_VALUE;
		
		for (int i : a) {
			if (i<m) {
				m = i;
			}
		}
		System.out.println("Die kleinste Zahl im Array ist: " + m);
		
	}

}
