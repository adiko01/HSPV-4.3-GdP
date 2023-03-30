package beispiele.Exceptions;

public class Ausnahmen2 {

	public static void main(String[] args) {
		
		
		/*
		 * Geprüfte Ausnahme
		 */
		
		System.out.println("start");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e)
		{
			
		}
		System.out.println("ende");
		
		
		

	}

}
