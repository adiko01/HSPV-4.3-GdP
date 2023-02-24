package selbststudium;

public class Aufgabe_1_2 {
	/**Aufgabe 1.2
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double[] d = {5.0,4.0,8.0,8.0};
		System.out.print("Aufgabe 1_2\n"
				+ "Die Summe: " + sum(d) + "\n"
				+ "Das Produkt: " + prod(d) + "\n"
				+ "Der Mittelwert: " + mid(d) + "\n"
				+ "Die Varianz: " + var(d) + "\n");
	}
	
	public static Double sum (Double ... a) {
		//Rückgabe wert
		Double ret = 0.00;
		for (double i:a) {
			ret = ret + i;
		}
		return ret;
	}
	
	public static Double prod (Double ... a) {
		//Rückgabe wert
		Double ret = 1.00;
		for (double i:a) {
			ret = ret * i;
		}
		return ret;
	}
	
	public static Double mid (Double ... a) {
		//Rückgabe wert
		Double ret = 0.00;
		//Anzahl der Werte
		Double c = 0.00;
		for (double i:a) {
			ret = ret + i;
			c++;
		}
		ret = ret / c;
		return ret;
	}
	
	public static Double var (Double[] args) {
		//Rückgabe wert
		Double ret = 0.00;
		
		return ret;
	}
}
