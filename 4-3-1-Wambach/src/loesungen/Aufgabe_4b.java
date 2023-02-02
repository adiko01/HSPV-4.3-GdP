package loesungen;


public class Aufgabe_4b {

	public static void main(String[] args) {
		System.out.print("Bitte Alter eingeben: ");
		
		int age = new java.util.Scanner(System.in).nextInt();
		
		
		// Variante 1
		switch (age)
		{
			case 16:
				System.out.println ("Du darfst Mofa fahren");
				break;
			case 18:
				System.out.println ("Sie sind volljährig");
				break;
			default:
				System.out.println("Das ist kein besonderes Alter");
		
		}
		
		// Variante 2
		switch (age)
		{
			case 16 ->
				System.out.println ("Du darfst Mofa fahren");
			case 18 ->
				System.out.println ("Sie sind volljährig");
			default ->
				System.out.println("Das ist kein besonderes Alter");
		
		}
		
		
		
		// exemplarisch Variante 3
		System.out.println(switch(age) {
					case 16 -> "Du darfst Mofa fahren";
					case 18 -> "Sie sind volljährig";
					default -> "Das ist kein besonderes Alter";
				});
			
	}

}
