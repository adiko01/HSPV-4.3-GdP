package loesungen.Aufgabe21;

public class Test
{

	public static void main(String[] args)
	{
		Kunde kunde = new Kunde("Max Mustermann", "Erna-Scheffler-Str. 4, 51103 Köln");
		
		Konto k1 = new Konto (4711, 10000);
		k1.setKunde(kunde);
		
		Konto k2  = k1.clone();
		kunde.setAdresse("Neue Adresse");
		
		System.out.println("Kunde 1:");
		System.out.println(k1.getId());
		System.out.println(k1.getSaldo());
		System.out.println(k1.getKunde().getName());
		System.out.println(k1.getKunde().getAdresse());
		
		System.out.println("Kunde 2:");
		System.out.println(k2.getId());
		System.out.println(k2.getSaldo());
		System.out.println(k2.getKunde().getName());
		System.out.println(k2.getKunde().getAdresse());
	}

}
