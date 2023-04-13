package loesungen.Aufgabe23;

public class StackTest
{

	public static void main(String[] args)
	{
		Stack<Integer> s = new Stack<>();
		
		s.push(4);
		s.push(7);
		s.push(1);
		s.push(1);
		
		while (!s.isEmpty())
		{
			System.out.println("Oberstes Element: " + s.peek());
			System.out.println("Ich entferne das Element: " + s.pop());
		}
	}

}
