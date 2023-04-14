package bonusaufgaben.AbstrakteKlassenUndExceptions.level3;

public abstract class BankAccount {
	
	public abstract void withdraw(double amount) throws OverdraftException;
}
