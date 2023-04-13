package loesungen.Aufgabe20;


public class Stack
{
	Node top;
	
	static class Node
	{
		int data;
		Node next;
	}
	
	void push (int elt)
	{
		// Lege ein Element oben auf den Stapel
		Node n = new Node();
		n.data = elt;
		n.next = top;
		top = n;
	}
	
	void pop ()
	{
		// Entferne das oberste Element
		if (top == null)
			return;
		
		top = top.next;
	}
	
		
	/*
	 * Ab hier ein kleines Testprogramm
	 */

	public static void main(String[] args)
	{
		Stack s = new Stack();
		
		/*
		 * 30 Werte auf den Stapel legen
		 */
		for (int i=1; i<=30; i++)
			s.push(i);
		
		
		/*
		 * Stapel auf der Konsole ausgeben
		 */
		while (s.top != null)
		{
			System.out.println(s.top.data);
			s.pop();			
		}
		
		

	}

}
