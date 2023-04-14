package bonusaufgaben.AbstrakteKlassenUndExceptions.level3;

public class OverdraftException extends Exception {
	
	OverdraftException() {
		super();
	}
	
	OverdraftException(String msg) {
		super(msg);
	}
}
