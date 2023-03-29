package beispiele.schnittstellen.schnittstellen1;

public class Main
{
	public static double calculateSum (Buyable first, Buyable... buyables)
	{
		double result = first.price();
		
		for (Buyable b : buyables)
		{
			result += b.price();
		}
		
		return result;	
	}
	
	public static void main(String[] args)
	{
		Chocolate c1 = new Chocolate();
		Chocolate c2 = new Chocolate();
		Journal j1 = new Journal(4.23);
		Journal j2 = new Journal(3.23);
		
		System.out.println("Gesamtsumme: " + calculateSum(c1, c2,j1,j2));

	}

}
