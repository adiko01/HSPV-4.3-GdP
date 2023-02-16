package loesungen;


public class Aufgabe_9 {

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
		 * Berechnung von Summe, Mittelwert und Ausgabe
		 */
		int sum=0;
		double average=0;
		for (int i=0; i<numbers.length; i++)
		{
			sum += numbers[i];
		}
		
		average = (double) sum / numbers.length;
		
		System.out.println("Die Summe ist: " + sum);
		System.out.println("Der Mittelwert ist: " + average);
	}

}
