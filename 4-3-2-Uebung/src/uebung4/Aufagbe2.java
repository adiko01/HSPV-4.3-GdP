package uebung4;

public class Aufagbe2 {
	/**Aufgabe 2
	 * Die Funktion isPrime(p) sei wie folgt rekursiv definiert:
	 * isPrime(p) := isPrime(p, p − 1)
	 * isPrime(p, 1) := true
	 * isPrime(p, z ) := false, falls p durch z teilbar ist
	 * isPrime(p, z ) := isPrime(p, z − 1), falls p nicht durch z teilbar ist
	 * Implementieren Sie eine entsprechende rekursive Methode und schreiben Sie wieüblich
	 * ein Hauptprogramm, bei dem der Nutzer Zahlen mehrfach eingeben kann.
	 */
	
	public static void main (String[] args) {
		System.out.println("Bitte gebe die zuprüfende ganzzahlige Zahl ein: ");
		int p = new java.util.Scanner(System.in).nextInt();
		if (isPrime(p)) {
			System.out.print("Die Zahl " + p + " ist eine Primzahl!");
		} else {
			System.out.print("Die Zahl " + p + " ist KEINE Primzahl!");
		}
	}
	
	public static Boolean isPrime(int p) {
		return isPrime(p, p-1);
	}
	public static Boolean isPrime(int p, int z) {
		
		if (z == 1) {
			return true;
		}
		if ((p % z)==0) {
			return false;
		} else {
			return isPrime(p, z-1);
		}
	}
}
