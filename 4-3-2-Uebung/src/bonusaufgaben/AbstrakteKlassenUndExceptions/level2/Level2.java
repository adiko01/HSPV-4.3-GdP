package bonusaufgaben.AbstrakteKlassenUndExceptions.level2;

public class Level2 {
	/* Level 2
	 * Schreiben Sie eine Methode divide(int a, int b),
	 * die a durch b teilt. 
	 * Wenn b 0 ist, soll eine Exception DivisionByZeroException geworfen werden.
	 * Schreiben Sie ein Java-Programm, das die divide()-Methode aufruft
	 * und die Exception abfängt, falls sie geworfen wird.
	 */
	public static void main(String[] args) {
		try {
			System.out.println(divide(1,2));
			System.out.println(divide(1,0));
		} catch (DivisionByZeroException e) {
			e.printStackTrace();
		}
	}
	private static double divide(int a, int b) throws DivisionByZeroException{
		if (b == 0) {
			throw new DivisionByZeroException();
		}
		return a / (double) b;
	}
}
