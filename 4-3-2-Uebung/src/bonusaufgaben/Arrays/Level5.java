package bonusaufgaben.Arrays;

public class Level5 {
	/* Level 5
	 * Schreibe ein Java-Programm,
	 * das ein Array mit 5 Boolean-Werten erstellt
	 * und dann prüft, ob alle Werte true oder false sind.
	 */
	public static void main(String[] args) {
		System.out.print("Bonusaufgaben - Arrays - Level 5 \n"
				+ "Boolarray\n"
				+ "\n");
		boolean[] c = {true, false, false, true, false};
		
		//Ausgangsthese: Beide Anforderungen stimmen
		boolean AllTrue = true;
		boolean AllFalse = true;
		
		for (boolean b : c) {
			if (b) {
				AllFalse = false;
			} else {
				AllTrue = false;
			}
		}
		if (AllTrue) {
			System.out.println("Alle Werte sind true");
		} else if (AllFalse) {
			System.out.println("Alle Werte sind false");
		} else {
			System.out.println("Nicht alle Werte sind gleich");
		}
	}

}
