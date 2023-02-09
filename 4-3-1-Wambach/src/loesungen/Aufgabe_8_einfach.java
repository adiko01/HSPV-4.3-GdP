package loesungen;

import java.awt.Point;


public class Aufgabe_8_einfach {

	public static void main(String[] args) {
		Point player = new Point(1,1);
		Point door = new Point();
		
		door.x = (int) (Math.random() * 10 + 1);
		door.y = (int) (Math.random() * 10 + 1);
		
		int trials = 0;
		
		do
		{
			System.out.println("Der Spieler befindet sich an Position: " + player.toString());
			System.out.println("Die aktuelle Entfernung von Spieler und Tür beträgt: " + player.distance(door));
			
			System.out.print("Wie viele Schritte möchten Sie sich in der x-Koordinate bewegen: ");
			int dx = new java.util.Scanner(System.in).nextInt();
			
			System.out.print("Wie viele Schritte möchten Sie sich in der y-Koordinate bewegen: ");
			int dy = new java.util.Scanner(System.in).nextInt();
			
			trials++;
			
			player.translate(dx, dy);
			
			if (player.getX()==door.getX() && player.getY()==door.getY())
			{
				System.out.println("Sie haben gewonnen.");
				break;
			}
			
		} while ((trials < 10));
		
		System.out.println("Die Tür war bei: " + door.toString());
		
		
	}

}
