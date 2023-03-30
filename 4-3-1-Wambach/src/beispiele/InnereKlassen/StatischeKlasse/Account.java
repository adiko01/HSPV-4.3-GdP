package beispiele.InnereKlassen.StatischeKlasse;


public class Account
{
	private int userID;
	private Permissions perm;
	
	public Account (int userID)
	{
		this.userID=userID;
		perm = new Permissions();
	}
	
	public int getUserID()
	{
		return userID;
	}
	
	public static class Permissions
	{
		public boolean canRead;
		public boolean canWrite;
		public boolean canExecute;
	
	}
	
	public Permissions getPermissions()
	{
		return perm;
	}
}
