package bonusaufgaben.Schleifen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Level5 {
	/* Level 5
	 * Schreibe ein Java-Programm,
	 * das die Fibonacci-Zahlen bis zu einer vom Benutzer eingegebenen Zahl ausgibt.
	 */
	public static void main(String[] args) {
		System.out.print("Bonusaufgaben - Level 5 \n"
				+ "Fibonacci-Zahlen\n"
				+ "\n");
		while (true) {
			try {
				Scanner s = new Scanner(System.in);
				System.out.print("Bitte gebe den int ein, bis zu der die Fibonacci-Folge berechnet werden soll: ");
				int n = s.nextInt();
				System.out.println("\n Die Fibonacci-Folge bis " + n + " lautet:");
				fibo(n);
				break;
			} catch (InputMismatchException e) {
				System.out.println("Das war kein gültiger int!!");
			}
		}
	}
	private static void fibo (int n) {
		int a = 1;
		int b = 1;
		System.out.println(a);
		System.out.println(b);
		while (a < n && b<n) {
			//Zwischenspeicher für das alte a
			int i = a;
			//Das alte a mit dem neuen Überschreiben
			a = b;
			//Addiere auf b das alte a
			b += i;
			
			//Ausgabe
			System.out.println(b);
		}
	}
}
