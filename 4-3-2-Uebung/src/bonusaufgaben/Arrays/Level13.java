package bonusaufgaben.Arrays;

public class Level13 {
	/* Level 13
	 * Schreiben Sie eine Methode findMissingNumber(int[] arr),
	 * die ein Integer-Array mit aufsteigenden Zahlen von 1 bis n enthält,
	 * wobei eine Zahl fehlt. Die Methode soll die fehlende Zahl zurückgeben.
	 * Testen Sie Ihre Methode mit einem Testprogramm,
	 * das ein Array mit einer fehlenden Zahl erstellt und die fehlende Zahl ausgibt.
	 */
	public static void main(String[] args) {
		System.out.print("Bonusaufgaben - Arrays - Level 13 \n"
				+ "Fehlende Zahl im Array\n"
				+ "\n");
		int[] a = {1,2,3,4,6,7,8,9,10};
		System.out.println("In dem Array fehlt die Zahl: " + findMissingNumber(a));
	}
	private static int findMissingNumber(int[] arr) {
		for (int i = 0 ; i < arr.length ; i++) {
			if (arr[i] == (i+1)) {
				//Nix
			} else {
				return i+1;
			}
		}
		return -1;
	}
}
