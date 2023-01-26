package beispiele.Kontrollstrukturen;

public class Beispiel_switch_01 {

	public static void main(String[] args) {
		
		System.out.println("Erste Zahl: ");
		double x = new java.util.Scanner(System.in).nextDouble();
		System.out.println("Operator: ");
		char operator = new java.util.Scanner(System.in).nextLine().charAt(0);
		System.out.println("Zweite Zahl: ");
		double y = new java.util.Scanner(System.in).nextDouble();
		
		
		switch (operator)
		{
			case '+':
				System.out.println(x+y);
			//	break;
			case '-':
				System.out.println(x-y);
			//	break;
			case '*':
				System.out.println(x*y);
			//	break;
			case '/':
				System.out.println(x/y);
			//	break;
		}
	}
}

