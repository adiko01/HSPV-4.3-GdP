package bonusaufgaben.AbstrakteKlassenUndExceptions.level2;

public class DivisionByZeroException extends Exception {
	DivisionByZeroException () {
		super();
	}
	DivisionByZeroException (String msg) {
		super(msg);
	}
}
