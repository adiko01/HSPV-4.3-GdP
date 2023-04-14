package uebung10;

import java.util.HashMap;
import java.util.Scanner;

public class Kuehlschrank {
	/**
	 * String: Lebensmittel
	 * Integer: Quantität (Menge)
	 */
	private HashMap<String, Integer> kuehlschrankInhalt;

    public Kuehlschrank() {
        kuehlschrankInhalt = new HashMap<String, Integer>();
    }
    
    /**
     * Füllen des Kühlschrankes
     * (Abfrage des Lebensmittels in der Konsole)
     * @throws KuehlschrankException
     */
    public void fuelle() throws KuehlschrankException {
        Scanner scanner = new Scanner(System.in);
        
        //Einlesen des Lebensmittels
        System.out.println("Geben Sie das Lebensmittel ein:");
        String lebensmittel = scanner.nextLine();
        
        //Prüfe, ob das Lebensmittel bereits im Kühlschrank ist
        if (kuehlschrankInhalt.containsKey(lebensmittel)) {
        	//Wenn ja, Hinweise
            System.out.print("Das Lebensmittel ist bereits im Kühlschrank. \n"
            		+ "Der akutelle bestand ist " + kuehlschrankInhalt.get(lebensmittel) + "\n"
            		+ "Neue Gesammtmenge: ");
        } else {
        	System.out.println("Geben Sie die Menge ein:");
        }
        int menge = 0;
        try {
        	//Lese die Menge ein und versuche diese zu einer Zahl zu Parsen
            menge = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
        	//Wenn Fehlgeschlagen, dann wurde kein int eingegeben
            throw new KuehlschrankException("Die Menge muss eine ganze Zahl sein.");
        }
        // Prüfe, ob die Menge negativ ist
        if (menge < 0) {
        	//Wenn Negativ werfe Fehler
            throw new KuehlschrankException("Die Menge muss größer oder gleich 0 sein.");
        }
        
        // Lege das Lebensmittel in den Kühlschrank
        kuehlschrankInhalt.put(lebensmittel, menge);
    }
    
    /**
     * Gibt die Menge eines Lebensmittels im Kühlschrank aus
     * (Abfrage des Lebensmittels in der Konsole)
     */
    public void ausgabeMenge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie das Lebensmittel ein:");
        String lebensmittel = scanner.nextLine();
        if (kuehlschrankInhalt.containsKey(lebensmittel)) {
            System.out.println("Menge von " + lebensmittel + ": " + kuehlschrankInhalt.get(lebensmittel));
        } else {
            System.out.println("Das Lebensmittel ist nicht im Kühlschrank.");
        }
    }
    /**
     * Gibt die Menge eines Lebensmittels im Kühlschrank aus
     * @param lebensmittel
     */
    public void ausgabeMenge(String lebensmittel) {
    	if (kuehlschrankInhalt.containsKey(lebensmittel)) {
            System.out.println("Menge von " + lebensmittel + ": " + kuehlschrankInhalt.get(lebensmittel));
        } else {
            System.out.println("Das Lebensmittel ist nicht im Kühlschrank.");
        }
    }
    
    /**
     * Gibt den Inhalt des Kühlschranks aus
     */
    public void ausgabeKuehlschrankInhalt() {
        if (kuehlschrankInhalt.isEmpty()) {
            System.out.println("Der Kühlschrank ist leer.");
        } else {
            System.out.println("Kühlschrankinhalt:");
            for (String lebensmittel : kuehlschrankInhalt.keySet()) {
                System.out.println(lebensmittel + ": " + kuehlschrankInhalt.get(lebensmittel));
            }
        }
    }
}
