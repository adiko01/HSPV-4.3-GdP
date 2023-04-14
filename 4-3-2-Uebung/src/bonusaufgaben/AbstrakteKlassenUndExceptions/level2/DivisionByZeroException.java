package bonusaufgaben.AbstrakteKlassenUndExceptions.level2;

public class DivisionByZeroException extends Exception {
	/**
	 * Exception für das Teilen durch 0
	 */
	private static final long serialVersionUID = 1L;
	DivisionByZeroException () {
		super();
	}
	/**
	 * Exception für das Teilen durch 0
	 * @param msg - Nachricht für die Fehlermeldung
	 */
	DivisionByZeroException (String msg) {
		super(msg);
	}
}
