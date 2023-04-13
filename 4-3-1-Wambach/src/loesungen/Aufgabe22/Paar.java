package loesungen.Aufgabe22;

public class Paar<T,U>
{
	protected T valueA;
	protected U valueB;
	
	public Paar(T a, U b)
	{
		this.valueA = a;
		this.valueB = b;
	}
	
	public T getValueA()
	{
		return this.valueA;
	}
	
	public U getValueB()
	{
		return this.valueB;
	}
	
	public String toString()
	{
		return "(" + this.valueA + "," + this.valueB + ")";
	}
}
