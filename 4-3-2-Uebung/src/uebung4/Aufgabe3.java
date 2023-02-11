package uebung4;

import java.awt.Point;

public class Aufgabe3 {
	/***
	 *  Das ist kein Beispiel für schönen Quellcode, aber er funktioniert
	 */
	
	
	/**Aufgabe 3
	 * Ändern Sie die  Übungsaufgabe 8 aus der Vorlesung (das Finden der Tür) wie folgt ab:
	 * • Fügen Sie ein Punkt-Objekt Geld hinzu, welches der Spieler aufsammeln muss,
	 * bevor er die Tür erreichen kann.
	 * • Fügen Sie einen Gegenspieler hinzu, der zu Beginn des Spiels zufällig positioniert
	 * wird und der sich horizontal, vertikal und diagonal bewegen kann
	 * • Der Spieler soll sich nur horizontal und vertikal bewegen können
	 * • Der Spieler soll mit einer Eingabe von u (up), d (down), l (left) und r (right)
	 * bewegt werden
	 * • Fügen Sie eine Ausgabe hinzu, bei der bei jedem Schritt die gesamte Matrix aus-
	 * gegeben wird. Der Spieler soll mit P, der Gegner mit G, das Geld mit $, und die
	 * Tür mit D markiert werden. Alle leeren Felder werden mit einem x dargestellt.
	 * Erstellen Sie für die Ausgabe eine eigene Methode
	 */
	
	public static void main (String[] args) {
		
		// Der Spieler
		Point player = new Point();
		
		// Der Gegenspieler
		Point enemy = new Point();
		
		// Das Geld
		Point money = new Point();
		//Wurde das Geld gefunden?
		Boolean foundmoney = false;
		
		// Die Tür
		Point door = new Point();
		
		while (true) {
			//Inizialisiert die Startvariabeln
			startGame(player, enemy, money, foundmoney, door);
			//Startet das Spiel
			playGame(player, enemy, money, foundmoney, door);
			System.out.print("\n\n\n Möchtest du noch eine Runde Spielen [ja, nein]? ");
			String a = new java.util.Scanner(System.in).nextLine();
			if (a.toLowerCase().equals("ja") || a.toLowerCase().equals("j") || a.toLowerCase().equals("yes") || a.toLowerCase().equals("y")) {
				//Zeilenumbrüche für die Optik
				System.out.print("\n\n\n");				
			} else {
				//Beende das Spiel
				break;
			}
		}
	}
	
	
	private static void startGame(Point player, Point enemy, Point money, Boolean foundmoney, Point door) {
		/**Der Spieler
		 * Start Koordinaten
		 * x = 1
		 * y = 1
		 */
		player.move(1,1);
		
		/**
		 * Der Gegenspieler
		 * 
		 * X- und Y-Koordinate werden zufällig erstellt
		 */
		enemy.x = (int) (Math.random() * 10 + 1);
		enemy.y = (int) (Math.random() * 10 + 1);
		
		/**
		 * Das Geld
		 * 
		 * X- und Y-Koordinate werden zufällig erstellt
		 */
		money.x = (int) (Math.random() * 10 + 1);
		money.y = (int) (Math.random() * 10 + 1);
		//Wurde das Geld gefunden?
		foundmoney = false;
		
		/**
		 * Die Tür
		 * 
		 * X- und Y-Koordinate werden zufällig erstellt
		 */
		door.x = (int) (Math.random() * 10 + 1);
		door.y = (int) (Math.random() * 10 + 1);
		
		System.out.print(
				  "# # # # # # # # # # # # # # # # # # # # # # # # # # # # # # #\n"
				+ "#                        SPIELREGELN                        #\n"
				+ "# Bewege dich mit hilfe der Tasten auf dem 10x10 Spielfeld. #\n"
				+ "#       Mögliche bewegungen                                 #\n"
				+ "#        u      hoch                                        #\n"
				+ "#        d      runter                                      #\n"
				+ "#        r      rechts                                      #\n"
				+ "#        l      links                                       #\n"
				+ "#                                                           #\n"
				+ "#       Aufgaben                                            #\n"
				+ "#             Sammel das Gelsdtück($) ein                   #\n"
				+ "#             Gehe durch die Tür(D)                         #\n"
				+ "# # # # # # # # # # # # # # # # # # # # # # # # # # # # # # #\n"
				);
	}
	
	private static void playGame(Point player, Point enemy, Point money, Boolean foundmoney, Point door) {
		while (true) {
			System.out.print("- - - - - - - - - - \n");
			printMap(player, enemy, door, money);
			System.out.print("- - - - - - - - - - \n");
			//System.out.print("Der Abstand zur Tür: " + player.distance(door) + "\n");
			
			//bewegen des Punktes
			player.setLocation(getMovement(player));
			
			/*
			 * Überprüfe das finden des Geldes
			 */
			if (player.equals(money)) {
				System.out.println("Sie haben das Geld gefunden.");
				foundmoney = true;
				money.move(0, 0);
			}
			/*
			 * Der Spieler hat die Tür gefunden und das Geld aufgesammelt
			 */
			if (player.equals(door) && foundmoney) {
				System.out.println("Sie haben die Tür gefunden.");
				break;
			}
			// Den Gegenspieler bewegen
			moveEnemy(enemy);
		}
		
		//Abfangen, das der Spieler die Tür nicht gefunden hat.
		if (!player.equals(door))	{
			System.out.println("Sie haben leider verloren.");
			System.out.println("Die Tür war bei: " + door.toString());
		}
	}
	private static Point getMovement(Point player) {
		
		/*
		 * Variable für die Bewegung
		 */
		int dX = 0;
		int dY = 0;
		
		do {
			System.out.print("Bewegung [u,d,l,r]: ");
			char c = new java.util.Scanner(System.in).next().charAt(0);
			
			if (c=='u') {
				// Ein Feld nach oben
				dX = 0;
				dY = -1;
			} else if (c=='d') {
				// Ein Feld nach unten
				dX = 0;
				dY = 1;
			} else if (c=='l') {
				//Ein Feld nach links
				dX = -1;
				dY = 0;
			} else if (c=='r') {
				//Ein Feld nach Rechts
				dX = 1;
				dY = 0;
			}
		} while (!isPointReachable(player, dX, dY));
		Point ret = new Point(player);
		ret.translate(dX, dY);
		return ret;
	}
	
	private static Boolean isPointReachable (Point pos, int mvX, int mvY) {
		/*
		 * Neuer Punkt
		 */
		Point vPl = new Point(pos);
		vPl.translate(mvX, mvY);
		
		if (vPl.x < 1 || vPl.x > 10) {
			return false;
		} else if (vPl.y < 1 || vPl.y > 10) {
			return false;
		}
		return true;
	}
	
	private static void moveEnemy(Point En) {
		int pos = (int) (Math.random() * 9 + 1);
		
		int dX = 0;
		int dY = 0;
		
		do {
			if (pos == 1) {
				dX = 1;
				dY = 0;
			} else if (pos == 2) {
				dX = 0;
				dY = 1;
			} else if (pos == 3) {
				dX = 1;
				dY = 1;
			} else if (pos == 4) {
				dX = 0;
				dY = 0;
			} else if (pos == 5) {
				dX = -1;
				dY = 0;
			} else if (pos == 6) {
				dX = 0;
				dY = -1;
			} else if (pos == 7) {
				dX = -1;
				dY = -1;
			} else if (pos == 8) {
				dX = -1;
				dY = 1;
			} else if (pos == 9) {
				dX = 1;
				dY = -1;
			}
		} while (!isPointReachable(En, dX, dY));
		En.translate(dX, dY);
	}
	
	private static void printMap(Point p, Point g, Point d, Point m) {
		/*
		 * Drucke die Karte in die Konsole
		 */
		for (int r=1; r<=10; r++) {
			for (int l=1; l<=10; l++) {
				if (p.x == l && p.y==r) {
					System.out.print("P");
				} else if (g.x == l && g.y==r) {
					System.out.print("G");
				} else if (d.x == l && d.y==r) {
					System.out.print("D");
				} else if (m.x == l && m.y==r) {
					System.out.print("$");
				} else {
					System.out.print("x");
				}
				System.out.print(" ");
				if(r == 4 && l == 10) {
					System.out.print("          | x - Freie Felder");
				} else if(r == 5 && l == 10) {
					System.out.print("          | P - Position Spieler");
				} else if(r == 6 && l == 10) {
					System.out.print("          | G - Position Gegenspieler");
				} else if(r == 7 && l == 10) {
					System.out.print("          | $ - Position Geld");
				}
			}
			System.out.print("\n");
		}
	}
}
