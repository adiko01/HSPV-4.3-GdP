package beispiele.Exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Ausnahmen3 {

	public static void main(String[] args) {
		
		/*
		 * Gepr�fte Ausnahme 
		 */
		String dateiname = "test.txt";
		
		try {
			List<String> zeilen = Files.readAllLines(Paths.get(dateiname));
			
			for(String zeile : zeilen)
				System.out.println(zeile);
			
			Files.writeString(Paths.get("test2.txt"), "Hallo");
			
			
		} catch (IOException e) {
			System.out.println("Fehler");

			
		}
		
		
	}

}
