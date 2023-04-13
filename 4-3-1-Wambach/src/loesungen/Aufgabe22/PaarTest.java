package loesungen.Aufgabe22;

public class PaarTest
{

	public static void main(String[] args)
	{
		Paar<String, Integer> p1 = new Paar<>("Hallo", 1);
		String a = p1.getValueA();
		int b = p1.getValueB();
		System.out.println(a);
		System.out.println(b);
		System.out.println(p1);

		Paar<String, Paar<String, Integer>> p2 = new Paar<>("Hi", p1);
		a = p2.getValueA();
		p1 = p2.getValueB();
		System.out.println(a);
		System.out.println(p1);
		System.out.println(p2);

	}

}
