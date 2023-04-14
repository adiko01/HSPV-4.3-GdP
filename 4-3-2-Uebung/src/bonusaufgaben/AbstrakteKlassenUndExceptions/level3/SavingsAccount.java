package bonusaufgaben.AbstrakteKlassenUndExceptions.level3;

public class SavingsAccount extends BankAccount{
	private double balance;

	SavingsAccount() {
		balance = 0;
	}
	SavingsAccount(double d) {
		this.balance = d;
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
