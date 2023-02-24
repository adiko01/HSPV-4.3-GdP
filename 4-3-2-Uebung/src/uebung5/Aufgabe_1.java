package uebung5;

import java.util.Scanner;

public class Aufgabe_1 {
	/** Aufgabe 1
	 *  Schreiben Sie eine Methode, mittels der ein Nutzer drei Ganzzahlen eingeben kann, die
	 *  dann in einem Array gespeichert werden. Die Methode soll dieses Array zurückgeben.
	 *  Im Hauptprogramm sollen dann die Werte für zwei solcher Arrays eingelesen werden
	 *  und anschließend das Skalarprodukt der beiden Arrays ermittelt werden.
	 */
	
	public static void main (String[] args) {
		System.out.print("Übung 5 - Aufgabe 1\n\n"
				+ "Das Skalarprodukt von Zwei 3-Dimensionalen-Vektoren berechnen.\n"
				+ "Vektor 1:\n");
		int[] ARR1 = buildArry();
		System.out.print("Vektor 2:\n");
		int[] ARR2 = buildArry();
		
		int Scalar = 0;
		
		for (int i = 0; i<3 ; i++) {
			Scalar += ARR1[i] + ARR2[i];
		}
		System.out.println("\n\nDas Skalarprodukt der Vektoren ist: " + Scalar);
		}
	
	private static int[] buildArry() {
		Scanner s = new java.util.Scanner(System.in);
		
		int[] ARR = new int[3];
		
		for (int i=0;i<3;i++) {
			System.out.print("Bitte gib die INT für den Index " + i + " ein: ");
			ARR[i] = s.nextInt();
		}
		
		return ARR;
	}
}
