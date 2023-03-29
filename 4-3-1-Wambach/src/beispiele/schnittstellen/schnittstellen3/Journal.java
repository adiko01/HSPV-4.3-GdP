package beispiele.schnittstellen.schnittstellen3;

public class Journal extends Article implements Buyable, Comparable<Journal>
{
	public String name;
	private double price;
	
	Journal (String n, double p)
	{
		this.name = n;
		this.price = p;
	}

	@Override
	public double price()
	{
		return this.price;
	}

	@Override
	public int compareTo(Journal o)
	{
		return Double.compare(price, o.price());
	}

}
