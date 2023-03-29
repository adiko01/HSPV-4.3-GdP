package uebung7.Aufgabe1;

public class Kreis extends Figur{

	/*
	 * Radius
	 */
	private double r;
	
	/** Erstellt einen Kreis
	 *  und weist diesem den Radius 0 zu.
	 */
	Kreis () {
		this(0.0);
	}
	
	/** Erstellt einen Kreis
	 * und weist diesem den Radius r zu.
	 * @param r
	 */
	Kreis(double r) {
		this.r = r;
	}
	
	@Override
	void zeichne() {
		System.out.println("Radius = " + r);
	}

	@Override
	double getFlaeche() {
		return r * Math.PI;
	}

}
