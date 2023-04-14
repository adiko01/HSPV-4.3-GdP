package bonusaufgaben.AbstrakteKlassenUndExceptions.level4;

public class Level4 {

	public static void main(String[] args) {
		System.out.print("Bonusaufgaben - Abstrakte Klassen und Exceptions  - Level 4 \n"
				+ "\n"
				+ "\n");
		try {
			System.out.println(factorial(5));
			System.out.println(factorial(0));
			System.out.println(factorial(-5));
		} catch (NegativeNumberException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	private static int factorial(int n) throws NegativeNumberException {
		int fac = n;
		if (n < 0 ) {
			throw new NegativeNumberException();
		} else {
			for (int i = 1 ; i < n ; i++) {
				fac = fac * i;
			}
		}
		return fac;
	}
}
