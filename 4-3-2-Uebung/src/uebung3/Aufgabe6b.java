package uebung3;

public class Aufgabe6b {
	/**
	 * Aufgabe 6
	 * a) Schreiben Sie ein Programm mit einer einfachen Schleife, das nacheinander die fol-
	 * genden Zahlen ausgibt
	 * 50; 47.5; 45; 42.5; 40; 37.5; 35; 32.5; 30; 27.5; 25
	 * b) Erweitern Sie Ihre Programm, indem Sie zusätzlich am Ende noch Summe und Mit-
	 * telwert der Zahlen ausgeben.
	 */
	
	public static void main (String[] args) {
		
		//Summe der Werte
		int Sum = 0;
		//Anzahl der Werte
		int Count = 0;
		
		
		//Zähle in i als Zehnfaches der beabsichtigten Zahl
		//Zur verhinderung von Rundungsfehlern
		for (int i=500;i>=250;i=i-25) {
			//Wandle die int in den gedachten double um
			double n = i / 10.0;
			//Gebe die Zahl aus
			System.out.println(n);
			//Summiere die Werte
			Sum += i;
			Count++;
		}
		
		//Ausgabe der Summe
		System.out.println("Die Summe ist: " + Sum);
		
		//Mittelwertberechnung
		double Middle = (Sum/10.0) / (double) Count;
		
		System.out.println("Der Mittelwert ist: " + Middle);
	}
}
