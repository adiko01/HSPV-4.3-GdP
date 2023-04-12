package uebung10;

public class Teste {
	public static void main (String[] args) {
		Kuehlschrank k = new Kuehlschrank ();
		
		try {
			k.fuelle();
			k.fuelle();
			k.fuelle();
		} catch (KuehlschrankException e) {
			
		}

		k.ausgabeMenge();
		
		k.ausgabeKuehlschrankInhalt();
	}
}
