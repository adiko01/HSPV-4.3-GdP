package beispiele.Methoden;


public class Methoden3 {

	public static void main(String[] args) {
		
	
		// 5! = 1*2*3*4*5

		System.out.println(fak_interativ(8));
		System.out.println(fak(8));
	}
	
	public static long fak_interativ(int n)
	{
		long fak=1;
		for (int i=1;i<=n;i++)
			fak=fak*i;
		return fak;
	}
	
	public static long fak(int n)
	{
		if (n<=1)
			return 1;
		
		return fak(n-1)*n; //1*2*3*4=24: fak(4)*5 = 1*2*3*4*5 = fak(5)
	
	}

	// fak(5)
	// fak(5-1)               * 5
	// --------
	//  fak(4)
	// fak(4-1)           * 4 * 5
	// fak(3)             * 4 * 5
	// fak(3-1)       * 3 * 4 * 5  
	// fak(1)     * 2 * 3 * 4 * 5
	// fak(0) * 1 * 2 * 3 * 4 * 5
	//   1    * 1 * 2 * 3 * 4 * 5
	
	
}
