package uebung5;

public class Aufgabe_4 {
	/** Aufgabe 4
	 * Entwickeln Sie eine Methode, mit der ein int-Array mit dem BubbleSort-Algorithmus
	 * sortiert wird.
	 */
	
	public static void main (String[] args) {
		int[] ARRY = {8,5,3,4,5,6,78,66,55,10};
		System.out.print("Vor dem Sortieren:  ");
		for (int o = 0; o<ARRY.length; o++) {
			System.out.print(ARRY[o] + " | ");
		}
		System.out.print("\nNach dem Sortieren: ");
		bubbleSortArry(ARRY);
		for (int i = 0; i<ARRY.length; i++) {
			System.out.print(ARRY[i] + " | ");
		}
		
	}
	
	private static void bubbleSortArry(int[] ARRY) {
	    for (int i = 0; i < ARRY.length-1; i++) {
	        for (int j = 0; j < ARRY.length-i-1; j++) {
	            if (ARRY[j] > ARRY[j+1]) {
	                int temp = ARRY[j];
	                ARRY[j] = ARRY[j+1];
	                ARRY[j+1] = temp;
	            }
	        }
	    }
	}
}
