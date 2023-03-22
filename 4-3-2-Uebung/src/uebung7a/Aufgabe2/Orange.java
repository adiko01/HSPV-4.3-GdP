package uebung7a.Aufgabe2;

public class Orange extends Obst{
	
	final String Name;
	
	private Colors2 farbe;
	
	Orange () {
		Name = "Orange";
		farbe = Colors2.ORANGE;
	}
	
	/** @return Namen der Sorte zurück
	 */
	@Override
	String getName() {
		return Name;
	}

	/** @return Farbe des Orange
	 */
	@Override
	String getFarbe() {
		return farbe.toString();
	}

}
