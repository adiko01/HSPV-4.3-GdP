package uebung9;

public class Aufgabe2b {
	/* Aufgabe 2
	 * Addieren Sie in einer Schleife die Zahlen von 1 bis Integer.MAX_VALUE.
	 * Worauf müssen Sie beim Vergleich der Schleifenvariable mit Integer.MAX_VALUE achten?
	 * b) Ändern Sie den elementaren Datentyp long in die Wrapper-Klasse Long und messen Sie erneut.
	 */
	
	public static void main (String[] args) {
		//Vorgeschafel
		System.out.print("Uebungsblatt 9 - Aufgabe 2b\n"
					+ "Schleife zu Integer.MAX_VALUE\n"
					+ "\n");
				
				
		//Start Zeit
		long start = System.currentTimeMillis();
		
		
		Long sum = 0L;
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
