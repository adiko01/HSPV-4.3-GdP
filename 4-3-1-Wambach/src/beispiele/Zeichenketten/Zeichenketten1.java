package beispiele.Zeichenketten;


public class Zeichenketten1 {

	public static void main(String[] args) {
		
		
		String a = new String("Hallo");
		System.out.println(a);
		
		
		String b = "Hallo";
		System.out.println(b);

		String c = "Hallo" + "123";
		System.out.println(c);
		
		System.out.println(c.charAt(0));
		System.out.println(c.charAt(1));
		System.out.println(c.length());
		
		for (int i=0;i<c.length();i++)
			System.out.println(c.charAt(i));
		
		char zeichen = c.charAt(0);
		System.out.println((char)(zeichen+3));
		
		
		//String m = new String("Hallo");
		//String n = new String("Hallo");
		
		String m = "Hallo";
		String n = new String("Hallo");
		
		System.out.println(m.equals(n));
		

		
	}

}
