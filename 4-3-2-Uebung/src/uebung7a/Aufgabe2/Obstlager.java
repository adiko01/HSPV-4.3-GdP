package uebung7a.Aufgabe2;

public class Obstlager {
	
	
	
	public static void main(String[] args) {
		Obst[] obstlager = new Obst[5];
		obstlager[0] = new Apfel();
		obstlager[1] = new Birne();
		obstlager[2] = new Orange();
		obstlager[3] = new Apfel();
		obstlager[4] = new Apfel();
		
		print(obstlager);
	}
	
	static void print(Obst[] obstlager) {
		for (int i = 0; i < (obstlager.length - 1) ;i++) {
			System.out.print("Index " + i + " Name: " + obstlager[i].getName() + " Farbe: "+ obstlager[i].getFarbe() + "\n");
		}
	}
}
