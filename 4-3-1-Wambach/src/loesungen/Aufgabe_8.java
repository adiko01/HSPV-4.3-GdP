package loesungen;


public class Aufgabe_8 {

	public static void main(String[] args) {
		java.awt.Point player = new java.awt.Point();
		java.awt.Point door = new java.awt.Point();
		
		player.x = player.y = 1;
		
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
			
		} while ((trials < 10) && (!player.equals(door)));
		
		if (player.equals(door))
		{
			System.out.println("Sie haben gewonnen.");
		}
		else
		{
			System.out.println("Sie haben leider verloren.");
			System.out.println("Die Tür war bei: " + door.toString());
		}
		
	}

}
