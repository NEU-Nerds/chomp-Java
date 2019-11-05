//This is just a class with a main method so I can test various things from other classes
public class testClass {
	public static void main(String[] args) {
		Board b1 = new Board(5, 5);
		int[][] boardState2 = { { 1, 1, 1 }, { 1, 1, 0 }, { 1, 0, 0 } };
		Board b2 = new Board(boardState2, -1);
		Board b3 = new Board(new int[] {3, 2, 1}, -1);
	}
}
