package loesungen;


public class Aufgabe_11 {
	
	static int digitSum (String input)
	{
		int sum = 0;
		
		if (input == null || input.length()==0)
				return 0;
		
		for (int i=0; i<input.length(); i++)
		{
			if (Character.isDigit(input.charAt(i)))
					sum += Character.getNumericValue(input.charAt(i));
		
		}
		
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(digitSum("123"));
	}

}
