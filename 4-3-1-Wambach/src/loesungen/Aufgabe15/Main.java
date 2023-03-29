package loesungen.Aufgabe15;


import java.util.ArrayList;

class Kurs
{
	ArrayList<Studierende> studierende = new ArrayList<Studierende>();
	ArrayList<Modul> modul = new ArrayList<Modul>();
	


	
}

class Studierende
{
	
}

class Modul
{
	Teilmodul tm1;
	Teilmodul tm2;
	Teilmodul tm3;
}

class Teilmodul
{
	Dozierende doz = null;
}

class Dozierende
{
	
}

public class Main
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Studierende s1 = new Studierende();
		Studierende s2 = new Studierende();
		Studierende s3 = new Studierende();
		
		Modul m = new Modul();
		
		Kurs k = new Kurs();
		
		k.studierende.add(s1);
		k.studierende.add(s2);
		k.studierende.add(s3);
		
		k.modul.add(m);
		
		
		Teilmodul tm1 = new Teilmodul();
		m.tm1 = tm1;
		
		Dozierende d = new Dozierende();
		
		tm1.doz = d;
		
		
	}

}
