package bonusaufgaben.Schleifen;

public class Level10 {
	/* Level 10
	 * Schreiben Sie eine Methode countOccurrences(char c, String s),
	 * die die Anzahl der Vorkommen eines bestimmten Zeichens c in einem String s zählt.
	 */
	public static void main(String[] args) {
		System.out.print("Bonusaufgaben - Level 10 \n"
				+ "Zeichen in String\n"
				+ "\n");
		
		System.out.println(countOccurrences('c', "ABCcc"));
		System.out.println(countOccurrencesIgnoreCases('c', "ABCcc"));
	}
	
	private static int countOccurrences(char c, String s) {
		int ret = 0;
		for (int i = 0 ; i < s.length() ; i++) {
			if (s.charAt(i) == c) {
				ret++;
			}
		}
		return ret;
	}
	
	private static int countOccurrencesIgnoreCases(char c, String s) {
		String f = String.valueOf(c);
		return countOccurrences(f.toLowerCase().charAt(0), s.toLowerCase());
	}
}
