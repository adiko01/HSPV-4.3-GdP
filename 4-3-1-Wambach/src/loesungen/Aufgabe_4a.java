package loesungen;


public class Aufgabe_4a {

	public static void main(String[] args) {
		
		System.out.print("Bitte geben Sie Ihr Gehalt ein: ");
		double salary = new java.util.Scanner(System.in).nextDouble();
		
		double taxRate = 0.0;
		
		if (salary <= 12000)
		{
			taxRate = 0.12;
		}
		else if (salary <= 20000)
		{
			taxRate = 0.15;
		}
		else if  (salary <= 30000)
		{
			taxRate = 0.20;
		}
		else
			taxRate = 0.25;
		
		
		System.out.println ("Die Steuerbelastung beträgt: " + taxRate*salary);
	}

}
