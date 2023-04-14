package bonusaufgaben.Arrays;

public class Level8 {
	/* Level 8
	 * Schreiben Sie eine Methode reverseArray(int[] arr),
	 * die die Reihenfolge der Elemente in einem Integer-Array umkehrt.
	 * Testen Sie Ihre Methode mit einem Testprogramm, das ein Array erstellt,
	 * es umkehrt und das umgekehrte Array ausgibt.
	 */
	public static void main(String[] args) {
		System.out.print("Bonusaufgaben - Arrays - Level 0 \n"
				+ "Array Umkehr\n"
				+ "\n");
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		
		a = reverseArray(a);
		
		for (int i : a) {
			System.out.println(i);
		}
	}
	
	private static int[] reverseArray(int[] arr) {
		int[] n = new int[arr.length];
		for (int i = 0 ; i < arr.length ; i++) {
			n[arr.length-i-1] = arr[i];
		}
		return n;
	}
}
