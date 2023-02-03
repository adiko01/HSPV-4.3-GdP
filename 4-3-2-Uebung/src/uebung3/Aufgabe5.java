package uebung3;

public class Aufgabe5 {
	/**
	 * Wandeln Sie die folgende for-Schleife in eine while-Schleife um.
	 * int n, s=1;
	 * for(n=2; n<=5; System.out.print((s*=n++)+" "));
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Vorgegebene for Schleife
		int n, s=1;
		for(n=2; n<=5; System.out.print((s*=n++)+" "));
		System.out.println("\n\n");
		
		
		//Umgebaute While Schleife
		n=2;
		s=1;
		while(n<=5) {
			System.out.print((s*=n++)+" ");
		}
	}

}
