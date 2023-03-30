package uebung7.Aufgabe5;

public class HiWi implements StudHilfskraft{
	private int MatrNr;
	private String Name;
	private double Gehalt;
	private int Dauer;
	
	@Override
	public int getMatrNr() {
		return MatrNr;
	}

	@Override
	public void setMatrNr(int matrNr) {
		MatrNr = matrNr;
		
	}

	@Override
	public String getName() {
		return Name;
	}

	@Override
	public void setName(String name) {
		Name = name;
	}

	@Override
	public double getGehalt() {
		return Gehalt;
	}

	@Override
	public void setGehalt(double gehalt) {
		Gehalt = gehalt;		
	}

	@Override
	public int getDauer() {
		return Dauer;
	}

	@Override
	public void setDauer(int dauer) {
		Dauer = dauer;		
	}

}
