package uebung9.Aufgabe3;

import java.util.Vector;

public class Warenkorb {
	private Vector <Artikel> vector = new Vector <Artikel>();
	
	public void add(Artikel artikel) {
		vector.add(artikel);
	}
	
	public double bestellwert() {
		double sum = 0;
		for (Artikel art : vector) {
			sum = sum + (art.getMenge() * art.getPreis());
		}
		return sum;
	}
}
