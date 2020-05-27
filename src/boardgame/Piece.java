package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; // posição do tabuleiro recem criada é nula nao foi adicionada ainda
	}

	protected Board getBoard() { // so seja acessada pelo tabuleiro e pelas peças
		return board;
	}

	
	
	
}
