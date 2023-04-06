package aufgaben.VierGewinnt;

public class GameAI extends Game {

	public int setCoin(int slot) {

		int i = super.setCoin(slot);
		GameSimulation gs = new GameSimulation(this);
		int a = (int) gs.getNext(0, this.currentPlayer);
		super.setCoin(a);

		return i;
	}

	public static void main(String[] args) {
		new GameUI(new GameAI());
	}
	
}

class GameSimulation extends Game {

	public GameSimulation(Game g) {
		this.feld = new int[sizeX][sizeY];
		for (int x = 0; x < sizeX; x++) {
			for (int y = 0; y < sizeY; y++) {
				feld[x][y] = g.feld[x][y];
			}
		}
		this.currentPlayer = g.currentPlayer;
	}

	public double getNext(int depth, int own) {

		if (depth == 5)
			return Math.pow(1.0/sizeX, depth);

		int other = own == 1 ? 2 : 1;

		double[] res = new double[sizeX];

		double sum = 0;
		for (int i = 0; i < sizeX; i++) {
			GameSimulation gs = new GameSimulation(this);
			int s = gs.setCoin(i);

			int w = gs.isWinner();
			if (s == 0)
				res[i] = Double.NEGATIVE_INFINITY;
			else if (w == own)
				res[i] = 1.0;
			else if (w == other)
				res[i] = -1.0;
			else
				res[i] = gs.getNext(depth + 1, own);
		}

		if (depth == 0) {
			int maxAt = 0;

			for (int i = 0; i < sizeX; i++) {
				if (res[i] > Double.NEGATIVE_INFINITY)
					maxAt = res[i] > res[maxAt] ? i : maxAt;
			}
			return maxAt;
		}

		for (double v : res)
		{
			if (v > Double.NEGATIVE_INFINITY)
				sum += v;
		}
		
		return sum * Math.pow(1.0/sizeX, depth);

	}

}