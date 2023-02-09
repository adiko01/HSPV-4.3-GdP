package beispiele.ObjekteUndKlassen;

import java.awt.Point;

public class Objekte {

	public static void main(String[] args) {
	
		// java.awt.Point p1 = new java.awt.Point();
		
		/*
		Point p1 = new Point();
		
		System.out.println(p1.x + " " + p1.y);
		p1.x = 5;
		System.out.println(p1.x + " " + p1.y);
		p1.y = 6;
		System.out.println(p1.x + " " + p1.y);
		
		
		Point p2 = new Point();
		System.out.println(p2.x + " " + p2.y);
		p2.x = 3;
		p2.y = 9;
		System.out.println(p2.x + " " + p2.y);
		
		System.out.println("-");
		System.out.println(p1);
		System.out.println(p2);
		
		System.out.println("-");
		
		System.out.println(p1);
		p1.move(17, 4);
		System.out.println(p1);
		p1.translate(1, 1);
		System.out.println(p1);
		
		*/
		
		Point p1 = new Point(2,4);
		Point p2 = new Point(7,6);
		
		System.out.println(p1);
		System.out.println(p2);
		
		p2 = p1; // Referenz auf das gleiche Objekt
		
		p2.x = 9;
		p2.y = 9;
		
		System.out.println(p1);
		System.out.println(p2);
		
		Point p3 = new Point(p1); //Kopie der Eigenschaften
		System.out.println(p3);
		
		
		
	
	}

}
