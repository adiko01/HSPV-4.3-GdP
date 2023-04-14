package bonusaufgaben.Arrays;

public class Level9 {
	/* Level 9
	 * Schreiben Sie eine Methode rotateArray(int[] arr, int k),
	 * die ein Array von Ganzzahlen um k Positionen nach rechts dreht.
	 * Die Methode sollte das gedrehte Array zurückgeben, ohne das ursprüngliche Array zu ändern.
	 */
	public static void main(String[] args) {
		System.out.print("Bonusaufgaben - Arrays - Level 9 \n"
				+ "Array Rotate\n"
				+ "\n");
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		int[] b = rotateArray(a, 3);
		
		for (int i : b) {
			System.out.println(i);
		}
	}
	
	private static int[] rotateArray(int[] arr, int k) {
		int[] ret = new int[arr.length];
		
		int posN = k;
		
		for (int i = 0 ; i < arr.length ; i++) {
			ret[posN] = arr[i];
			
			posN++;
			posN = posN % arr.length;
		}
		
		return ret;
	}
}
