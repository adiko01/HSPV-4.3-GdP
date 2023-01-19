package datentypen;

public class Aufgabe_1 {
	/**
	 * Erstellen Sie ein Programm, bei dem Nutzer zunächst nach seinem Namen,
	 * dann nach seinem Alter und abschließend nach seiner Größe (in m) gefragt
	 * wird.
	 * Nach der Eingabe sollen alle Daten noch einmal auf der Konsole
	 * ausgegeben werden.
	 * Benennen Sie die Klasse mit Aufgabe_1
	 * Denken Sie an entsprechende Variablendeklarationen.
	 */
	
	public static void main (String[] args) {
		System.out.print("Wie lautet dein Name? ");
		String name = new java.util.Scanner(System.in).nextLine();
		
		System.out.print("Wie alt bist du? ");
		int alter = new java.util.Scanner(System.in).nextInt();
		
		System.out.print("Wie gross bist du in Metern? ");
		Double koerperD = new java.util.Scanner(System.in).nextDouble();
		
		// Formatiere den Double zur Ansicht
		String koerper = koerperD.toString().replace('.', ',');
		
		// Zeilenumbruch
		System.out.print("\n");
		
		// Ausgabe der Zusammenfasung
		System.out.println("Also ich fasse einmal zusammen:");
		System.out.println("Du bist " + name + ", " + alter + " Jahre alt und hast eine Koerpergroesse von " + koerper + " Meter.");
	}
}