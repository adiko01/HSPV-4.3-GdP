package uebung7b.Aufgabe1;

import java.util.ArrayList;

public class TestFiguren {
	public static void main (String[] args) {
		System.out.print("Übung 7b Aufgabe \n");
		
		Kreis k = new Kreis(2.0);	
		System.out.print("Kreis: \n Fläche" + k.getFlaeche()+ "\n" + "\n");
		k.zeichne();
		
		Rechteck r = new Rechteck(5.0,6.4);
		System.out.print("Rechteck: \n Fläche" + r.getFlaeche() + "\n");
		r.zeichne();
		
		System.out.print("Vergleiche Kreis und Rechteck von oben\n");
		
		ArrayList<Figur> comp = k.compare(r);
		System.out.print("Wenn beide Figuren gleichgroß sind wird this als größere ausgegeben\n"
				+ "Größere: ");
		comp.get(0).zeichne();
		System.out.print("Kleinere: ");
		comp.get(1).zeichne();
	}
}
