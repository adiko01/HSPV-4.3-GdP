package bonusaufgaben.Arrays;

public class Level14 {
	/* Level 14
	 * Schreiben Sie ein Java-Programm,
	 * das eine Methode mergeArrays(int[] a, int[] b) implementiert,
	 * die zwei Arrays von Ganzzahlen zusammenführt.
	 * Die Methode soll ein neues Array zurückgeben,
	 * das die Elemente beider Arrays enthält.
	 * Verwenden Sie dazu eine Schleife.
	 * Testen Sie Ihre Methode,
	 * indem Sie zwei Arrays mit je 5 zufälligen Ganzzahlen erstellen und diese zusammenführen.
	 */
	public static void main(String[] args) {
		System.out.print("Bonusaufgaben - Arrays - Level 14 \n"
				+ "Zusammenführen von Arrays\n"
				+ "\n");
		int[] a = {1,2,3,4,5};
		int[] b = {6,7,8,9,10};
		
		for (int i : mergeArrays(a,b)) {
			System.out.println(i);
		}
	}
	
	private static int[] mergeArrays(int[] a, int[] b) {
		int[] ret = new int[(a.length + b.length)];
		
		for (int i = 0 ; i < a.length ; i++) {
			ret[i] = a[i];
		}
		
		for (int i = 0 ; i < b.length ; i++) {
			ret[(a.length + i)] = b[i];
		}
		
		return ret;
	}

}
