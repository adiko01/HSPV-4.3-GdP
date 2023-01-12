package loesungen;

/**
 * @author ORR Dr. Tim Wambach
 * FOLIE 19
 */


public class GGT {

	
	
	public static void main(String[] args)
	{
		
		int a = 20;
		int b = 8;
		
		if (a<=0||b<=0)
			a=b=0;
			
		while (a!=b) {
			if (a<b)
				b=b-a;
			else
				a=a-b;
		}
		

		System.out.println(a);
		
	}
}