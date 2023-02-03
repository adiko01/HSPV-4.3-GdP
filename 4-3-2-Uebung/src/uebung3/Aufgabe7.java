package uebung3;

public class Aufgabe7 {
	/**
	 * Aufgabe 7
	 * Schreiben Sie ein Programm, bei dem der Nutzer eine beliebige Zahl zwischen 1 und 100
	 * eingeben kann. Die eingegebene Zahl soll schrittweise halbiert (und ausgegeben) werden,
	 * solange bis der halbierte Wert kleiner als 0,001 ist. Bei Programmende soll der Nutzer
	 * gefragt werden, ob er eine weitere Zahl eingeben möchte.
	 * 
	 */
	public static void main(String[] args) {
		//Erstelle eine Endlosschleife
		while(true) {
			//Rufe das Uterprogramm Halbieren auf
			Halbieren();
			//Fragt ab, ob eine weitere Zahl berechnet werden soll
			System.out.print("Soll eine weitere Zahl berechnet werden [Ja/Nein]: ");
			if (new java.util.Scanner(System.in).nextLine().toLowerCase().equals("ja")) {
				//Nothing happens
			} else {
				//Da nicht "Ja" eingegeben wurde, wird die Schleife beendet.
				break;
			}
		}
		

		

		
	}
	private static void Halbieren() {
		//Abfrage der Zajl
		System.out.print("Zahl: ");
		double i = new java.util.Scanner(System.in).nextDouble();

		while (i > 0.001) {
			//Teile i durch 2
			i = i / 2.0;
			//Schreibe i auf die Konsole
			System.out.println(i);
		}
	}
}
