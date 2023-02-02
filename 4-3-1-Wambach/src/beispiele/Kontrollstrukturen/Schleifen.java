package beispiele.Kontrollstrukturen;


public class Schleifen {

	public static void main(String[] args)
	{
		
		int summe=0;
		
		// for (Deklaration/Startwert ; Bedingung ; Schleifeninkrement  )
		for (int i=0; i<10 ; i=i+2)		//Schleifenkopf
		{								//Schleifenrumpf
			System.out.println(i);
			summe = summe + i;  				//summe +=i;
			
		}
		System.out.println(summe);
		System.out.println("Ende");
		
		
		
		for (int i=10; i>= 0; i--)
		{
			System.out.println(i);
		}

		
	}
	
}
