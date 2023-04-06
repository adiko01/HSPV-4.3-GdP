package aufgaben.VierGewinnt;

public class Game {

	
	final char coinSpieler1 = 'X';
	final char coinSpieler2 = 'O';
	
	public final int sizeX = 7;
	public final int sizeY = 6;
	
	int[][] feld;
	
	int currentPlayer=1;
	
	public Game()
	{
		feld = new int[sizeX][sizeY];
	}
	
	/**
	 * Rückgabewerte: 
	 * 1 oder 2: Spielerstein wurde für Spieler 1/2 gesetzt
	 * 0 konnte nicht gesetzt werden (schon voll)
	 */
	public int setCoin(int spielerID, int slot)
	{
		/*
		 * In dieser Methode soll in Abhängigkeit des aktuellen Stands
		 * die Coins "von unten nach oben" aufgefüllt werden. Sofern in
		 * der jeweiligen Spalte kein Platz mehr ist, soll eine 0 zurück-
		 * gegeben werden. Andernfalls wird eine 1 für Spieler 1 oder 2 für
		 * Spieler 2 zurückgegeben.
		 */
		for (int i=0; i<sizeY; i++) {
			if(getXY(slot, i)==0) {
				setXY(slot,i,spielerID);
				if (currentPlayer==1) {
					currentPlayer = 2;
				} else {
					currentPlayer = 1;
				}
				break;
			} else {
				//Nothing
			}
		}
		
		return 0;
	}
	
	/**
	 * Rückgabe so wie setCoin(spielerID, slot), nur dass der Spieler
	 * automatisch gewählt wird (Spieler 1 beginnt)
	 */
	public int setCoin(int slot)
	{
		return setCoin(currentPlayer, slot);
	}
	
	/**
	 * 0: kein Gewinner
	 * 1/2 Spieler 1/2 hat gewonnen
	 */
	public int isWinner()
	{
		/*
		 * In dieser Methode soll geprüft werden, ob es einen Gewinner gibt.
		 * Gewinner ist die Person, die vier Steine in einer Reihe setzt. 
		 * Eine Reihe kann horizontal, vertikal oder diagonal sein. Die Grenzen
		 * des Arrays müssen jedoch berücksichtigt werden.
		 */
		for (int x = 0; x < sizeX ; x++) {
			for (int y = 0; y < sizeY ; y++) {
				int pl = getXY(x,y);
				if (pl==0) {
					//Feld leer, es gibt nix zu suchen
					continue;
				}
				int stueck = 0;
				//Prüfe Reihe
				for (int i=-3; i<4; i++) {
					try {
						if (getXY((x-i),y)==pl) {
							//Ein Feld von gleicher Farbe gefunden
							stueck++;
							if (stueck==4) {
								return pl;
							}
						} else {
							stueck = 0;
						}
					} catch (ArrayIndexOutOfBoundsException e) {
						continue;
					}
				}
				//Prüfe Spalte
				stueck = 0;
				for (int i=-3; i<4; i++) {
					try {
						if (getXY(x,(y-i))==pl) {
							//Ein Feld von gleicher Farbe gefunden
							stueck++;
							if (stueck==4) {
								return pl;
							}
						} else {
							stueck = 0;
						}
					} catch (ArrayIndexOutOfBoundsException e) {
						continue;
					}
				}
				//Prüfe Diagonale
				stueck = 0;
				for (int i=-3; i<4; i++) {
					try {
						if (getXY((x-i),(y-i))==pl) {
							//Ein Feld von gleicher Farbe gefunden
							stueck++;
							if (stueck==4) {
								return pl;
							}
						} else {
							stueck = 0;
						}
					} catch (ArrayIndexOutOfBoundsException e) {
						continue;
					}
				}
			}
		}
		return 0;
	}
	
	
	/**
	 * 0: nichts gesetzt
	 * 1: Spieler1 hat einen Coin an X,Y
	 * 2: Spieler2 hat einen Coint an X,Y
	 */
	public int getXY(int x, int y)
	{
		
		return feld[x][y];
	}
	
	public void setXY(int x, int y, int spielerID)
	{
		feld[x][y]=spielerID;
	}
	
	public String toString()
	{
		
		for (int y=sizeY-1;y>=0;y--)
		{
			StringBuffer b = new StringBuffer();
			b.append('|');
			for (int x=0;x<sizeX;x++)
			{
				if (getXY(x,y)==1)
					b.append(coinSpieler1);
				else if (getXY(x,y)==2)
					b.append(coinSpieler2);
				else
					b.append(' ');
					
			}
			b.append('|');
			System.out.println(b);
			
		}
		
		
		return "";
	}
	
	
	
	public static void main(String[] args)
	{
		
		Game g = new Game();

		/*
		 * Nur zu Demozwecken. Später sollen die Steine über
		 * setCoin(slot) gesetzt werden können.
		 */
		g.setXY(1, 0, 1);
		g.setXY(2, 0, 2);
		g.setXY(3, 0, 1);
		g.setXY(1, 1, 2);
		
		System.out.println(g);
		
		
	}
	

	
	
}
