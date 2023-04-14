package bonusaufgaben.Schleifen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Level4 {
	/* Level 4
	 * Schreibe ein Java-Programm, das die Fakultät einer Zahl berechnet.
	 * Verwenden Sie dazu eine Schleife. Der Benutzer sollte eine Zahl eingeben können,
	 * für die die Fakultät berechnet wird.
	 */
	public static void main(String[] args) {
		System.out.print("Bonusaufgaben - Schleifen  - Level 4 \n"
				+ "Fakultatät\n"
				+ "\n");
		while (true) {
			try {
				Scanner s = new Scanner(System.in);
				System.out.print("Bitte gebe den int ein, für den die Fakultät berechnet werden soll: ");
				int n = s.nextInt();
				System.out.println("\n Die Fakultät von " + n + " ist " + fac(n) + " !");
				break;
			} catch (InputMismatchException e) {
				System.out.println("Das war kein gültiger int!!");
			}
		}
	}
	
	private static int fac (int n) {
		int fac = n;
		for (int i = 1 ; i <= n ; i++) {
			n--;
			fac = fac * n;
		}
		return fac;
	}
}
