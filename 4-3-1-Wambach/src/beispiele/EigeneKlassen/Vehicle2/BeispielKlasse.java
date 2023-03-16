package beispiele.EigeneKlassen.Vehicle2;


import java.util.ArrayList;

public class BeispielKlasse 
{

	public static void main(String[] args)
	{

		Vehicle v1 = new Vehicle();
		Vehicle v2 = new Vehicle("Otto");
		
		
		v1.accelerate(5);
		
		v1.print();
		v2.print();
		
		Vehicle.printCount();
		
		ArrayList<Vehicle> vList = new ArrayList<Vehicle>();
		
		vList.add(v1);
		vList.add(v2);
		vList.add(new Vehicle());
		
		for( Vehicle temp : vList)
		{
			temp.print();
		}
		
	}
}


