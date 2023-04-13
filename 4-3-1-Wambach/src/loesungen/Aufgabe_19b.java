package loesungen;


import java.util.InputMismatchException;

public class Aufgabe_19b
{
	public static void main(String[] args)
	{
		int[] arr;

		System.out.println("Wie viele Elemente soll das Array haben?");

		try
		{
			int count = new java.util.Scanner(System.in).nextInt();
			arr = new int[count];

			for (int e : arr)
				System.out.println(e);
		}
		catch (InputMismatchException e)
		{
			System.out.println("Keine Zahl eingegeben.");
		}

	}

}
