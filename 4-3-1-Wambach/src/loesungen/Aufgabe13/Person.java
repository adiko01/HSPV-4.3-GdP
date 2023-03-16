package loesungen.Aufgabe13;

class Person {
	private String firstname;
	private String lastname;
	private String email;
	private int age;

	/*
	 * Konstruktor(en)
	 */
	Person(Person p) {
		this.age = p.age;
		this.firstname = p.firstname;
		this.lastname = p.lastname;
		this.email = p.email;
	}

	Person(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
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
		/*
		 * Dieser "Test" auf korrekte E-Mail ist natürlich nicht ausreichend! Hier
		 * müsste man mit regulären Ausdrücken arbeiten.
		 */
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
