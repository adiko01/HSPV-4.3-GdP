package uebung8.Aufgabe4a;

public class Test {

	public static void main(String[] args) {
		
		// Teste, alles ist Richtig
		try {
			Person a = new Person("Müller", 55);
			System.out.println("Müller ging");
		} catch (IllegalArgumentException e) {
			System.out.println("Müller ging NICHT");
			e.printStackTrace();
		}
		
		// Teste, Person jünger als 0
		try {
			Person b = new Person("Maier", -5);
			System.out.println("Maier ging");
		} catch (IllegalArgumentException e) {
			System.out.println("Maier ging NICHT");
			e.printStackTrace();
		}
		
		// Teste, Person älter als 150
		try {
			Person c = new Person("Deeke", 155);
			System.out.println("Deeke ging");
		} catch (IllegalArgumentException e) {
			System.out.println("Deeke ging NICHT");
			e.printStackTrace();
		}
		
		// Teste, Person hat Nachname ""
		try {
			Person c = new Person("", 150);
			System.out.println("\"\" ging");
		} catch (IllegalArgumentException e) {
			System.out.println("\"\" ging NICHT");
			e.printStackTrace();
		}
		
		// Teste, Person hat Nachname null
		try {
			Person c = new Person(null, 150);
			System.out.println("null ging");
		} catch (IllegalArgumentException e) {
			System.out.println("null ging NICHT");
			e.printStackTrace();
		}
		
	}

}
