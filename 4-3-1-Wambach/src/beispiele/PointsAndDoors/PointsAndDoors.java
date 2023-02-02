package beispiele.PointsAndDoors;

import java.awt.Point;

public class PointsAndDoors {
	
	public static void main (String[] args)
	{
		/*
		 * Erzeugung zweier Point-Objekte und Nutzung verschiedener Attribute und Methoden
		 */
		Point player = new Point();
		player.x = 10;
		player.y = 10;
		
		Point door = new Point();
		door.setLocation(10,  100);
				
		System.out.println("Abstand von Tür zum Spieler ist " + player.distance(door));
		
		/*
		 * JEDES Objekt kennt die Methode toString()
		 */
		System.out.println("Das player-Objekt ergibt bei der Konvertierung zu einem String: " + player);
		



	}

}
