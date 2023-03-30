package beispiele.Exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Ausnahmen4 {

	public static void main(String[] args) {
		
		/*
		 * Gepr�fte Ausnahme 
		 */
		while(true)
		{
			
			try {
				String dateiname = new Scanner(System.in).nextLine();
				einlesen(dateiname);
				break;
			} catch (IOException e)
			{
				System.out.println("Datei nicht gefunden.");
			}
			
		}
		System.out.println("Programm geht weiter");
		
	}
	
	public static void einlesen(String dateiname) throws IOException {

		List<String> zeilen = Files.readAllLines(Paths.get(dateiname));
		
		for(String zeile : zeilen)
			System.out.println(zeile);
			

	}
	

}
