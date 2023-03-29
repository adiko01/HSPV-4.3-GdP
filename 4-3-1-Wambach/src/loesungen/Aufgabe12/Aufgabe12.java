package loesungen.Aufgabe12;

import java.awt.Point;

public class Aufgabe12
{
	
	public static void main(String[] args)
	{
		
		
		Person p1 = new Person("Max", "Mustermann", 35);
		

		Person p2 = new Person(p1);
		p2.setAge(40);

		
		p2=null;
		

		p2.getAge();

	}

}
