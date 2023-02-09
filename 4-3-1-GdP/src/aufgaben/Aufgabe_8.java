package aufgaben;

import java.awt.Point;

public class Aufgabe_8 {
	/** Aufgabe 8:
	 * Setzen Sie auf dem Beispiel PointsAndDoors auf. Schreiben Sie ein kleines
	 * Spiel, bei dem der Nutzer die Position der Tür erraten muss. Diese wird
	 * zufällig in einer 10x10-Matrix positioniert. Der Spieler beginnt an Position
	 * (1,1). Der Spieler hat maximal 5 Versuche. Vor jedem Versuch wird die
	 * aktuelle Position des Spielers sowie die aktuelle Entfernung zur Tür auf der
	 * Konsole ausgegeben. Dann wird der Spieler gefragt wie viele Schritte er sich
	 * in x- bzw. y-Richtung bewegen will. Sofern die Position des Spielers mit der
	 * Tür übereinstimmt, hat dieser das Spiel gewonnen. Gelingt es dem Spieler in
	 * 5 Versuchen nicht die Tür zu erreichen, so wird hat der Spieler verloren und
	 * er bekommt die Position der Tür angezeigt.
	 */
	
	public static void main (String[] args) {
		/**
		 * Der Spieler
		 * 
		 * Start Koordinaten
		 * x = 1
		 * y = 1
		 */
		Point player = new Point(1,1);
		
		/**
		 * Die Tür
		 * 
		 * X- und Y-Koordinate werden zufällig erstellt
		 */
		Point door = new Point();
		door.x = (int) (Math.random() * 10 + 1);
		door.y = (int) (Math.random() * 10 + 1);
		//Cheat Zeile
		System.out.print(door + "\n- - - - - - - - - - \n");

		
		/** Anzahl der Versuche
		 */
		final int versuche = 5;
		
		for(int v = 1;v<=versuche;v++) {
			printMap(player);
			System.out.print("- - - - - - - - - - \n");
			System.out.print("Der Abstand zur Tür: " + player.distance(door) + "\n");
			System.out.print("Wie viele Schritte soll in X Richtung gegangen werden: ");
			int mvX = new java.util.Scanner(System.in).nextInt();
			
			//Abfangen von zu fehlerhaften Eingaben zu  X
			while (1 > (player.x + mvX) || (player.x + mvX) > 10) {
				System.out.print("Die Tür befindet sich in einer 10 X 10 Matrix, die eingegebene Bewegung kann daher nicht ausgeführt werden.\n");
				System.out.print("Wie viele Schritte soll in X Richtung gegangen werden: ");
				mvX = new java.util.Scanner(System.in).nextInt();;
			}
			
			System.out.print("Wie viele Schritte soll in Y Richtung gegangen werden: ");
			int mvY = new java.util.Scanner(System.in).nextInt();

			//Abfangen von zu fehlerhaften Eingaben zu Y
			while (1 > (player.y + mvY) || (player.y + mvY) > 10) {
				System.out.print("Die Tür befindet sich in einer 10 X 10 Matrix, die eingegebene Bewegung kann daher nicht ausgeführt werden.\n");
				System.out.print("Wie viele Schritte soll in X Richtung gegangen werden: ");
				mvX = new java.util.Scanner(System.in).nextInt();
			}
			
			//bewegen des Punktes
			player.translate(mvX, mvY);
			
			/*
			 * Der Spieler hat die Tür gefunden
			 */
			if (player.equals(door)) {
				System.out.println("Sie haben die Tür gefunden.");
				break;
			}
		}
		
		//Abfangen, das der Spieler die Tür nicht gefunden hat.
		if (!player.equals(door))	{
			System.out.println("Sie haben leider verloren.");
			System.out.println("Die Tür war bei: " + door.toString());
		}
		
	}
	
	private static void printMap (Point p) {
		/*
		 * Drucke die Karte in die Konsole
		 */
		for (int r=1; r<=10; r++) {
			for (int l=1; l<=10; l++) {
				if (p.x == l && p.y==r) {
					System.out.print("X");
				} else {
					System.out.print("O");
				}
				System.out.print(" ");
				if(r == 4 && l == 10) {
					System.out.print("          | O - Freie Felder");
				} else if(r == 5 && l == 10) {
					System.out.print("          | X - Position Spieler");
				}
			}
			System.out.print("\n");
		}
	}
}
