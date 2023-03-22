package uebung7b.Aufgabe1;

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
		
		if(k.Comparable(r)) {
			System.out.println("Der Kreis ist größer als das Rechteck!");
		} else {
			System.out.println("Der Kreis ist kleiner als das Rechteck!");
		}
	}
}
