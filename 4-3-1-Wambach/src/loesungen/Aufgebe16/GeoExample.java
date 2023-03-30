package loesungen.Aufgebe16;

public class GeoExample
{

	public static void main(String[] args)
	{
		
		Rechteck r = new Rechteck(13,12);
		System.out.println(r.getFlaeche());
		
		Quadrat q = new Quadrat(4);
		System.out.println(q.getFlaeche());

		
		q.setBreite(2);
		System.out.println(q.getFlaeche());
		
		

		
		
	}

}
