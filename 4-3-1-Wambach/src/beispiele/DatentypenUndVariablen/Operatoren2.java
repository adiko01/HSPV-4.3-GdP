package beispiele.DatentypenUndVariablen;

public class Operatoren2 {

	
	public static void main(String[] args)
	{
		/*
		int i = 5;
		i = 6;
		System.out.println(i);
		
		//i = 7 / 0;
		//System.out.println(i);
		
		double j;
		j = 8.0 / 0;
		System.out.println(j);
		
		System.out.println(2023 % 4);
		*/
		
		int i = 5;
		i = i + 1;
		//System.out.println(i);
		
		// i = 6
		i++;  // i = i + 1  (Post-Inkrement)
		//System.out.println(i); //7
		
		i--; // i = i - 1 (Post-Dekrement)
		//System.out.println(i); //6
		
		i = 6;
		System.out.println(i++); //6
		// Erhöhung
		System.out.println(i); //7
		
		System.out.println(++i); //8 (Prä-Inkrement)
		System.out.println(--i); //7 (Prä-Dekrement)
		
		int a = 1;
		
		a += 2; // a = a + 2 (Verbundoperator)
		System.out.println(a);
		
		
		int m = 4;
		int n = 5;
		
		System.out.println(m==n);
		System.out.println(m!=n);
		System.out.println(m<=n);
		
		boolean q = true;
		boolean w = false;
		boolean e = false;
		
		System.out.println((q || w) && e);  // (q oder w) und e
		
		System.out.println(e^w);  // e xor w
		
		System.out.println(!q); // nicht q
		
		
		int h = 5;  //  0000...00101  (5)
		System.out.println(h);
		h = h << 1;  // 0000...01010  (10)
		System.out.println(h);
		
		
		int f = 4;  // 000..00100
		int g = 5;  // 000..00101
		//             ----------
		//             000..00101  (oder)
		
		System.out.println(f|g);
		
		System.out.println((double)8 / 0); // explizite Typkonvertierung
		
	}
}

