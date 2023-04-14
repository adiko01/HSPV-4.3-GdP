package uebung9;

public class Aufgabe2a {
	/* Aufgabe 2
	 * Addieren Sie in einer Schleife die Zahlen von 1 bis Integer.MAX_VALUE.
	 * Worauf müssen Sie beim Vergleich der Schleifenvariable mit Integer.MAX_VALUE achten?
	 * a) Speichern Sie das Ergebnis in einer Variable des elementaren Datentyps long und messen Sie die Laufzeit.
	 */
	
	public static void main (String[] args) {
		//Vorgeschafel
		System.out.print("Uebungsblatt 9 - Aufgabe 2a\n"
					+ "Schleife zu Integer.MAX_VALUE\n"
					+ "\n");
				
				
		//Start Zeit
		long start = System.currentTimeMillis();
		
		@SuppressWarnings("unused") //Unterdrückt die Fehlermeldung
		long sum = 0;
		for (int i = 1 ; i < Integer.MAX_VALUE ; i++) {
			sum += i;
		}
		
		//Endzeit
		long end = System.currentTimeMillis();

		
		//Verbrauchte Zeit
		long used = end - start;
			
		System.out.print("Laufzeit in Millisekunden: " + used + "\n");
			        
			        
		
	}
}
