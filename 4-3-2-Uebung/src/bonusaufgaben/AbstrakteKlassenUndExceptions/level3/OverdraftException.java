package bonusaufgaben.AbstrakteKlassenUndExceptions.level3;

@SuppressWarnings("serial")
public class OverdraftException extends Exception {

	/**
	 * Fehlermeldung beim Abheben über den Deckungsbetrag des Kontos hinaus
	 */
	OverdraftException() {
		super();
	}
	
	/**
	 * Fehlermeldung beim Abheben über den Deckungsbetrag des Kontos hinaus
	 * @param msg - Nachricht für die Fehlermeldung
	 */
	OverdraftException(String msg) {
		super(msg);
	}
}
