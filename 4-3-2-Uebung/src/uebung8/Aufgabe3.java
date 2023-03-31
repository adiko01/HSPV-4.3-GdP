package uebung8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Aufgabe3 {
	/* Aufgabe 3
	 * Schreiben Sie ein Programm, das analog zu Aufgabe 2 eine Datei ein eine String-Liste
	 * einliest. Die Datei soll aber in diesem Fall pro Zeile eine Zahl beinhalten.
	 * Konvertieren Sie die eingelesenen Zeilen so, dass die Zahlen in ein Double-Array ein-
	 * gelesen werden. Achten Sie auf Ausnahmen derart, dass bei fehlerhaften Einträgen das
	 * Programm nicht abbricht, sondern die entsprechende Zeile ignoriert und die fehlerhafte
	 * Zeile auf der Konsole ausgegeben wird.
	 */
	
	public static void main (String[] args) {
		Path path = Paths.get("src/uebung8/Uebung8Aufgabe3.txt");
		
		ArrayList<Double> laengeste = new ArrayList<Double>();
		try {
			//Einlesen der Zeilen als String
			List<String> lines = Files.readAllLines(path);
			
			//Arry für die in eine Double geparsten Werte 
			ArrayList<Double> values = new ArrayList<Double>();
			
			//Konvertiere die Strings nach Double
			for (String line : lines) {
				try {
					values.add(Double.parseDouble(line));
				} catch (NullPointerException | NumberFormatException e) {
					System.out.println("Diese Zeile ist keine Zahl (oder sie ist geößer als, dass es für eine Double erlaubt ist): " + line);
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
