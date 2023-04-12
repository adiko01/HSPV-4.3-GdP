package uebung9.Aufgabe3;

public class Teste {

	public static void main(String[] args) {
		//Vorgeschafel
		System.out.print("Uebungsblatt 9 - Aufgabe 3\n"
						+ "Artikel und Warenkorb\n"
						+ "\n");
		
		
		// TODO Auto-generated method stub
		Artikel Baum = new Artikel (2 , 3.0 , 1.0);
		Artikel Bambus = new Artikel (3 , 50.0 , 1.2);
		
		Warenkorb w = new Warenkorb();
		w.add(Baum);
		w.add(Bambus);
		
		System.out.println("Wert des Warenkorbes: " + w.bestellwert());
	}

}
