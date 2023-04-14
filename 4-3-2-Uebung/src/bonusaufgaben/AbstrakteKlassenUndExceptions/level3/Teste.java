package bonusaufgaben.AbstrakteKlassenUndExceptions.level3;

public class Teste {

	public static void main(String[] args) {
		System.out.print("Bonusaufgaben - Abstrakte Klassen und Exceptions  - Level 3 \n"
				+ "\n"
				+ "\n");
		CheckingAccount c = new CheckingAccount();
		
		try {
			c.withdraw(5.0);
		} catch (OverdraftException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		SavingsAccount s = new SavingsAccount(100.0);
		
		try {
			s.withdraw(50);
		} catch (OverdraftException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
