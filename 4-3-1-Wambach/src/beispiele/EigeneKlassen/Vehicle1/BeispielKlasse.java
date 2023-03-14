package beispiele.EigeneKlassen.Vehicle1;


public class BeispielKlasse 
{

	public static void main(String[] args)
	{
		Vehicle c = new Vehicle();
		
		Vehicle a = new Vehicle("Petra");
		//a.speed = 4.0;
		a.accelerate(4.0);
		//a.name = "Petra";
		//a.setName("Petra");
		
		Vehicle b = new Vehicle("Josef", Farbe.BLAU);
		//b.speed = 5.0;
		b.accelerate(5.0);
		//b.name = "Josef";
		//b.setName("Josef");
		
		
		a.print();
		b.print();
		
		a.accelerate(2);
		
		a.print();
		
		a.slowDown(5);
	
		a.print();
		
		a.slowDown(3);
		
		a.print();
		
		a.setName("Beate");

		a.print();
		
		System.out.println(Vehicle.count);
		//System.out.println(a.count);
		Vehicle.printCount();
	}
}


