package bonusaufgaben.AbstrakteKlassenUndExceptions;

public class Level7 {
	/* Level 7
	 * Schreiben Sie eine Methode parseInteger(String s),
	 * die eine Zeichenkette in eine ganze Zahl umwandelt.
	 * Wenn die Zeichenkette nicht als ganze Zahl interpretiert werden kann,
	 * soll eine Exception NumberFormatException geworfen werden.
	 * Schreiben Sie ein Java-Programm, das die parseInteger()-Methode aufruft
	 * und die Exception abfängt, falls sie geworfen wird.
	 */
	public static void main(String[] args) {
		System.out.print("Bonusaufgaben - Abstrakte Klassen und Exceptions  - Level 7 \n"
				+ "\n"
				+ "\n");
		System.out.println(parseInteger("5"));
		System.out.println(parseInteger("a"));
		
	}
	private static int parseInteger(String s) throws NumberFormatException{
		return Integer.parseInt(s);
	}
}
