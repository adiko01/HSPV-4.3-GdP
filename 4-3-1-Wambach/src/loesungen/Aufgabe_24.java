package loesungen;

import java.util.Hashtable;
import java.util.Map.Entry;

import javax.swing.JOptionPane;

public class Aufgabe_24
{

	public static void main(String[] args)
	{
		Hashtable<String, String> vokabeln = new Hashtable<>();
		boolean again = false;
		
		do
		{
			try
			{
				String english = new JOptionPane().showInputDialog("Welches englische Wort wollen Sie lernen: ");
				String deutsch = new JOptionPane().showInputDialog("Geben Sie die Übersetzung für " + english + " ein:");
			
				vokabeln.put(english, deutsch);
			
				again = new JOptionPane().showInputDialog("Ein weiteres Wort?").toLowerCase().charAt(0) == 'j';
			
			}
			catch (NullPointerException exp)
			{
				// Tritt auf, wenn nichts in eines der beiden Eingabefelder eingegeben wird (Taste abbrechen)
				System.out.println("Sie müssen beide Eingabefelder befüllen.");
				again = true;
			}
		} while (again);
		

		// Ausgabe der Map
		for (Entry<String, String> elemente : vokabeln.entrySet())
		{
			System.out.println(elemente.getKey() + " --> " + elemente.getValue());
		}
		

	}

}
