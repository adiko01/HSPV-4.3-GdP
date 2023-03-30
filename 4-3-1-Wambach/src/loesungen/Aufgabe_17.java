package loesungen;

public class Aufgabe_17
{
	public static long sum (int n) 
	{
		if (n<=0)
			throw new IllegalArgumentException("Parameter kleiner oder gleich 0");
		
		int sum=0;
		for (int i=1; i<=n; i++)
			sum+=i;
		
		return sum;
	}

	public static void main(String[] args)
	{
		System.out.println(sum(12));
		
		sum(-2);
		

	}

}
