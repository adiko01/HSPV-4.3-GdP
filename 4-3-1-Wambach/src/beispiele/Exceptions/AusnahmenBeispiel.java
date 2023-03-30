package beispiele.Exceptions;

public class AusnahmenBeispiel {

	
	public static void main(String[] args)
	{
		
		Student a = new Student();
		Student b = new Student();
		
		System.out.println(a.getMotivation());
		
		//a.schlafen();
		
		try {
			//a.lernen(-10);
			a.lernen(10);
		} catch (IllegalArgumentException | SchlafException e)
		{
			System.out.println(e.getMessage());
			
		} finally 
		{
			System.out.println("weiter geht es");
		}
		
		
		System.out.println(a.getMotivation());
		
		//a.schlafen();
		System.out.println(a.istWach());
		
		
		try {
			a.aufwachen();
		} catch (SchlafException e)
		{
			System.out.println("Fehler beim aufwachen.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println(a.getMotivation());
	}
}

class Student
{
	int motivation;
	boolean schlaeft;
	
	public Student()
	{
		motivation=100;
		schlaeft=false;
	}
	
	public void lernen(int wieviel) throws SchlafException
	{
		if (wieviel < 0)
			throw new IllegalArgumentException("Motivation darf nicht mehr werden");
		
		if (schlaeft)
			throw new SchlafException("Lernen geht nicht beim Schlafen!");
		
		motivation -= wieviel;
	}
	
	public int getMotivation()
	{
		return motivation;
	}
	
	public void schlafen()
	{
		schlaeft = true;
	}
	
	public void aufwachen() throws SchlafException
	{
		if (!schlaeft)
			throw new SchlafException("Person schl�ft nicht");
		
		schlaeft = false;
		motivation=100;
	}
	
	public boolean istWach()
	{
		return !schlaeft;
	}
	
}

class SchlafException extends Exception
{
	public SchlafException(String text)
	{
		super(text);
	}
}


