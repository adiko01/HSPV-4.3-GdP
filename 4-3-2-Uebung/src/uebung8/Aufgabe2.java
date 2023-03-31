package uebung8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Aufgabe2 {
	/* Aufgabe 2
	 * Eine Datei lässt sich in Java mit folgendem Quellcode einlesen:
	 * String filename = ....
	 * List<String> lines = Files.readAllLines(Paths.get(filename));
	 * 
	 * Erstellen Sie in Ihrem Projektordner eine eigene Datei, die aus mehreren Zeilen mit
	 * jeweils einem Wort besteht.
	 * Schreiben Sie ein Programm, das ermittelt, welches Wort in der Datei das längste ist.
	 * 
	 * Welche Ausnahmen müssen Sie dabei berücksichtigen?
	 * 
	 * Die IOException
	 */
	
	public static void main (String[] args) {
		Path path = Paths.get("src/uebung8/Uebung8Aufgabe2.txt");
		
		ArrayList<String> laengeste = new ArrayList<String>();
		laengeste.add("");
		try {
			List<String> lines = Files.readAllLines(path);
			
			for (String line : lines) {
				if (laengeste.get(0).length()<line.length()) {
					laengeste.clear();
					laengeste.add(line);
				} else if (laengeste.get(0).length()==line.length()) {
					laengeste.add(line);
				}
			}

			if (laengeste.size()==1) {
				System.out.print("Das längste Wort in der Liste war: " + laengeste.get(0));
			} else {
				System.out.print("Die längsten Wörter in der sind: \n");
				for (String word : laengeste) {
					System.out.println(" - " + word);
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
