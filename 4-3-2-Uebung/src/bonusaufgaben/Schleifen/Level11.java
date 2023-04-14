package bonusaufgaben.Schleifen;

public class Level11 {
	/* Level 11
	 * Schreiben Sie eine Methode countVowels(String str),
	 * die zählt, wie viele Vokale in einem gegebenen String str enthalten sind.
	 */
	public static void main(String[] args) {
		System.out.print("Bonusaufgaben - Schleifen  - Level 11 \n"
				+ "Vokale in String\n"
				+ "\n");
		String str = "Baum Haus";
		System.out.println("Der String \"" + str + "\" enthält " + countVowels(str) + " Vokale.");
	}
	private static int countVowels(String str) {
		int ret = 0;
		for (int i = 0 ; i < str.length() ; i++) {
			if (str.charAt(i) == 'a' || 
					str.charAt(i) == 'e' ||
					str.charAt(i) == 'i' ||
					str.charAt(i) == 'o' ||
					str.charAt(i) == 'u') {
				ret++;
			}
		}
		return ret;
	}
}
