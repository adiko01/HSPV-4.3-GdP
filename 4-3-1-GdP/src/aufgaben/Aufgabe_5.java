package aufgaben;

public class Aufgabe_5 {
	/** Aufgabe 5:
	 * Ein Kunde legt einen bestimmten Geldbetrag auf einem Konto an und
	 * bekommt dafür pro Jahr einen bestimmten Zinsanteil. Erstellen Sie ein
	 * Programm, das abfragt wieviel Geld der Kunde auf das Konto einzahlt und
	 * welchen Zinssatz er erhält. Listen Sie mithilfe einer Schleife auf, wie sich das
	 * Geld Jahr für Jahr vermehrt. Fragen Sie den Anwender wie viele Jahre er
	 * auflisten will.
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Das angelegte Kapital als Double
		System.out.print("Das anzulegende Kapital: ");
		double kap = new java.util.Scanner(System.in).nextDouble();
		//Den Zinssatz als Double
		System.out.print("Der Zinssatz in Prozent: ");
		double zins = new java.util.Scanner(System.in).nextDouble();
		//Die Anzahl der Jahre bzw. der Zinsausschüttungen
		System.out.print("Die Zeit in der das Kapital angelegt werden soll: ");
		int time = new java.util.Scanner(System.in).nextInt();
		
		for (int i = 0; i < time; i++) {
			kap = kap + (kap/100 * zins);
			System.out.println("Jahr " + i + ": " + (Math.round(kap * 100) / 100.0) + " EUR");
		}	
	}
}
