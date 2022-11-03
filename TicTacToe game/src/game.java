import java.util.Scanner;

public class game {

	static int[][] board = new int[3][3];
	static Scanner sc = new Scanner(System.in);
	static Integer player = 1;
	static Integer winner = 0;

	public static void main(String args[]) {
		while (winner == 0) {
			System.out.println("Inputs the next move row");
			int ram_row = sc.nextInt();
			System.out.println("Inputs the next move column");
			int col = sc.nextInt();
			board[ram_row][col] = player;
			int rowscore = 0;
			int colscore = 0, diagonalscore = 0, crossdiagonalscrore = 0;
			printBoard(board);
// check winner
			for (int i = 0; i < board[0].length; i++) {
				if (board[ram_row][i] == player) {
					rowscore++;
				}
			}
			for (int i = 0; i < board.length; i++) {
				if (board[i][col] == player) {
					colscore++;
				}
			}
			for (int i = 0, j = 0; i < board.length && j < board[0].length; i++, j++) {
				if (board[i][j] == player) {
					diagonalscore++;
				}
			}
			for (int i = 0, j = board[0].length - 1; i < board.length && j >= 0; i++, j--) {
				if (board[i][j] == player) {
					crossdiagonalscrore++;
				}
			}
			if (rowscore == 3 || colscore == 3 || crossdiagonalscrore == 3 || diagonalscore == 3) {
				winner = player;
				System.out.println("the player is win " + player);
			} else {
				if (player == 1) {
					player = -1;
				} else {
					player = 1;
				}

			}

		}
	}

	private static void printBoard(int[][] board) {

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println(" ");
		}
	}

}