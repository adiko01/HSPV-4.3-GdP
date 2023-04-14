package bonusaufgaben.Arrays;

import java.util.ArrayList;

public class Level12 {
	/* Level 12
	 * Schreiben Sie eine Methode removeDuplicates(int[] arr),
	 * die alle Duplikate aus einem Integer-Array entfernt
	 * und das modifizierte Array zurückgibt.
	 * Testen Sie Ihre Methode mit einem Testprogramm,
	 * das ein Array mit Duplikaten erstellt und das modifizierte Array ausgibt.
	 */
	public static void main(String[] args) {
		System.out.print("Bonusaufgaben - Arrays - Level 12 \n"
				+ "Entferne Dublikate\n"
				+ "\n");
		int[] a = {1,2,3,4,5,6,7,8,9,10,5};
		for (int i : removeDuplicates(a)) {
			System.out.println(i);
		}
	}
	private static int[] removeDuplicates(int[] arr) {
		ArrayList <Integer> save = new ArrayList<Integer>();
		for (int i : arr) {
			if (save.contains(i)) {
				// Mache Nix
			} else {
				save.add(i);
			}
		}
		
		int [] ret = new int[save.size()];
		for (int i = 0 ; i < save.size() ; i++) {
			ret[i] = save.get(i);
		}
		
		return ret;
	}
}
