package beispiele.Kontrollstrukturen;


public class Schleifen2 {

	public static void main(String[] args) {
		
		/*
		System.out.println("Hallo");
		System.out.println("Hallo");
		System.out.println("Hallo");
		System.out.println("Hallo");
		System.out.println("Hallo");
		System.out.println("Hallo");
		System.out.println("Hallo");
		System.out.println("Hallo");
		System.out.println("Hallo");
		System.out.println("Hallo");
		*/
		
		
		//For-Schleife
		for ( int i = 0 ; i<10 ; i++)
		{
			System.out.println("Hallo " + i);
		}
		
		/*
		//While-Schleife
		int i = 0;
		while (i<10)
		{
			System.out.println("Hallo " + i);
			i++; //i=i+1
		}
		

		boolean bedingung = true;
		while (bedingung)
		{
			
			int randomNumber = (int) (Math.random() * 5 + 1);
			System.out.println(randomNumber);
			
			if (randomNumber == 5)
				bedingung = false;
		}
		*/

		//boolean bedingung = true;
		int randomNumber=5;
		
		while (randomNumber!= 5)
		{
			
			randomNumber = (int) (Math.random() * 5 + 1);
			System.out.println(randomNumber);
			
			//if (randomNumber == 5)
			//	break;
			
		}
		
		System.out.println();
		
		
		
		do
		{
			randomNumber = (int) (Math.random() * 5 + 1);
			System.out.println(randomNumber);
			
		} while(randomNumber != 5);
		
		
	}

}
