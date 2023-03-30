package beispiele.InnereKlassen.LokaleKlasse;

public class Liste
{
	private Element kopf, ende;
	
	private static class Element
	{
		private Object obj;
		private Element next;
	}
	
	public void add (Object obj)
	{
		if (obj == null)
			return;
		
		Element neu = new Element();
		neu.obj = obj;
		
		if (kopf == null)
			kopf = ende = neu;
		else
		{
			ende.next = neu;
			ende = neu;
		}
	}
	
	public Iterator iterator() //Methode der Klasse Liste
	{
		class IteratorImpl implements Iterator //Klassendefinition in Methode
		{
			private Element e = kopf;
			
			public boolean hasNext()
			{
				return e != null;
			}
			
			public Object next()
			{
				if (e ==null)
				{
					return null;
				}
				
				Object obj = e.obj;
				e = e.next;
				return obj;
			}
		}
		
		return new IteratorImpl();
	}
}
