package bonusaufgaben.Schleifen;

public class Level6 {
	/* Level 6
	 * Schreiben Sie eine Methode calculatePower(int base, int exponent),
	 * die die Potenz von base^exponent berechnet. Verwenden Sie dazu eine Schleife.
	 */
	public static void main(String[] args) {
		System.out.println(calculatePower(2,10));
	}
	private static int calculatePower(int base, int exponent) {
		int ret = base;
		for (int i = 1; i < exponent ; i++) {
			ret = ret * base;
		}
		return ret;
	}
}
