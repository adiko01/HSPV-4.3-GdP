package beispiele;


public class Variablen {

	public static void main(String[] args) {
		
		byte b = 100;
		System.out.println(b);
		
		b = 101;
		System.out.println(b);
		
		b = 99;
		System.out.println(b);
		
		
		// Falls doch mehr Platz benötigt wird
		int c = b;
		System.out.println(c);
		
		c = 500;
		
		System.out.println("b: " + b);
		System.out.println("c: "+ c);
	
		// CamelCase:
		boolean dasIstEinTest = true;
		
		
		// Definition einer Konstante mit dem Wert 8
		final int x = 8;
		System.out.println(x);
		// x = 9;   // Geht nicht, da Konstante
 		
	}

}
