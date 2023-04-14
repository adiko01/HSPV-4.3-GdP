package uebung8.Aufgabe4b;

@SuppressWarnings("serial")
public class PersonException extends IllegalArgumentException{
	
	/**
	 * Personen Fehler
	 */
	PersonException () {
		super();
	}
	
	/**
	 * Personen Fehler
	 * @param msg - Nachricht für die Fehlermeldung
	 */
	PersonException (String msg) {
		super(msg);
	}
}
