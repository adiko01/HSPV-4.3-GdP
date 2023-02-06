package beispiele.Methoden;


public class Methoden2 {


	
	public static void main(String[] args) {
		
		System.out.println(summe(98));
		System.out.println(summe(99));
		System.out.println(summe(3,100));
		
		
		System.out.println();
		
	}

	public static int summe(int a, int n)
	{
		int sum=0;
		for(int i=a; i<=n;i++)
		{
			sum=sum+i;
		}
		return sum;
	}
	
	public static int summe(int n)
	{
		return summe(0,n);
	}

	public static int summe()
	{
		return 0;
	}
	
}
