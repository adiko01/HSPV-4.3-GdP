package loesungen;


public class Aufgabe_6 {
	public static void main (String[] args)
	{
		System.out.println("Herzlich Willkommen beim Zahlenraten!");
		System.out.println("");
		
		boolean playAgain = false;
		
		
		
		do
		{
			int randomNumber = (int) (Math.random() * 100 + 1);
			int trials = 0;
			boolean won = false;
			
			do
			{
				trials++;
				System.out.print(trials + ". Versuch: ");
				int guess = new java.util.Scanner(System.in).nextInt();
				
				
				if (guess < randomNumber)
				{
					System.out.println("Die gesuchte Zahl ist größer.");
				}
				else if (guess > randomNumber)
				{
					System.out.println("Die gesuchte Zahl ist kleiner.");
				}
				else
				{
					won = true;
					System.out.println("Richtig!");
					System.out.println("Sie haben " + trials + " Versuche gebraucht.");
				}
			} while ( !won && trials < 10);
			
			if (!won)
			{
				System.out.println("Sie haben leider keine Versuche mehr");
				System.out.println("Die gesuchte Zahl war die " + randomNumber);
			}
			
			System.out.println("Möchten Sie noch einmal spielen? (y/n)");
			playAgain = switch(new java.util.Scanner(System.in).nextLine().toLowerCase().charAt(0))
					{
						case 'y' -> true;
						default -> false;
					};
			
			
			
		} while (playAgain);
		
		System.out.println("Auf Wiedersehen!");
		
	}

}
