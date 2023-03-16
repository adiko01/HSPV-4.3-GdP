package loesungen.Aufgabe13;


public class Aufgabe13
{
	
	public static void main(String[] args)
	{
		
		
		Person p = new Person("Max", "Mustermann");
		
		Person q = new Person(p);
		
		q.setAge(35);
		q.setEmail("Email?");
		
		System.out.println(q.getStatus());
	}

}
