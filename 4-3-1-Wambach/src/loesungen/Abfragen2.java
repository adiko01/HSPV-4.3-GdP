package loesungen;


public class Abfragen2 {

	public static void main(String[] args) {
		
		int i = 9;
		
		
		if (i == 1)
			System.out.println("A");
		
		else if (i == 2)
			System.out.println("B");
		
		else if (i == 3)
			System.out.println("C");
		
		else if (i == 4)
			System.out.println("D");
		
		else if (i == 5)
			System.out.println("E");
		
		else
			System.out.println("-");
		
		//alte Switch-Case
		switch (i)
		{
		case 1: System.out.println("A");
				break;
		case 2: System.out.println("B");
				break;
		case 3: System.out.println("C");
				break;
		case 4: System.out.println("D");
				break;
		case 5: System.out.println("E");
				break;
		default: System.out.println("-");
		}
		
		//neue Switch-Case
		switch (i)
		{
		case 1-> System.out.println("A");
	
		case 2-> System.out.println("B");
		
		case 3-> System.out.println("C");
		
		case 4-> System.out.println("D");

		case 5-> System.out.println("E");
		
		default -> System.out.println("-");
		}
		
		
		
	}

}
