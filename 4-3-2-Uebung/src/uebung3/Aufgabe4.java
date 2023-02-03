package uebung3;

public class Aufgabe4 {
	/**
	 * Aufgabe 4
	 * Schreiben Sie ein Programm, das die Zahlen von 1 bis 100 zeilenweise auf der Konsole
	 * ausgibt. Bei jeder Zahl, die durch 3 teilbar ist, soll in derselben Zeile der Zusatz ist durch
	 * 3 teilbar“hinzugefugt werden
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1;i<=100;i++) {
			//Gebe die Zahl auf der Konsole aus (Ohne Zeilenumbruch)
			System.out.print(i);
			
			//Prüfe ob die Zahl modulo 3 den Rest Null hat
			if (i%3 == 0) {
				//Setze den Zusatz hinzu
				System.out.print(" ist durch 3 teilbar");
			}
			//Ergänze den fehlenden Zeilenumbruch
			System.out.print("\n");
		}
	}
}
