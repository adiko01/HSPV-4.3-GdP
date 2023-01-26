
public class Aufgabe_5 {
	
	public static void main (String[] args) {
		//Das angelegte Kapital als Double
		System.out.print("Das anzulegende Kapital: ");
		double kap = new java.util.Scanner(System.in).nextDouble();
		//Den Zinssatz als Double
		System.out.print("Der Zinssatz: ");
		double zins = new java.util.Scanner(System.in).nextDouble();
		//Die Anzahl der Jahre bzw. der Zinsausschüttungen
		System.out.print("Die Zeit in der das Kapital angelegt werden soll: ");
		int time = new java.util.Scanner(System.in).nextInt();
		
		kap = kap + kap * (zins/100) * time;
		System.out.println("Nach " + time + " Jahren wird ein Kapital von " + kap +"€");
	}
}
