package SpielAusUebungsDreiAufgabeDrei;

import java.awt.Point;
import java.io.IOException;
import java.util.Scanner;

public class GAME {
	public static void main (String[] args) {
		
		while (true) {
			/*
			 * Der Spieler
			 */
			Point player = new Point(1,1);
			
			/*
			 * Der Gegenspieler
			 */
			Point enemy = new Point();
			enemy.x = (int) (Math.random() * 10 + 1);
			enemy.y = (int) (Math.random() * 10 + 1);
			
			/*
			 * Die Tür
			 */
			Point door = new Point();
			door.x = (int) (Math.random() * 10 + 1);
			door.y = (int) (Math.random() * 10 + 1);
			
			/*
			 * Das Geld
			 */
			Point money = new Point();
			money.x = (int) (Math.random() * 10 + 1);
			money.y = (int) (Math.random() * 10 + 1);
			
			//Wurde das Geld gefunden?
			boolean moneyFound = false;
			
			/*
			 * Die Aufgabe
			 */
			String task = "Sammel das Geldstück auf!";
			
			//Startet das Spiel
			game(player, enemy, door, money, moneyFound, task);
			
			System.out.println("In 5 Sekunden wird eine neue Runde gestartet \n"
					+ "Zum Abbrechen, das Fenster Schließen oder mit Strg + C das Programm beenden.");
			try {
				Thread.sleep(5000);
	        } catch (InterruptedException ignored) {
	        }
			
		}
	}
	
	private static void game(Point player, Point enemy, Point door, Point money, boolean moneyFound, String task) {
		System.out.print(
				  "# # # # # # # # # # # # # # # # # # # # # # # # # # # # # # #\n"
				+ "#               PointsAndDoors - VERSION 1.3                #\n"
				+ "#                        SPIELREGELN                        #\n"
				+ "# Bewege dich mit hilfe der Tasten auf dem 10x10 Spielfeld. #\n"
				+ "#       Mögliche bewegungen                                 #\n"
				+ "#        u      hoch                                        #\n"
				+ "#        d      runter                                      #\n"
				+ "#        r      rechts                                      #\n"
				+ "#        l      links                                       #\n"
				+ "#                                                           #\n"
				+ "# # # # # # # # # # # # # # # # # # # # # # # # # # # # # # #\n"
				);
		Boolean end = false;
		do {
			printMap(player, enemy, door, money, task);
			
			
			/*
			 * Spieler Bewegung
			 */
			Scanner s = new Scanner(System.in);
			
			do {
				int dX = -100;
				int dY = -100;
				
				System.out.print("Bewegung [u,d,l,r]: ");
								
				//char c = new Scanner(System.in).next().charAt(0);
				char c = s.next().charAt(0);
		
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
					//Ein Feld nach rechts
					dX = 1;
					dY = 0;
				} else {
					System.out.print("Das war kein Gültiges Zeichen [u,d,l,r]!");
				}
				
				
				if (isPointReachable(player,dX, dY)) {
					player.translate(dX, dY);
					break;
				} else {
					System.out.println("Dein gewähltes Ziel liegt außerhalb des Spielfeldes!");
				}
				
			} while(true);
			
			
			/*
			 * Gegenspieler Bewegung
			 */
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
			} while (!isPointReachable(enemy, dX, dY));
			enemy.translate(dX, dY);
			
			
			/*
			 * Auswerten, ob der Zug ein Ereignis ausgelößt hat.
			 * 
			 * Wenn der Spieler und der Gegner zeitgleich ein Ereignis auslösen,
			 * dann wird immer das Ereignis zu gunsten des Spielers ausgelößt.
			 */
			
			if (player.equals(money)) {
				moneyFound = true;
				money.move(-1, -1);
				task = "Begebe dich zur Tür!";
				System.out.println("Du hats das Geld gefunden!");
			} else if (player.equals(door) && moneyFound) {
				System.out.println("Du hats die Tür gefunden!");
				//Versuche die Klasse ConsoleArt aufzurufen
				try {
					SpielAusUebungsDreiAufgabeDrei.ConsoleArt.main("GEWONNEN");
				} catch (IOException e) {
					e.printStackTrace();
				}
				end = true;
			} else if (player.equals(door)) {
				System.out.println("Du musst erst das Geld aufsammeln um durch die Tür zu gehen!");
			} else if (enemy.equals(money)) {
				task = "Begebe dich zur Tür!";
				System.out.println("Dein Gegner hat das Geld gefunden, begebe dich schnell zur Tür!");
			} else if (enemy.equals(door) && moneyFound) {
				System.out.println("Du hast verloren, dein Gegner war schneller als du!");
				//Versuche die Klasse ConsoleArt aufzurufen
				try {
					SpielAusUebungsDreiAufgabeDrei.ConsoleArt.main("VERLOREN");
				} catch (IOException e) {
					e.printStackTrace();
				}
				end = true;
			}
		} while (!end);
		
	}
	
	private static Boolean isPointReachable(Point StartPoint, int dX, int dY) {
		
		int x = StartPoint.x + dX;
		int y = StartPoint.y + dY;
		
		if (x < 1 || x > 10) {
			return false;
		} else if (y < 1 || y > 10) {
			return false;
		}
		return true;
	}
	
	private static void printMap(Point player, Point enemy, Point door, Point money, String task) {
		/*
		 * Drucke die Karte in die Konsole
		 */
		System.out.print(
				  "- - - - - - - - - - - - - - - - - - - - -\n"
				+ "AUFGABE: " + task + "\n"
				+ "- - - - - - - - - - - - - - - - - - - - -\n"
				);
		
		for (int r=1; r<=10; r++) {
			for (int l=1; l<=10; l++) {
				if (player.x == l && player.y==r) {
					System.out.print("P");
				} else if (enemy.x == l && enemy.y==r) {
					System.out.print("G");
				} else if (door.x == l && door.y==r) {
					System.out.print("D");
				} else if (money.x == l && money.y==r) {
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
/** GAME Changelog
 *  Version 1.3 - 2023-02-22:
 *  * Fehlermeldung bei ungültigen Eingaben wird ausgegeben
 *  * Fehlermeldung beim ansteueren eines Punktes außerhalb des Spielfeldes wird ausgegeben
 *  * Zwischen dem Beenden des alten und dem Starten des neuen Spieles wird 5 Sekunden gewartet.
 *  Version 1.2 - 2023-02-22:
 *  * Kleiner Schreibfehler berichtigt
 *  * Das Spiel startet nach dem beenden einer Runde jetzt eine neue Runde
 *  Version 1.1 - 2023-02-22:
 *  * Spiel in PointsAndDoors umbenannt
 *  Version 1.0 - 2023-02-22:
 *  * Spiel Erstellt
 */
}
