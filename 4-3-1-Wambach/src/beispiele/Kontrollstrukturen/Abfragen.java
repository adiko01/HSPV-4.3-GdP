package beispiele.Kontrollstrukturen;


public class Abfragen {
	
	
	public static void main(String[] args)
	{
		
		/*
		int a = 5;
		int b = 3;
		
		System.out.println("1");
		
		if (a==b) 
			System.out.println("2"); 
		
		System.out.println("3");
		*/
		
		/*
		// Zufallszahl 
		int zufallszahl = (int)(Math.random()*5)+1;
		System.out.println(zufallszahl);
		
		int eingabe = 5;
		
		if (zufallszahl == eingabe)
		{
			// wenn Wahr
			System.out.println("Richtig geraten");
		} 
		else 
		{
			// wenn Falsch
			System.out.println("Falsch geraten");
			
			if (eingabe > zufallszahl) {
				System.out.println("Zufallszahl ist kleiner als Eingabe");
			} 
			else 
			{
				System.out.println("Zufallszahl ist größer als Eingabe");
			}
		}
		*/
		
		
		/* Zufallszahl */
		int zufallszahl = (int)(Math.random()*5)+1;
		System.out.println(zufallszahl);
		
		int eingabe = 5;
		
		if (zufallszahl == eingabe)
		{
			// wenn Wahr
			System.out.println("Richtig geraten");
		} 
		else if (zufallszahl > eingabe)
		{
			System.out.println("Falsch geraten");
			System.out.println("Zufallszahl ist größer als Eingabe");
		} 
		else //if (zufallszahl < eingabe)
		{
			System.out.println("Falsch geraten");
			System.out.println("Zufallszahl ist kleiner als Eingabe");
		}
			
			
			
	
		
	}

}
