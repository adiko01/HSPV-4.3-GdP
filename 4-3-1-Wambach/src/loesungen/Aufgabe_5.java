package loesungen;


public class Aufgabe_5 {

	public static void main(String[] args) {
			
		double kapital = 0.0;
		double zinssatz = 0.0;
		int laufzeit = 0;
		
		System.out.print("Welchen Geldbetrag wollen Sie anlegen: ");
		kapital = new java.util.Scanner(System.in).nextDouble();
		
		System.out.print("Welchen Zinssatz bekommen Sie: ");
		zinssatz = new java.util.Scanner(System.in).nextDouble();
		
		System.out.print("Wie viele Jahre wollen Sie auflisten: ");
		laufzeit = new java.util.Scanner(System.in).nextInt();

		
		for (int i=1; i <= laufzeit; i++)
		{
			kapital = kapital + kapital * zinssatz / 100;
			System.out.println("Nach " + i + " Jahren haben Sie: " + kapital + "€");
			
		}
		
		//System.out.println(((long)(kapital*100))/100.0);
		
		
		
	}

}
