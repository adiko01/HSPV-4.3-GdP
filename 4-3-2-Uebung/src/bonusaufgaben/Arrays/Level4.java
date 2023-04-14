package bonusaufgaben.Arrays;

public class Level4 {
	/* Level 4
	 * Schreibe ein Java-Programm,
	 * das ein Array mit 10 String-Werten erstellt
	 * und dann die Länge jedes Strings auf der Konsole ausgibt.
	 */
	public static void main(String[] args) {
		System.out.print("Bonusaufgaben - Arrays - Level 4 \n"
				+ "\n"
				+ "\n");
		String[] a = {"Baum",
				"Mail",
				"Biene",
				"Schule",
				"HSPV",
				"Laptop",
				"Postleitzahl",
				"Gesetz",
				"Feuer",
				"ECOSIA"};
		
		for (String s : a) {
			System.out.println(s + " hat eine Länge von " + s.length());
		}
		
	}

}
