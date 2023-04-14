package bonusaufgaben.Arrays;

import java.util.ArrayList;

public class Level11 {
	/* Level 11
	 * Schreiben Sie eine Methode findDuplicates(int[] arr),
	 * die eine Liste aller doppelten Elemente in einem Array von Ganzzahlen zurückgibt.
	 * Verwenden Sie eine Schleife, um durch das Array zu iterieren,
	 * und verwenden Sie eine verschachtelte Schleife,
	 * um jedes Element mit allen anderen Elementen im Array zu vergleichen.
	 * Verwenden Sie eine Liste, um die doppelten Elemente zu speichern.
	 */
	public static void main(String[] args) {
		System.out.print("Bonusaufgaben - Arrays - Level 11 \n"
				+ "\n"
				+ "\n");
		int[] a = {1,2,3,4,5,6,7,8,9,10,5,8,5,5};
		System.out.println("Dublikate:");
		for (int i : findDuplicates(a)) {
			System.out.println(" - " + i);
		}
	}
	
	private static ArrayList <Integer> findDuplicates(int[] arr) {
		ArrayList <Integer> ret = new ArrayList<Integer>();
		for (int i = 0 ; i < arr.length-1 ; i++) {
			for (int p = 0 ; p < arr.length ; p++) {
				if (i==p) {
					//Do Nothing
					continue;
				} else if (arr[i] == arr[p]) {
					//Sind gleich
					if(ret.contains(arr[i])) {
						//Nothing Zahl steht bereits in der Liste
					} else {
						ret.add(arr[i]);
					}
				}
			}
		}
		return ret;
	}

}
