package boardgame;

public class Piece {

	protected Position position;
	private Board board;

	// Construct
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	//Get
	protected Board getBoard() {
		return board;
	}

}
