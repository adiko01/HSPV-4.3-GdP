package beispiele.Exceptions;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Pattern;

/*
 * Wir erstellen eine Anwendung, die eine Webseite Zeile für Zeile ausliest und
 * alle darin enthaltenen E-Mail-Adressen extrahiert
 * 
 * Zum Einsatz kommen dazu die Klasse Scanner und die Klasse URL.
 * 
 * Dabei können mehrere Ausnahmen auftreten, z.B. wenn der Klasse URL eine falsche URL im 
 * Konstruktor übermittelt wird.
 * 
 * Ob Konstruktoren/Methoden eine Exception auslösen, kann in der API nachgelesen werden 
 */

public class MultipleExcBsp
{

	
	
	public static void main(String[] args)
	{
		printAllEmailAddresses ("https://www.rheinwerk-verlag.de/hilfe/service-und-kontakt_8");
	}

	
	static void printAllEmailAddresses (String urlString)
	{
		try
		{
			URL url = new URL(urlString);
			Scanner scanner = new Scanner (url.openStream());
			Pattern pattern = Pattern.compile("[\\w|-]+@\\w[\\w|-]*\\.[a-z]{2,3}");
			
			for (String email; (email = scanner.findWithinHorizon(pattern, 0)) != null; )
			{
				System.out.println(email);
			}
		}
		catch (MalformedURLException m)
		{
			System.err.println("Falsche URL übertragen!");
		}
		catch (IOException m)
		{
			System.err.println("URL konnte nicht geöffnet werden.");
		}
	}
	
}
