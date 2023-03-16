package beispiele.Vererbung;

import java.util.ArrayList;

class Tier //extends Object
{
	String name;
	
	public Tier(String name)
	{
		this.name=name;
	}
	
	void bewegen()
	{
		System.out.println(name + " bewegt sich");
	}
	
	void gibLaut()
	{
		System.out.println("brrrr");
	}
	
	public String toString()
	{
		return name;
	}
	
}

class Hund extends Tier
{
	/* Attribute und Methoden von Tier vererbt */
	
	public Hund(String name)
	{
		super(name);
	}
	
	void bellen()
	{
		System.out.println("wuff");
	}
	
	void gibLaut()
	{
		bellen();
	}
	

}


class Katze extends Tier
{
	/* Attribute und Methoden von Tier vererbt */
	
	public Katze(String name)
	{
		super(name);
	}
	
	void miauen()
	{
		System.out.println("miau");
	}
	
	void gibLaut()
	{
		miauen();
	}
}




public class VererbungBeispiel {

	public static void main(String[] args) {
		
		Tier t = new Tier("Hugo");
		//t.name = "Hugo";
		t.bewegen();
		
		Hund h = new Hund("Otto");
		//h.name = "Otto";
		h.bewegen();
		h.bellen();
		
		Katze k = new Katze("Mautzi");
		//k.name = "Mautzi";
		k.bewegen();
		k.miauen();
		
		ArrayList<Tier> zoo = new ArrayList<Tier>();
		zoo.add(t);
		zoo.add(h);
		zoo.add(k);
		
		for (Tier temp : zoo)
		{
			temp.gibLaut();
		}
		
		Tier tierReferenz = new Katze("Katzi");
		tierReferenz.gibLaut();
		
		Katze katzeReferenz = (Katze)tierReferenz;
		katzeReferenz.miauen();
		
		System.out.println(k);

	}

}
