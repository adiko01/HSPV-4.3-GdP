package uebung10;

@SuppressWarnings("serial")
public class KuehlschrankException extends Exception {
	
	/**
	 * Ein Kühlschrankfehler
	 */
	KuehlschrankException () {
		super();
	}
	/**
	 * Ein Hühlschrankfehler
	 * @param msg - Nachricht für die Fehlermeldung
	 */
	KuehlschrankException (String msg) {
		super(msg);
	}
}
