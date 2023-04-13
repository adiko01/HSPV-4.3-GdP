package bonusaufgaben.Schleifen;

public class Level8 {
	/* Level 8
	 * Schreiben Sie ein Java-Programm, das eine Methode getFibonacci(int n) implementiert,
	 * die die n-te Fibonacci-Zahl zurückgibt. Verwenden Sie dazu eine Schleife.
	 * Testen Sie Ihre Methode, indem Sie die ersten 10 Fibonacci-Zahlen auf der Konsole ausgeben.
	 */
	public static void main(String[] args) {
		for (int i = 1 ; i <= 10 ; i++) {
			System.out.println(getFibonacci(i));
		}
	}
	private static int getFibonacci(int n) {
		
		if(n == 1 || n == 2) {
			return 1;
		}
		int a = 1;
		int b = 1;
		
		for (int i = 3 ; i<=n ; i++) {
			int h = a;
			a = b;
			b = b + h;
		}
		
		return b;
	}
}
