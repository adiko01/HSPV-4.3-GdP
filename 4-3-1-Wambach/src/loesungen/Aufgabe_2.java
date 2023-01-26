package loesungen;

public class Aufgabe_2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		
		int randomNumber = (int) (Math.random() * 5 + 1);
		int guess;
		
		System.out.println("Raten Sie eine Zahl zwischen 1 und 5: ");
		guess = new java.util.Scanner(System.in).nextInt();
		
		if ( guess == randomNumber)
		{
			System.out.println("Super! Das war richtig!");
		}
		
		System.out.println("Bitte starten Sie das Progamm neu, um noch einmal zu raten.");		

	}

}
