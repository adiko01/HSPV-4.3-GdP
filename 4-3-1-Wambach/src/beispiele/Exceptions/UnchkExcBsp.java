package beispiele.Exceptions;



public class UnchkExcBsp
{

	public static void main(String[] args)
	{
		/*
		 * NumberFormatExceptions
		 */
		
		int vatRate = Integer.parseInt("19");
		//vatRate = Integer.parseInt("19%");
		
		
		try 
		{
			vatRate = Integer.parseInt("19%");
		}
		catch (NumberFormatException ex)
		{
			System.out.println("Das lässt sich so nicht parsen!");
		}
		
		
	}

}
