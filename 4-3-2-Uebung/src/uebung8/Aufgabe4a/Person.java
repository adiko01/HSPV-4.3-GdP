package uebung8.Aufgabe4a;

public class Person {
	
	String vorname;
	String nachname;
	int alter;
	
	Person (String nachname, int alter) {
		this("", nachname, alter);
	}
	
	Person (String vorname, String nachname, int alter) {
		this.vorname = vorname;
		
		if (nachname == null || nachname.equals("")) {
			throw new IllegalArgumentException("Nachname darf nicht leer sein!");
		}
		if (0 > alter || alter > 150) {
			throw new IllegalArgumentException("Das Alter muss im Bereich 0 bis 150 liegen!");
		}
		this.nachname = nachname;
		this.alter = alter;
	}
}
