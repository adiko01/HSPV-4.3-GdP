package loesungen.VierGewinnt;

public class GameSolution extends Game {



	public int setCoin(int spielerID, int slot)
	{

		
		for (int i=0;i<feld[slot].length;i++)
		{
			if (feld[slot][i]==0)
			{
				feld[slot][i]=spielerID;
				currentPlayer = (spielerID==1 ? 2 : 1);
				return spielerID;
			}
		}
		
		
		return 0;
	}
	

	public int setCoin(int slot)
	{
		return setCoin(currentPlayer,slot);
	}
	

	public int isWinner()
	{

		for (int y = 0;y<sizeY;y++)
		{
			for (int i = 0;i<sizeX-3;i++)
			{
				if (feld[i][y]!= 0 && 
						feld[i][y] == feld[i+1][y] && 
						feld[i+1][y] == feld[i+2][y] && 
						feld[i+2][y] == feld[i+3][y])
				{
					return feld[i][y];
				}
			}
		}
		
		for (int x = 0;x<sizeX;x++)
		{
			for (int i = 0;i<sizeY-3;i++)
			{
				if (feld[x][i] != 0 && 
						feld[x][i] == feld[x][i+1] && 
						feld[x][i+1] == feld[x][i+2] && 
						feld[x][i+2] == feld[x][i+3])
				{
					return feld[x][i];
				}
			}
		}
		
		for (int x = 0;x<sizeX-3;x++)
		{
			for (int y = 0;y<sizeY-3;y++)
			{
				if (feld[x][y] != 0 && 
						feld[x][y] == feld[x+1][y+1] && 
						feld[x+1][y+1] == feld[x+2][y+2] && 
						feld[x+2][y+2] == feld[x+3][y+3])
				{
					return feld[x][y];
				}
			}
		}
		
		for (int x = 0;x<sizeX-3;x++)
		{
			for (int y = 3;y<sizeY;y++)
			{
				if (feld[x][y] != 0 && 
						feld[x][y] == feld[x+1][y-1] && 
						feld[x+1][y-1] == feld[x+2][y-2] && 
						feld[x+2][y-2] == feld[x+3][y-3])
				{
					return feld[x][y];
				}
			}
		}
		
		
		return 0;
	}
	


	public static void main(String[] args)
	{
		new GameUI(new GameSolution());
	}
	

	
	
}
