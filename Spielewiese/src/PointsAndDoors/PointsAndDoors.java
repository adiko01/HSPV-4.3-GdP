package PointsAndDoors;

import java.awt.Point;

public class PointsAndDoors {
	// Variablen
	private String Task;
	
	// Punkte
	private Point player = new Point();
	private Point enemy = new Point();
	private Point door = new Point();
	private Point money = new Point();
	
	PointsAndDoors() {
		// Variablen
		Task = "Sammele das Geldstück auf.";
		
		// Punkte
		player.move(1,1);
		enemy.x = (int) (Math.random() * 10 + 1);
		enemy.y = (int) (Math.random() * 10 + 1);
		door.x = (int) (Math.random() * 10 + 1);
		door.y = (int) (Math.random() * 10 + 1);
		money.x = (int) (Math.random() * 10 + 1);
		money.y = (int) (Math.random() * 10 + 1);
	}
	
	
	private Boolean isPointReachable(Point StartPoint, int dX, int dY) {
		
		int x = StartPoint.x + dX;
		int y = StartPoint.y + dY;
		
		if (x < 1 || x > 10) {
			return false;
		} else if (y < 1 || y > 10) {
			return false;
		}
		return true;
	}
	
	
	
	/**
	 * 
	 * @return ob das Geldstück gefunden wurde
	 */
	public boolean moneyFound () {
		if (money.x==-1||money.y==-1) {
			return true;
		}
		return false;
	}
	
	public void movePlayer (char c) {
		int dX = 0, dY = 0;
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
		}
		if (isPointReachable(player, dX, dY)) {
			player.translate(dX, dY);
		}
	}
	
	/**
	 * @return Aktuelle Aufgabe als String
	 */
	public String getTask () {
		return Task;
	}
	/**
	 * 
	 * @param obj ist ein Werte aus {@code GameObjects}
	 * @return Position des Objektes auf dem Spielfeld als {@code int}
	 */
	public int getPos (GameObjects obj) {
		// Rückgabe Wert
		int ret = 0;
		//Hilfspunkt
		Point p = new Point(-100,-100);
		if (obj == GameObjects.Player) {
			p = player;
		} else if (obj == GameObjects.Enemy) {
			p = enemy;
		} else if (obj == GameObjects.Door) {
			p = door;
		} else if (obj == GameObjects.Money) {
			p = money;
		}
		//    (Berechne die vollen Zeilen) * 10 Felder pro Zeile
		ret = (p.y - 1) * 10;
		ret = ret + p.x;
		ret = ret - 1;
		
		return ret;
	}
}
