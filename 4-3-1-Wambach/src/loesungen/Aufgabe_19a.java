package loesungen;


public class Aufgabe_19a
{

	public static void main(String[] args)
	{
		try
		{
			int result = 46 / 0;
			System.out.println("Das Ergebnis ist " + result);
		}
		finally
		{
			System.out.println("Das hier kommt IMMER.");
		}
		
		

	}

}
