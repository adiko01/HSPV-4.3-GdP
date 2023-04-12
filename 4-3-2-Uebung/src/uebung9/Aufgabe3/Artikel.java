package uebung9.Aufgabe3;

public class Artikel {
	private int id;
	private double preis;
	private double menge;
	
	Artikel (int id, double preis, double menge) {
		this.id = id;
		this.preis = preis;
		this.menge = menge;
	}
	
	public int getID () {
		return id;
	}
	public void setID (int id) {
		this.id = id;
	}
	
	public double getPreis () {
		return preis;
	}
	
	public void setPreis (double preis) {
		this.preis = preis;
	}
	
	public double getMenge()  {
		return menge;
	}
	
	public void setMenge(double menge)  {
		this.menge = menge;
	}
}
