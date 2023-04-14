package bonusaufgaben.Schleifen;

public class Level9 {
	/* Level 9
	 * Schreiben Sie ein Java-Programm, das eine Methode reverseString(String s)
	 * implementiert, die einen String umkehrt. Verwenden Sie dazu eine Schleife.
	 * Testen Sie Ihre Methode, indem Sie den String "Hello World" umkehren und auf der Konsole ausgeben.
	 */
	public static void main(String[] args) {
		System.out.print("Bonusaufgaben - Schleifen - Level 9 \n"
				+ "Stringumkehr\n"
				+ "\n");
		String s = "Hello World";
		System.out.println("String: " + s + "\n"
				+ "Umgekehrt: " + reverseString(s));
	}
	
	private static String reverseString(String s) {
		StringBuffer r = new StringBuffer();
		int i = 0;
		while (s.length() > r.length()) {
			r.append(s.charAt(s.length()-i-1));
			i++;
		}
		return r.toString();
	}
}
