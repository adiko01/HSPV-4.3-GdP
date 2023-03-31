package uebung8.Aufgabe4b;

public class PersonException extends IllegalArgumentException{
	PersonException () {
		super();
	}
	PersonException (String msg) {
		super(msg);
	}
}
