package beispiele.Methoden;


public class Methoden {

	public static void main(String[] args) {
		
		//System.out.println("Hello World");
		

		meineMethode("A", "A"); //A
		
		meineMethode("B", "B"); //B
		
		System.out.println(Hallo("C"));
		
		
	}

	public static void meineMethode(String vorname, String nachname)
	{
		System.out.println("Hello "+vorname + " " + nachname);
	}
	
	public static String Hallo(String name)
	{
		return "Hello " + name;
	}
	
}
