package bonusaufgaben.Arrays;

import java.util.Random;

public class Level6 {
	/* Level 6
	 * 
	 * Schreiben Sie ein Programm, das ein Array mit 10 zufälligen ganzen Zahlen zwischen 1 und 100 initialisiert.
	 * 
	 * 1. Und dann alle Elemente des Arrays ausgibt.
	 * 2. Und dann das größte Element im Array findet und ausgibt.
	 * 3. Und dann das kleinste Element im Array findet und ausgibt.
	 * 4. Und  dann die Summe aller Elemente im Array berechnet.
	 * 5. Und dann die Summe aller geraden Elemente berechnet.
	 * 6. Und dann die Summe aller ungeraden Elemente berechnet
	 */
	public static void main(String[] args) {
		System.out.print("Bonusaufgaben - Arrays - Level 6 \n"
				+ "Besondere Werte eines Arrays\n"
				+ "\n");
		int[] a = new int[10];
		Random zufall = new Random();
		
		//Fülle das Array
		for (int i = 0 ; i < a.length ; i++) {
			a[i] = zufall.nextInt(Integer.MAX_VALUE);
		}
		
		//Rechne
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		long sum = 0;
		long gsum = 0;
		long ugsum = 0;
		
		
		for (int i : a) {
			//Max
			if (max < i) {
				max = i;
			}
			
			//Min
			if (min > i) {
				min = i;
			}
			
			//Summe
			sum += i;
			
			//Gerade und Ungerade Summe
			if (i % 2 == 0) {
				gsum += i;
			} else {
				ugsum += i;
			}
		}
		
		System.out.print("Besondere Werte des Arrays: \n"
				+ "Max: " + max + "\n"
				+ "Min: " + min + "\n"
				+ "Summe: " + sum + "\n"
				+ "Summe der geraden Zahlen: " + gsum + "\n"
				+ "Summe der ungeraden Zahlen: " + ugsum);
	}

}
