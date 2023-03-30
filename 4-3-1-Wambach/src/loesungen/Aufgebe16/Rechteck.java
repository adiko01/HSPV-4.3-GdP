package loesungen.Aufgebe16;

public class Rechteck
{
	private double breite;
	private double hoehe;
	
	Rechteck (double b, double h)
	{
		this.breite = b;
		this.hoehe = h;
	}
	
	double getBreite ()
	{
		return this.breite;
	}
	
	double getHoehe()
	{
		return this.hoehe;
	}
	
	void setBreite(double b) { this.breite = b; }
	void setHoehe(double h) { this.hoehe = h; }
	
	double getFlaeche()
	{
		return this.breite * this.hoehe;
	}
	
}
