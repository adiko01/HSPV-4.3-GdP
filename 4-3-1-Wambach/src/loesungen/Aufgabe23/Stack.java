package loesungen.Aufgabe23;
import java.util.ArrayList;

public class Stack<T>
{
	private ArrayList<T> items;
	
	public Stack()
	{
		items = new ArrayList<T>();
	}
	
	public boolean isEmpty()
	{
		return items.isEmpty();
	}
	
	public T push (T newItem)
	{
		items.add(0, newItem);
		return newItem;
	}
	
	public T pop ()
	{
		T element = items.get(0);
		items.remove(0);
		return element;
	}
	
	public T peek()
	{
		return items.get(0);
	}

}
