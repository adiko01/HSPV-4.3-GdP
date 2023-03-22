package uebung7a.Aufgabe3;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntegerList te = new IntegerList();
		
		te.insertLast(500);
		te.insertLast(2);
		te.insertLast(0);
		te.insertLast(5);
		te.insertLast(77);
		te.insertLast(66);
		te.insertLast(11);
		System.out.println("Erste Element: " + te.getFirst() + "\n Anzahl der Elemente: " + te.getLength());

		
		te.deleteFirst();
		System.out.println("Erste Element: " + te.getFirst() + "\n Anzahl der Elemente: " + te.getLength());
		
		inListe(te, 66);
		inListe(te, 55);

		
	}
	
	static void inListe (IntegerList te, int i) {
		if (te.search(i)) {
			System.out.println("Die Zahl " + i + " ist in der Liste zufinden");
		} else {
			System.out.println("Die Zahl " + i + " ist NICHT in der Liste zufinden");
		}
	}

}
