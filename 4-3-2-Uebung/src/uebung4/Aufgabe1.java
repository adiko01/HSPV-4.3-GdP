package uebung4;

public class Aufgabe1 {
	
	/**
	 * Aufgabe 1
	 * Der euklidische Algorithmus dient der Berechnung des größten, gemeinsamen Teilers
	 * ggT (a, b) von zwei ganzen Zahlen a und b. Dabei wird die kleinere Zahl von der größe-
	 * ren Zahl subtrahiert, solange bis beide Zahlen gleich sind. Schreiben Sie eine eigene
	 * rekursive Methode zur Implementierung des euklidischen Algorithmus. Erstellen Sie
	 * im Hauptteil Ihres Programms eine Routine, bei der der Nutzer nach den beiden Zahlen
	 * a und b gefragt wird. Nach der Berechnung des ggT soll der Nutzer dann entscheiden
	 * k önnen, ob er den ggT von zwei weiteren Zahlen berechnen lassen möchte
	 * 
	 */
	
	public static void main (String[] args) {
		System.out.print("GGT per euklindischem Algorithmus berechnen.\n");
		System.out.print("Zahl a: ");
		int a = new java.util.Scanner(System.in).nextInt();
		System.out.print("Zahl b: ");
		int b = new java.util.Scanner(System.in).nextInt();
		System.out.print("Der ggT ist: " + ggt(a,b));
		System.out.print("Wenn -1 zurückgegeben wird ist einer der Werte eine 0.\n");
	}
	
	private static int ggt(int a, int b) {
		if (a==b) {
			return a;
		} else if (a==0 || b==0) {
			return -1;
		} else if (a<b) {
			b=b-a;
		} else {
			a=a-b;
		}
		return ggt(a,b);
	}
}
