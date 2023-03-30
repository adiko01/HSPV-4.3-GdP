package beispiele.InnereKlassen.InstanzKlasse;



public class KontoTest
{

	public static void main(String[] args)
	{
		Konto k = new Konto (47110815, 1000);
		
		k.zahleEin(500);
		k.zahleAus(250);
		
		Konto.Transaktion t = k.getLast();
		System.out.println(t.toString());

		// Das erstellen einer "einzelnen" Transaktion außerhalb der Klasse Konto ist nicht möglich
		//Konto.Transaktion t2 = new Konto.Transaktion("Auszahlung", 3000);

	}

}
