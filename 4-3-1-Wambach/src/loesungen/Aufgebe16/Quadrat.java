package loesungen.Aufgebe16;

public class Quadrat extends Rechteck
{
	double laenge;
	
	Quadrat(double l)
	{
		super(l,l);
		this.laenge = l;
	}
	
	double getLaenge() { return laenge; }
	void setLaenge(double l) { 
		setBreite(l);
		setHoehe(l);
		laenge=l;}
	
	
}
