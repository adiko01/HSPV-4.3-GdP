package beispiele.Arrays;


public class Felder3 {

	public static void main(String[] args) {
		
		
		System.out.println(summe(1,2,3));
		System.out.println(summe(1,2,3,4));
		System.out.println(summe(1,2,3,4,5));
		
		int[] f = {1,2,3,4};
		System.out.println(summe(f));
	}
	
	
	public static int summe(int... e)
	{
		int sum=0;
		//for (int i=0;i<e.length;i++)
		for (int t : e) // erweiterte For-Schleife
		{
			sum += t;
		}
		return sum;
	}
	
	
	/*
	public static int summe(int a, int b, int c)
	{
		return a+b+c;
	}
	
	public static int summe(int a, int b, int c, int d)
	{
		return a+b+c+d;
	}*/
	


}
