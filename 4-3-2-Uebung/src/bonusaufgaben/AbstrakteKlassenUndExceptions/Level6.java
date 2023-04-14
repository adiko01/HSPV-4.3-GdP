package bonusaufgaben.AbstrakteKlassenUndExceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.List;

public class Level6 {
	/* Level 6
	 * Schreiben Sie eine Methode readFile(String filename),
	 * die den Inhalt einer Datei mit dem angegebenen Dateinamen liest.
	 * Wenn die Datei nicht gefunden wird,
	 * soll eine Exception FileNotFoundException geworfen werden.
	 * Schreiben Sie ein Java-Programm, das die readFile()-Methode aufruft
	 * und die Exception abfängt, falls sie geworfen wird.
	 */
	public static void main(String[] args) {
		System.out.print("Bonusaufgaben - Abstrakte Klassen und Exceptions  - Level 6 \n"
				+ "\n"
				+ "\n");
		try {
			readFile("bla");
		} catch (NoSuchFileException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static void readFile (String filename) throws NoSuchFileException {
		try {
			List<String> lines = Files.readAllLines(Paths.get(filename));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
