package beispiele.DatentypenUndVariablen;


public class Operatoren {

	
	public static void main(String[] args)
	{
		
		// Unärer Operator (hier !)
		boolean x = !true;  // !(wahr)=falsch
		System.out.println(x);
		
		// hier - (minus)
		int i = 15;
		System.out.println(-i);
		
		//==============================
		
		
		// Binärer Operator
		int y = 5 - 3;   // -(5,3)=2
		int z = 5 - 3 - 2; // -(-(5,3),2)=0
		
		int a = 15 % 6; // Modulo Operation (Rest einer ganzzahligen Division)
		System.out.println(a);
		
		//==============================
		
		
		// Tertiärer Operator
		
		boolean b = (5>3) ? true : false; // =WENN(ausdruck;wennWahr;wennFalsch)
		
		
		
		/*
		 * 
		 * Operatoren mit Datentypen
		 * 
		 */
		
		System.out.println(5+3);
		System.out.println("5" + "3");
		
		// implizite Typkonvertierung
		int e = 5;
		System.out.println(e + 3.1); // Umwandlung von int nach double
		System.out.println(8/3); // keine Konvertierung: Ergebnis bleibt integer
		
		System.out.println(8/3.0); // Konvertierung von int nach double
		
		// expliziten Typkonvertierung
		
		//int x1 = new java.util.Scanner(System.in).nextInt();
		//int x2 = new java.util.Scanner(System.in).nextInt();
		int x1 = 8;
		int x2 = 5;
		
		//System.out.println(x1/x2);    // Ohne Nachkommaanteil
		System.out.println((double)x1/(double)x2);  //explizite Umwandlung nach double
		
		
		
	}
}
