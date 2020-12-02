/**
 * Representa e controla as ações do jogo de xadrez.
 */
public class Game {
    /**
     * Identifica o tabuleiro do jogo.
     */
    private Board board;

    /**
     * Cria uma nova instância da classe Jogo.
     */
    public Game() {
        board = new Board();
        
        arrangePieces();
    }

    /**
     * Move uma peça de um posição para a outra.
     * @param from A posição da peça de origem.
     * @param to A posição da peça final.
     * @return true se a peça foi movida; false se não.
     */
    public boolean movePiece(Point from, Point to) {
        Square origin = board.getSquare(from);
        Square target = board.getSquare(to);

        return origin.getPiece().move(target);
    }

    /**
     * Captura uma peça em uma posição. 
     * @param from A posição da peça de origem.
     * @param to A posição da peça alvo.
     * @return true se a peça foi capturada; false se não.
     */
    public boolean capturePiece(Point from, Point to) {
        Square origin = board.getSquare(from);
        Square target = board.getSquare(to);

        return origin.getPiece().capture(target);
    }

    /**
     * Obtém o tabuleiro.
     * @return O tabuleiro.
     */
    public Board getBoard() {
        return board;
    }

    /**
     * Arranja as peças no tabuleiro.
     */
    private void arrangePieces() {
        // Peças brancas.
        new Bishop(board, new Point(0, 1), PieceStyle.White);
        new Bishop(board, new Point(1, 1), PieceStyle.White);
        new Bishop(board, new Point(2, 1), PieceStyle.White);
        new Bishop(board, new Point(3, 1), PieceStyle.White);
        new Bishop(board, new Point(4, 1), PieceStyle.White);
        new Bishop(board, new Point(5, 1), PieceStyle.White);
        new Bishop(board, new Point(6, 1), PieceStyle.White);
        new Bishop(board, new Point(7, 1), PieceStyle.White);
        new Rook(board, new Point(0, 0), PieceStyle.White);
        new Rook(board, new Point(7, 0), PieceStyle.White);
        new Pawn(board, new Point(2, 0), PieceStyle.White);
        new Pawn(board, new Point(5, 0), PieceStyle.White);
        new Knight(board, new Point(1, 0), PieceStyle.White);
        new Knight(board, new Point(6, 0), PieceStyle.White);
        new Queen(board, new Point(3, 0), PieceStyle.White);
        new King(board, new Point(4, 0), PieceStyle.White);

        // Peças pretas.
        new Bishop(board, new Point(0, 6), PieceStyle.Black);
        new Bishop(board, new Point(1, 6), PieceStyle.Black);
        new Bishop(board, new Point(2, 6), PieceStyle.Black);
        new Bishop(board, new Point(3, 6), PieceStyle.Black);
        new Bishop(board, new Point(4, 6), PieceStyle.Black);
        new Bishop(board, new Point(5, 6), PieceStyle.Black);
        new Bishop(board, new Point(6, 6), PieceStyle.Black);
        new Bishop(board, new Point(7, 6), PieceStyle.Black);
        new Rook(board, new Point(0, 7), PieceStyle.Black);
        new Rook(board, new Point(7, 7), PieceStyle.Black);
        new Pawn(board, new Point(2, 7), PieceStyle.Black);
        new Pawn(board, new Point(5, 7), PieceStyle.Black);
        new Knight(board, new Point(1, 7), PieceStyle.Black);
        new Knight(board, new Point(6, 7), PieceStyle.Black);
        new Queen(board, new Point(3, 7), PieceStyle.Black);
        new King(board, new Point(4, 7), PieceStyle.Black);
    }
}
