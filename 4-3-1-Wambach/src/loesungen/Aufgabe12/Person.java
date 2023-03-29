package loesungen.Aufgabe12;


class Person {
	private String firstname;
	private String lastname;
	private String email;
	private int age;
	

	
	public Person(String firstname, String lastname, int age)
	{
		this.firstname=firstname;
		this.lastname=lastname;
		this.age=age;
	}
	
	public Person(String lastname, int age)
	{
		this("",lastname,age);
		
	}
	
	public Person(Person o)
	{
		this.firstname=o.firstname;
		this.lastname=o.lastname;
		this.age=o.age;
		this.email=o.email;
	}
	

	
	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String surname) {
		this.lastname = surname;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		if (email ==null)
			return;
		
		if (email.contains("@"))
			this.email = email;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		if ((age >= 0) && (age <= 150))
			this.age = age;
	}

	String getStatus() {
		String str = this.firstname + " " + this.lastname + " (" + this.age + ")" + " hat ";
		
		if (email == null || email.length() == 0)
			str += "keine E-Mail-Adresse";
		else
			str += " die E-Mail-Adresse " + this.email;

		return str;

	}
}

