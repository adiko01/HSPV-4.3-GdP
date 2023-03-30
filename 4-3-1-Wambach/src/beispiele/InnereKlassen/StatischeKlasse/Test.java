package beispiele.InnereKlassen.StatischeKlasse;


public class Test
{

	public static void main(String[] args)
	{
		Account account = new Account(1123);
		Account.Permissions perm = account.getPermissions();
		
		perm.canRead = true;
		
		System.out.println(perm.canRead);
		System.out.println(perm.canWrite);
		System.out.println(perm.canExecute);
	}

}
