package loesungen;


public class Aufgabe_7 {

	static int recursiveSum (int number)
	{
		if (number == 1)
			return 1;
		else
			return number + recursiveSum(number - 1 );
	}
	
	static int iterativSum (int number)
	{
		int sum=0;
		
		for (int i=1; i<=number; i++)
		{
			sum += i;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		
		int sum=0, n=0;
		boolean again = true;
		
		System.out.print("Summenberechnung");
		
		do
		{
			System.out.print("Bitte gewünschte Zahl n > 0 eingeben: ");
			n = new java.util.Scanner(System.in).nextInt();
			
			if (n<=0)
			{
				System.out.println("Bitte eine positive Ganzzahl eingeben!");
			}
			else
			{
				System.out.println ("Iterative Summe: " + iterativSum(n));
				System.out.println("Rekursive Summe: " + recursiveSum(n));
				
				System.out.println();
				System.out.println("Noch einmal? (j/n)");
				
				char c = new java.util.Scanner(System.in).nextLine().toLowerCase().charAt(0);
				if (c == 'j')
					again = true;
				else
					again = false;
			}
		} while (again);
	
		System.out.println("Auf Wiedersehen.");
	}
	

}
