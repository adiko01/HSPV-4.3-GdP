package uebung7.Aufgabe4;

public class Rechteck extends Figur {
	
	/*
	 * Länge
	 */
	private double a;
	
	/**
	 * breite
	 */
	private double b;
	
	/** Erstellt ein Rechteck
	 *  und weist diesem folgende Werte zu
	 *  Länge  0
	 *  Breite 0
	 */
	Rechteck() {
		this(0.0, 0.0);
	}
	
	/** Erstellt ein Rechteck
	 *  und weist diesem Werte zu.
	 *
	 * @param a Länge
	 * @param b Breite
	 */
	Rechteck(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	@Override
	void zeichne() {
		System.out.print("Das Rechteck hat folgende Maße:\n"
				+ "Länge: " + a + "\n"
				+ "Breite: " + b + "\n");		
	}

	@Override
	double getFlaeche() {
		return a * b;
	}
	
}
