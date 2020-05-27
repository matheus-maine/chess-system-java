package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; // posi��o do tabuleiro recem criada � nula nao foi adicionada ainda
	}

	protected Board getBoard() { // so seja acessada pelo tabuleiro e pelas pe�as
		return board;
	}

	
	
	
}
