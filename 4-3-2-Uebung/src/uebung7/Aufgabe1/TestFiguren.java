package uebung7.Aufgabe1;

public class TestFiguren {
	public static void main (String[] args) {
		Kreis k = new Kreis(2.0);	
		System.out.print("Kreis: \n Fläche" + k.getFlaeche()+ "\n" + "\n");
		k.zeichne();
		
		Rechteck r = new Rechteck(5.0,6.4);
		System.out.print("Rechteck: \n Fläche" + r.getFlaeche() + "\n");
		r.zeichne();
	}
}
