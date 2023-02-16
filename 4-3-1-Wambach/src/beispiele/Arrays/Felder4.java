package beispiele.Arrays;


public class Felder4 {

	public static void main(String[] args) {
		
		
		int[][] feld;
		
		feld = new int[5][3];
		
		feld[2][1] = 5;
		feld[0][2] = 1;
		
		for (int i=0; i<feld.length;i++)
		{
			for (int j=0; j<feld[i].length;j++)
			{
				System.out.println(i + " " + j + " ->" + feld[i][j]);
			}
		}
	}

}
