package beispiele.Zeichenketten;


public class Zeichenketten2 {

	public static void main(String[] args) {
		
		
		String name = "Ich";
		
		System.out.println(name);
		
		System.out.println(Character.toLowerCase('D'));
		
		System.out.println(name.toLowerCase());
		
		System.out.println(name.equalsIgnoreCase("ich"));
		//System.out.println(name.toUpperCase().equals("ich".toUpperCase()));
		
		/*
		String ergebnis = "";
		for (int i=0;i<100;i++)
		{
			ergebnis = ergebnis + i+ " ";
		}
		System.out.println(ergebnis);
		*/
		
		System.out.println(name.length());
		name.isEmpty();
		System.out.println(name.charAt(2));
		
		System.out.println("Ich habe keine Lust".contains(name));
		
		String[] arr = {"A", "B", "C"};
		
		for (String x : arr)
		{
			System.out.print("," + x);
		}
		System.out.println();
		System.out.println(String.join(",", arr));
		
		int i = 6;
		String a = String.valueOf(i);
		System.out.println(a);
		
	}

}
