package bonusaufgaben.AbstrakteKlassenUndExceptions.level3;

public class CheckingAccount extends BankAccount{
	private double balance;

	CheckingAccount() {
		balance = 0;
	}
	CheckingAccount(double balance) {
		this.balance = balance;
	}
	
	@Override
	public void withdraw(double amount) throws OverdraftException {
		if (balance < amount) {
			throw new OverdraftException();
		} else {
			balance -= amount;
			System.out.println("Der Betrag wurde Abgehoben neuer Kontostand: " + amount);
		}
	}

}
