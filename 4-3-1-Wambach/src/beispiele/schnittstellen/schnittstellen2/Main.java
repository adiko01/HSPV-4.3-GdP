package beispiele.schnittstellen.schnittstellen2;

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
		Journal j1 = new Journal("HSPV Newsletter", 4.23);
		Journal j2 = new Journal("Öffentliche Verwaltung für Fortgeschrittene", 3.23);
		Journal j3 = new Journal("Öffentliche Verwaltung für Einsteiger", 2.50);
		
		System.out.println("Gesamtsumme: " + calculateSum(c1, c2,j1,j2));
		
		/*
		 * Einfache Vergleiche sind damit möglich
		 */
		System.out.println(j1.compareTo(j2));
		
		/*
		 * Wegen Comparable lassen sich Journals jetzt sortieren
		 */
		Journal[] journals = {j1, j2, j3};
		java.util.Arrays.sort(journals);
		
		
		for (Journal j : journals)
			System.out.println("Name: " + j.name + " - " + j.price() + "€");
		

	}

}
