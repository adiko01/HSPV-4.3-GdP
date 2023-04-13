package bonusaufgaben.Schleifen;

public class Level7 {
	/* Level 7
	 * Schreiben Sie ein Java-Programm, das eine Methode isPrime(int number) implementiert,
	 * die eine Zahl entgegennimmt und true zurückgibt, falls es sich dabei um eine Primzahl handelt, andernfalls false.
	 * Schreiben Sie danach eine Schleife, die die Primzahlen von 1 bis 100 auf der Konsole ausgibt.
	 */
	public static void main(String[] args) {
		System.out.print("Bonusaufgaben - Level 7 \n"
				+ "Priemzahlen\n"
				+ "\n");
		for (int i = 1 ; i <=100 ; i++) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}
	}
	
	private static boolean isPrime(int number) {
		for (int i = 2 ; i < number ; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
