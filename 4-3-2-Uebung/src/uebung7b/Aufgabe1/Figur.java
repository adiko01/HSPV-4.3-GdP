package uebung7b.Aufgabe1;

public abstract class Figur {
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
	
	/**
	 * Vergleicht die Fläche zweier Figuren
	 * @param fig mit der Verglichen werden soll.
	 * @return {@code true} ist die Figur {@code fig} kleiner als {@code this} - {@code false} wenn gegenteillig
	 */
	Boolean Comparable(Figur fig) {
		if (this.getFlaeche()>fig.getFlaeche()) {
			return true;
		} else {
			return false;
		}
	}
}
