package beispiele.EigeneKlassen.Vehicle1;


public class Vehicle {
	private double speed; //Objektattribut
	private String name;  //Objektattribut
	private Farbe farbe; //Objektattribut
	
	static int count; //Klassenattribut
	
	public Vehicle()
	{
		this("kein Name", Farbe.SCHWARZ);
	}
	
	public Vehicle(String name)
	{
		/*speed = 0;
		this.name = name;
		this.farbe="schwarz";
		count=count+1;*/
		this(name, Farbe.SCHWARZ);
	}
	
	public Vehicle(String name, Farbe farbe)
	{
		speed = 0;
		this.name = name;
		this.farbe=farbe;
		count=count+1;
	}
	
	public void accelerate(double v)
	{
		speed = speed + v;
	}
	
	public void slowDown(double v)
	{
		speed = speed - v;
		
		if (speed<0)
			speed=0;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void print()
	{
		System.out.println(name + ": " + speed + " km/h");
	}
	
	public static void printCount()
	{
		System.out.println("Anzahl der Fahrzeuge: " + count);
	}
	
}
