package uebung3;

public class Aufgabe6a {
	/**
	 * Aufgabe 6
	 * a) Schreiben Sie ein Programm mit einer einfachen Schleife, das nacheinander die fol-
	 * genden Zahlen ausgibt
	 * 50; 47.5; 45; 42.5; 40; 37.5; 35; 32.5; 30; 27.5; 25
	 */
	
	public static void main (String[] args) {
		//Zähle in i als Zehnfaches der beabsichtigten Zahl
		//Zur Verhinderung von Rundungsfehlern
		for (int i=500;i>=250;i=i-25) {
			//Wandle die int in den gedachten double um
			double n = i / 10.0;
			//Gebe die Zahl aus
			System.out.println(n);
		}
	}
}