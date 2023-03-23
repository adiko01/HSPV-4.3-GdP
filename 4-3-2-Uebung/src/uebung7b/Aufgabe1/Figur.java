package uebung7b.Aufgabe1;

public abstract class Figur implements Comparable {
	/** Aufgabe 1
	 * Erstellen Sie eine Klasse Figur mit den abstrakten Methoden:
	 * * abstract void zeichne()
	 * * abstract double getFlaeche()
	 * 
	 * Die Klassen Kreis und Rechteck sind von Figur abgeleitet und implementieren die beiden
	 * Methoden. Schreiben Sie ein Testprogramm, das die beiden Methoden für verschiedene
	 * Figuren testet.
	 * Hinweis: Die Methode zeichne soll auf der Konsole nur die Eigenschaften des Objekts
	 * (also Breite und Höhe bzw. Radius) und den Flächeninhalt ausgeben.
	 */
	
	abstract void zeichne();
	
	abstract double getFlaeche();
}
