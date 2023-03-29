package beispiele.schnittstellen.schnittstellen3;


public interface Buyable
{
	double price();
	
	default boolean hasPrice() { return price() > 0; }
}
