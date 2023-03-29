package beispiele.schnittstellen.schnittstellen1;

public class Journal extends Article implements Buyable
{
	double price;
	
	Journal (double p)
	{
		this.price = p;
	}

	@Override
	public double price()
	{
		return this.price;
	}

}
