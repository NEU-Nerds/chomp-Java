import java.util.ArrayList;
import java.util.Arrays;

//Bryce Parazin 2019
//This is a class that represents an m rows by n columns with poison in (0,0), the top left corner
//chomp board after some number of bites. A 1 represents
//an uneaten square, and a 0 an eaten one
//Due to the uncertain nature of solutions (bites that result in an even board), they are not
//added when constructed, and must be added with the addSolution method
//Due to the uncertain nature of isEven, it is either 0 (even), 1 (odd) or -1 (unknown)
public class Board {
	private int[][] board;
	private int isEven;
	private ArrayList<int[]> solutions = new ArrayList<int[]>();

	// Constructs a square board that is m rows by n columns
	public Board(int m, int n) {
		isEven = 1;
		board = new int[m][n];
		for (int r = 0; r < board.length; r++) {
			for (int c = 0; c < board[0].length; c++) {
				board[r][c] = 1;
			}
		}
	}

	// Constructs a board equal to the given int array which represents a board in
	// play
	public Board(int[][] board, int isEven) {
		this.board = board;
		this.isEven = isEven;
	}

	// Constructs a board equal to the given valid inverse row file which represents
	// a board in play
	public Board(int[] inverseRowFile, int isEven) {
		this.isEven = isEven;
		board = new int[inverseRowFile.length][inverseRowFile[0]];
		for (int r = 0; r < board.length; r++) {
			for (int c = 0; c < inverseRowFile[r]; c++) {
				board[r][c] = 1;
			}
		}
	}
	
	//board accessor method
	public int[][] getBoard (){
		return board;
	}
	
	//solutions accessor method
	public ArrayList<int[]> getSolutions (){
		return solutions;
	}
	
	//isEven accessor method
	public int getEven() {
		return isEven;
	}
	
	//adds a given solution (represented by an int[] of length 2) to the list of known solutions
	public void addSolution(int[] solution) {
		solutions.add(solution);
	}
	
	//toString method that returns the representation of the board as a string
	public String toString() {
		return Arrays.deepToString(board);
	}
}