package uebung7.Aufgabe2;

public class Apfel extends Obst{
	
	final String Name;
	
	private Colors2 farbe;
	
	Apfel () {
		Name = "Apfel";
		farbe = Colors2.GRÜN;
	}
	
	
	/** @return Namen der Sorte zurück
	 */
	@Override
	String getName() {
		return Name;
	}

	/** @return Farbe des Apfels
	 */
	@Override
	String getFarbe() {
		return farbe.toString();
	}

}
