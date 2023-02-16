package aufgaben;

import java.util.Scanner;

public class Aufgabe_9 {
	
	/**Aufgabe 9:
	 * Schreiben Sie ein Programm, bei dem der Nutzer eine Menge von int-Zahlen
	 * eingeben kann, die in einem Array gespeichert werden. Der Nutzer soll vorab
	 * gefragt werden wie viele Zahlen er eingeben möchte.
	 * Für die im Array gespeicherten int-Werte soll im Anschluss die Summe und
	 * der Mittelwert berechnet und ausgegeben werden
	 */
	
	public static void main(String[] args) {
		System.out.print("Wie viele Zahlen, möchten Sie speichern [int]: ");
		//Erstelle einen Scanner
		Scanner s1 = new java.util.Scanner(System.in);
		
		// i = Anzahl der Felder im Array
		int i = s1.nextInt();
		
		//Beende den Scanner
		s1.close();
		
		int[] arr = new int[i];
		
		//Lese die Eingabe ein
		for (int p=0;p<i;p++) {
			//Erstelle einen Scanner
			Scanner s2 = new java.util.Scanner(System.in);
			
			System.out.print("Welche Zahl soll gespeichert werden? [int]: ");
			//Speichere die Eingabe im Array an der Stelle p
			arr[p] = s2.nextInt();
			
			//Beende den Scanner
			s2.close();
		}
		
		//Summiere die Felder auf
		int Sum = 0;
		for (int p=0; p<i; p++) {
			Sum += arr[p];
		}

		//Berechne den Mittelwert
		Double Mid = (double)Sum / i;
		
		//Ausgabe des Ergebnisses
		System.out.println("Die Summe der Zahlen ist " + Sum + " und der Mittelwert ist " + Mid);
	}

}
