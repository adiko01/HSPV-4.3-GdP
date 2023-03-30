package aufgaben;

public class Aufgabe18 {
	/*Aufgabe 18:
	 * Implementieren Sie eine statische Methode
	 * public static long sum (int n), die die Summe der Zahlen von 1
	 * bis n berechnet und zurückgibt. Wird als Parameter eine Zahl n<=0
	 * übergeben, so soll die Methode eine IllegalArgumentException
	 * auslösen.
	 */
	
	public static void main (String[] args) {
		
		// Material zum Testen der Exeption
		System.out.print("n=1 :  " + sum(1) + "\n"
				+ "n=10 :  " + sum(10) + "\n"
				+ "n=11 :  " + sum(11) + "\n"
				+ "n=100 :  " + sum(100) + "\n");
		System.out.println("Test mit 0 folgt:");
		System.out.println("n=0 :  " + sum(0));
	}
	
	
	/**
	 * Addiert alle Zahlen von 1 bis {@code n} auf.
	 * 
	 * @param n Oberegrenze zu der addiert werden soll
	 * @return Summe aller natürlichen Zahlen 
	 * @throws IllegalArgumentException Wenn {@code n} kleiner als 1 ist.
	 */
	public static long sum (int n) {
		if (n<=0) {
			throw new IllegalArgumentException();
		}
		int summe = 0;
		for (int i = 1 ; i <= n ;i++) {
			summe += i;
		}
		return summe;
	}
}
