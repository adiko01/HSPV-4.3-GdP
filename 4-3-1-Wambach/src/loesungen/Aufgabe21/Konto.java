package loesungen.Aufgabe21;

public class Konto implements Cloneable
{
	private int id;
	private double saldo;
	private Kunde kunde;
	
	public Konto()
	{
		
	}
	
	public Konto(int id, double saldo)
	{
		this.id = id;
		this.saldo  = saldo;
	}
	
	public int getId() {return this.id;}
	public void setId(int id) {this.id = id;};
	public double getSaldo() {return this.saldo;}
	public void setSaldo(double saldo) {this.saldo = saldo;}
	public Kunde getKunde() {return this.kunde;}
	public void setKunde(Kunde k) {this.kunde = k;}
	
	public void add(double betrag)
	{
		saldo += betrag;
	}
	
	@Override
	public boolean equals(Object o)
	{
		if (this == o)
			return true;
		
		if (!(o instanceof Konto))
			return false;
		
		Konto k = (Konto) o;
		return id == k.id;
	}
	
	@Override
	public int hashCode()
	{
		return id;
	}
	
	@Override
	public Konto clone()
	{
		try
		{
			Konto k = (Konto) super.clone();
			k.kunde = new Kunde(this.kunde);
			return k;
		}
		catch (CloneNotSupportedException e)
		{
			return null;
		}
	}
	
}
