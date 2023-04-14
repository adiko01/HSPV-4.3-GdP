package bonusaufgaben.Arrays;

public class Level7 {
	/* Level 7
	 * Schreiben Sie ein Java-Programm,
	 * das ein Array mit Zahlen erstellt.
	 * Das Programm soll dann die Anzahl der Zahlen im Array berechnen,
	 * die größer sind als der Durchschnitt aller Zahlen im Array.
	 */
	public static void main(String[] args) {
		System.out.print("Bonusaufgaben - Arrays - Level 7 \n"
				+ "\n"
				+ "\n");
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		
		//Summe
		int sum = 0;
		
		for (int i : a) {
			sum += i;
		}
		
		//Durschnitt
		double schnitt = sum / (double) a.length;
		
		//Anzahl Größer
		int anz = 0;
		
		for (int i : a) {
			if (i > schnitt) {
				anz++;
			}
		}
		
		System.out.println("In dem Array sind " + anz + " größer als der Durschschnitt.");
	}

}
