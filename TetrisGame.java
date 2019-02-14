/**
 *
 * @author p459018, Nicholas Jordan
 */
public class TetrisGame {
	private T length, breadth, height;
	
	public TetrisGame() {
	
	}
	
	public void play() {
		System.out.println("You are now playing Tetris");
	}

	public static void main(String[] args) {
		TetrisGame game = new TetrisGame();
		game.play();
	}
}