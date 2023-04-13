package loesungen.Aufgabe21;

public class Kunde
{
	private String name;
	private String adresse;
	
	public Kunde()
	{
		
	}
	
	public Kunde(String name, String adresse)
	{
		this.name = name;
		this.adresse = adresse;
	}
	
	public Kunde(Kunde other)
	{
		this.name = other.name;
		this.adresse = other.adresse;
	}
	
	public void setName(String name) {this.name = name;}
	public String getName() {return this.name;}
	public void setAdresse(String adr) {this.adresse = adr;}
	public String getAdresse() {return this.adresse;}

}
