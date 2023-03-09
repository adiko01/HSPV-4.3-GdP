package loesungen;



public class Aufgabe_10 {
	
	static double average (int... values)
	{
		int sum=0;
		for (int i : values)
			sum += i;
		
		return (double) sum / values.length;
	}

	public static void main(String[] args) {
		System.out.print("Wie viele Zahlen möchten Sie eingeben: ");
		int count = new java.util.Scanner(System.in).nextInt();
		
		int[] numbers = new int[count];
		
		for (int i=0; i<count; i++)
		{
			System.out.print("Bitte geben Sie die " + (i+1) + ". Zahl ein: ");
			numbers[i] = new java.util.Scanner(System.in).nextInt();
		}
		
		/*
		 * Ausgabe des Mittelwerts
		 */
		System.out.println("Der Mittelwert ist: " + average(numbers));
	}

}
