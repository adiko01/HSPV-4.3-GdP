package beispiele.Arrays;


public class Felder1 {

	public static void main(String[] args) {
	
		
		int[] feld;
		feld = new int[5];
		
		feld[3] = 2;
		System.out.println(feld[3]);
		System.out.println(feld[0]);
		
		System.out.println(feld.length);
		
		int[] feld2 = new int[3];
		
		int[] x = feld;
		System.out.println(x[3]);
		
		for (int i=0; i<feld.length; i++)
		{
			System.out.println(i + "> " + feld[i]);
		}
		
		System.out.println(feld[5]); // Fehler, da nur 0 bis 4 möglich
		
		
		// Kopieren eines Arrays
		int[] temp = new int[10];
		for (int i=0;i<feld.length;i++)
		{
			temp[i] = feld[i];
		}
		feld = temp;
		
		
		int[] bsp = {5,4,3,2,1};
		
		//Alternative:
		int[] bsp2 = new int[5];
		bsp2[0] = 5;
		bsp2[1] = 4;
		bsp2[2] = 3;
		bsp2[3] = 2;
		bsp2[4] = 1;
		
		
		String[] arr = new String[10];
		
		
	}

}
