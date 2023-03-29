package uebung7.Aufgabe4;

import java.util.ArrayList;

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
	
	/**Gibt eine ArrayList<Figur> zurück, welche 
	 * dem Flächeninhalt der Figuren nach geordnet ist.
	 * @param fig Figur mit der {@code this} verglichen werden soll
	 * @return {@code ArrayList<Figur>}
	 */
	public ArrayList<Figur> compare(Figur fig) {
		ArrayList<Figur> ret = new ArrayList<Figur>();
		if (this.getFlaeche()<fig.getFlaeche()) {
			//Figur this ist kleiner als fig
			ret.add(fig);
			ret.add(this);
		} else {
			// Figur this ist größer als fig oder
			// this und fig sind gleichgroß
			ret.add(this);
			ret.add(fig);
		}
		return ret;
	}
}