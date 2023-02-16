package beispiele.Arrays;


public class Felder2 {

	public static void main(String[] args) {
		
		int[] a = new int[5];
		a[0] = 1;
		a[4] = 2;
		
		System.out.println(summe(a));
		
	}
	
	
	public static int summe(int[] feld)
	{
		int summe = 0;
		for (int i=0;i<feld.length;i++)
		{
			summe += feld[i];
		}
		
		return summe;
	}

}
