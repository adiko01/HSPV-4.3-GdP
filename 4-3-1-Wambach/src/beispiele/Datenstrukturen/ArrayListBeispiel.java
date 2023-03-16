package beispiele.Datenstrukturen;

import java.awt.Point;
import java.util.ArrayList;

public class ArrayListBeispiel 
{

	public static void main(String[] args)
	{
		
		String text = "Das ist ein Text";
		System.out.println(text);
		
		String[] texte = new String[10];
		
		texte[0] = "Text 1";
		texte[1] = "Text 2";
		texte[2] = "Text 3";
		// ...
		texte[9] = "Text 10";
		
		for (int i=0;i<texte.length;i++)
		{
			System.out.println(texte[i]);
		}
		
		texte[2] = null;
		
		for (int i=0;i<texte.length;i++)
		{
			System.out.println(texte[i]);
		}
		
		//texte[10] = "Text 11";
		
		System.out.println("---");
		
		ArrayList<String> aListe = new ArrayList<String>();
		
		aListe.add("Text 1");
		aListe.add("Text 2");
		aListe.add("Text 3");
		aListe.add("Text 4");
		
		aListe.add(0,"Text 0");
		
		System.out.println(aListe.get(1));
		System.out.println(aListe.size());
		
		aListe.remove(1);
		
		System.out.println(aListe.get(1));
		System.out.println(aListe.size());
		
		
		ArrayList<Point> pListe = new ArrayList<Point>();
		pListe.add(new Point(3,3));
		System.out.println(pListe.get(0));
		
		
		for (String temp : aListe)
		{
			System.out.println("> " + temp);
		}
		
	}
	
}
