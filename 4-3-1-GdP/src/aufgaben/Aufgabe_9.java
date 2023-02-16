package aufgaben;

public class Aufgabe_9 {
	
	/**Aufgabe 9:
	 * Schreiben Sie ein Programm, bei dem der Nutzer eine Menge von int-Zahlen
	 * eingeben kann, die in einem Array gespeichert werden. Der Nutzer soll vorab
	 * gefragt werden wie viele Zahlen er eingeben möchte.
	 * Für die im Array gespeicherten int-Werte soll im Anschluss die Summe und
	 * der Mittelwert berechnet und ausgegeben werden
	 */
	
	public static void main(String[] args) {
		System.out.print("Wie viele Zahlen, möchten Sie speichern [int]: ");
		// i = Anzahl der Felder im Arry
		int i = new java.util.Scanner(System.in).nextInt();
		int[] arr = new int[i];
		
		for (int p=0;p<i;p++) {
			System.out.print("Welche Zahl soll gespeichert werden? [int]: ");
			//Speichere die Eingabe im Arry an der Stelle p
			arr[p] =new java.util.Scanner(System.in).nextInt(); 
		}
		int Sum = 0;
		for (int p=0; p<i; p++) {
			Sum += arr[p];
		}

		Double Mid = (double)Sum / i;
		System.out.println("Die Summe der Zahlen ist " + Sum + " und der Mittelwert ist " + Mid);
	}

}
