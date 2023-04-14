package bonusaufgaben.Arrays;

public class Level10 {
	/* Level 10
	 * Schreiben Sie eine Methode sumOfPairs(int[] arr, int sum),
	 * die ein Integer-Array und eine Zielsumme als Parameter erhält
	 * und ein Array von Paaren zurückgibt, deren Summe der Zielsumme entspricht.
	 * Testen Sie Ihre Methode mit einem Testprogramm, das ein Array erstellt und ein paar Zielsummen überprüft.
	 */
	public static void main(String[] args) {
		System.out.print("Bonusaufgaben - Arrays - Level 10 \n"
				+ "Array Summen\n"
				+ "\n");
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		int[][] b = new int[a.length][2];
		b = sumOfPairs(a,50);
	}
	private static int[][] sumOfPairs(int[] arr, int sum) {
		int[][] ret = new int[arr.length][2];
		
		for (int i = 0 ; i < arr.length ; i++) {
			ret[i][0] = arr[i];
			ret[i][1] = sum - arr[i];
		}
		
		return ret;
	}
}
