package uebung9;

import java.util.Scanner;

public class Aufgabe1 {
	/*Übungsblatt  9
	 * Aufgabe 1
	 * Implementieren Sie ein Programm, bei dem der Nutzer eine beliebige natürliche Zahl eingeben kann.
	 * Diese Zahl soll vom Programm dann in binärer, in oktaler und in hexadezimaler Darstellung ausgegeben werden.
	 * 
	 * Hinweis: Schauen Sie sich die Dokumentation einer bestimmten Wrapper-Klasse genauer an.
	 */
	public static void main (String[] args) {
		//Vorgeschafel
		System.out.print("Übungsblatt 9 - Aufgabe 1\n"
				+ "Zahlenkonverter\n"
				+ "\n");
		
		
		//Einlesen
		
		int nat;
		
		Scanner scanner = new Scanner(System.in);
        while (true) {
			try {
				System.out.print("Bitte geben Sie eine natürliche Zahl ein: ");
				nat = scanner.nextInt();
		        break;
		    } catch (Exception e) {
		    	System.out.println("Das war keine Natürliche Zahl oder sie war größer als für ein Integer erlaubt war, \n"
		    			+ "Bitte Probiere es erneut!"
		    			+ "\n");
		    	scanner.next();
		    }
        }	
		scanner.close();
		
        
        
        //Konvertieren
        // Binäre Darstellung
        String bin = Integer.toBinaryString(nat);
        
        // Oktale Darstellung
        String okt = Integer.toOctalString(nat);
        
        // Hexadezimale Darstellung
        String hex = Integer.toHexString(nat);
		
		//Ausgabe
		System.out.print("Darstellungsformen der Zahl " + nat + "\n"
				+ "Binär: " + bin + "\n"
				+ "Oktal: " + okt + "\n"
				+ "Hexa: " + hex);
	}
}
