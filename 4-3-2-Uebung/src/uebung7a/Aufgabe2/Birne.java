package uebung7a.Aufgabe2;

public class Birne extends Obst{
	
	final String Name;
	
	private Colors2 farbe;
	
	Birne () {
		Name = "Birne";
		farbe = Colors2.GRÜN;
	}
	
	/** @return Namen der Sorte zurück
	 */
	@Override
	String getName() {
		return Name;
	}

	/** @return Farbe des Birne
	 */
	@Override
	String getFarbe() {
		return farbe.toString();
	}

}
