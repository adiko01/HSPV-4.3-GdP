package loesungen;

public class Aufgabe_1 {

	public static void main(String[] args) {
		
		String name;
		int age;
		float height;
		
		System.out.println ("Aufgabe 1:");
		
		System.out.print("Bitte geben Sie Ihren Namen ein: ");
		name = new java.util.Scanner (System.in).nextLine();
		
		System.out.print("Wie alt sind Sie: ");
		age = new java.util.Scanner (System.in).nextInt();
		
		System.out.print("Wie ist Ihre Körpergröße: ");
		height = new java.util.Scanner (System.in).nextFloat();
		
		// Noch einmal alles ausgeben
		System.out.println("Name: " + name);
		System.out.println("Alter: " + age);
		System.out.println("Größe: " + height);

	}

}
