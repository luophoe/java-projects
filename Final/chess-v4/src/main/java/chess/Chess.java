package chess;

/**
 * chess controller
 * 
 */
public class Chess {

	// chess
	private int[][] chess;

	// player
	public static final int WHITE = 2;

	// AI
	public static final int BLACK = 1;

	// set first
	public static int first = WHITE;
	
	public static  int currentPlayer = BLACK;//
	
	public static boolean restart=true;

	/**
	 * set first
	 * 
	 * @param first
	 */
	public void setFirst(int first) {
		Chess.first = first;
	}

	/**
	 * init 
	 */
	public Chess() {
		chess = new int[15][15];
		restart();//init
	}

	/**
	 * restart
	 */
	public void restart() {
		for (int i = 0; i < chess.length; i++)
			for (int j = 0; j < chess.length; j++)
				chess[i][j] = 0;
        }

	/**
	 *  player play
	 * @param x  0-14
	 * @param y  0-14
	 * @param player  owner
	 * @return is
	 */
	public boolean play(int x, int y, int player) {
		if (x < 0 || x >= chess.length)
			return false;
		if (y < 0 || y >= chess.length)
			return false;
		if (chess[x][y] != 0)
			return false;
		chess[x][y] = player;
		return true;
	}

	/**
	 * check win
	 * @param x 
	 * @param y 
	 * @param cur is win
	 * @return 
	 */
	public boolean isWin(int x, int y, int cur) {
		int count1 = 0, count2 = 0, count3 = 0, count4 = 0;
		int i, j;
		
		//x scan
		for (j = y; j < chess.length; j++) {
			if (chess[x][j] == cur)
				count1++;
			else
				break;
		}
		for (j = y - 1; j >= 0; j--) {
			if (chess[x][j] == cur)
				count1++;
			else
				break;
		}
		if (count1 >= 5)
			return true;
		
		//y scan
		for (i = x; i < chess.length; i++) {
			if (chess[i][y] == cur)
				count2++;
			else
				break;
		}
		for (i = x - 1; i >= 0; i--) {
			if (chess[i][y] == cur)
				count2++;
			else
				break;
		}
		if (count2 >= 5)
			return true;
		
		//
		for (i = x, j = y; i < chess.length && j < chess.length; i++, j++) {
			if (chess[i][j] == cur)
				count3++;
			else
				break;
		}
		for (i = x - 1, j = y - 1; i >= 0 && j >= 0; i--, j--) {
			if (chess[i][j] == cur)
				count3++;
			else
				break;
		}
		if (count3 >= 5)
			return true;

		//
		for (i = x, j = y; i < chess.length && j >= 0; i++, j--) {
			if (chess[i][j] == cur)
				count4++;
			else
				break;
		}
		for (i = x - 1, j = y + 1; i >= 0 && j < chess.length; i--, j++) {
			if (chess[i][j] == cur)
				count4++;
			else
				break;
		}
		if (count4 >= 5)
			return true;
		
		return false;
	}
}
