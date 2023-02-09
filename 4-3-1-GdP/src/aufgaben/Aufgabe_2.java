package aufgaben;

public class Aufgabe_2 {
	/**
	 * Aufgabe 2
	 * Schreiben Sie ein Programm, bei dem eine Zufallszahl zwischen 1 und 5
	 * erzeugt wird. Anschließend wird der Nutzer aufgefordert diese Zahl per
	 * Eingabe in die Konsole zu erraten. Sofern die Zahl richtig geraten wird, soll
	 * die Zeichenkette "Super! Das war richtig!" angezeigt werden.
	 * Als letztes soll immer angezeigt werden, dass das Programm nun beendet
	 * wird und der Nutzer es neu starten soll, um erneut zu raten.
	 * 
	 * Hinweis:
	 * Die Anweisung Math.random() erzeugt eine zufällige Fließkommazahl
	 * zwischen 0 und 1
	 */
	public static void main (String[] args) {
		//Deklaration von der magicNumber
		int magicNumber;
		
		/* Methode mit Math.random()
		 * 
		 * Ansatz:
		 * Generiere eine zufällige Zahl (double) zwischen 0 und 1
		 * Danach multipliziere diese mit 100 (Jetzt sind nur noch Zahlen von 0 bis 100 [mit Nachkommastellen] möglich)
		 * Nun rechne Modulo 5 (Jetzt sind nur noch Zahlen von 0 bis 4 [mit Nachkommastellen] möglich)
		 * Addiere 1 (Jetzt sind Zahlen von 1 bis 5 [mit Nachkommastellen] möglich)
		 * Caste aus dem Double einen Int (Jetzt fallen alle Nachkommastellen weg)
		 * Fertig
		 */
		magicNumber = (int) (((Math.random() * 100) % 5) + 1);
		
		//Alternative Methode mittels einer vorgefertigten Klasse aus Java
		//magicNumber = ThreadLocalRandom.current().nextInt(1, 5 + 1);
		
		//Ausgabe der magicNumber zur Kontrolle
		//System.out.println(magicNumber);
		
		System.out.print("Welche (pseudo) Zufallszahl zwischen 0 und 5 hat Java gewaehlt? ");
		int i = new java.util.Scanner(System.in).nextInt();
		
		
		if (i==magicNumber) { //Ist die MagicNumber das gleiche wie die Eingabe?
			System.out.println("Super! Das war richtig!");
		} else if (i>5 || i<1) { //War die Eingabe im Intervall 1 bis 5?
			System.out.println("Die Zahl war nicht im Bereich zwischen 1 und 5 daher kann sie nicht die Zufallszahl sein.");
		} else {
			System.out.println("Das stimmt leider nicht, die Zahl war " + magicNumber);
		}
		System.out.println("Das Programm ist nun beendet! Um erneut zu spielen, bitte neustarten.");
	}
}
