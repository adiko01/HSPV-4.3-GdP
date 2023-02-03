package uebung3;

public class Aufgabe6c {
	/**
	 * Aufgabe 6
	 * a) Schreiben Sie ein Programm mit einer einfachen Schleife, das nacheinander die fol-
	 * genden Zahlen ausgibt
	 * 50; 47.5; 45; 42.5; 40; 37.5; 35; 32.5; 30; 27.5; 25
	 * b) Erweitern Sie Ihre Programm, indem Sie zusätzlich am Ende noch Summe und Mit-
	 * telwert der Zahlen ausgeben.
	 * c) Erweitern Sie Ihr Programm derart, dass der Nutzer zu Beginn den Startwert, den
	 * Endwert und Schrittweite eingeben kann. Anschließend soll mittels Schleife Summe
	 * und Mittelwert berechnet werden.
	 */
	
	public static void main (String[] args) {
		//Kleine Start Nachricht
		System.out.println("UEBUNG 3 - AUFGABE 6c\n\n");
		
		//Abfrage des Startwertes
		System.out.print("Startwert: ");
		int Start = new java.util.Scanner(System.in).nextInt();
		
		//Abfrage des Intervalls
		System.out.print("Intervall: ");
		double TempSteps = new java.util.Scanner(System.in).nextDouble();
		//Konvertier Intervall in das 10-Fache
		int Steps = (int) (TempSteps * 10);
		
		//Summe der Werte
		int Sum = 0;
		//Anzahl der Werte
		int Count = 0;
		
		//Zähle in i als Zehnfaches der beabsichtigten Zahl
		//Zur verhinderung von Rundungsfehlern
		int i = Start * 10;
		for (;i>=250;i=i-Steps) {
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
