package beispiele.Exceptions;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ausnahmen1 {

	public static void main(String[] args)
	{
		
		/*
		 * Ungeprüfte Exceptions
		 */
		
		int[] arr = new int[10];
		try {
			arr[10] = 4;
			
			ArrayList<String> l = new ArrayList<String>();
			l.get(0);
			
		} catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Fehler beim Array-Zugriff");
		}
		
		
		
		try {
			int x = new Scanner(System.in).nextInt();
			
			System.out.println(x+1);
		} catch (InputMismatchException e)
		{
			System.out.println("Fehler!!!");

		} 
		System.out.println("weiter gehts...");
		
		
		
		
		
		
	}
	
}
