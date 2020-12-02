/**
 * Reprenta a classe base para as peças.
 */
public class Piece {
    /**
     * Identifica o tabuleiro do jogo.
     */
    private Board board;

    /**
     * Identifica a casa a qual esta peça está definida.
     */
    private Square square;

    /**
     * Identifica o tipo da peça.
     */
    private PieceType type;

    /**
     * Identifica o estilo da peça.
     */
    private PieceStyle style;

    /**
     * Cria uma nova instância da classe Piece.
     * @param board O tabuleiro do jogo.
     * @param position A posição da peça no tabuleiro.
     * @param type O tipo da peça.
     * @param style O estilo da peça.
     */
    public Piece(Board board, Point position, PieceType type, PieceStyle style) {
        this.board = board;
        this.type = type;
        this.style = style;
        this.square = board.getSquare(position);

        square.setPiece(this);
    }
    
    /**
     * Move a peça para outra casa.
     * @param target A casa para a qual a peça será movida.
     * @return true se a peça foi movida; false se não, devido a algum movimento ilegal.
     */
    public boolean move(Square target) {
        Point from = square.getPosition();
        Point to = target.getPosition();

        if (isValidMove(from, to) && canMove(board, from, to)) {
            square.removePiece();
            target.setPiece(this);
            square = target;

            return true;
        }

        return false;
    }

    /**
     * Captura uma peça em outro casa.
     * @param target A casa na qual será feita a captura.
     * @return true se a peça foi movida; false se a peça não foi movida devido a algum movimento ilegal.
     */
    public boolean capture(Square target) {
        Point from = square.getPosition();
        Point to = target.getPosition();

        if (canMove(board, from, to) && canCapture(board, from, to)) {
            square.removePiece();
            target.setPiece(this);
            square = target;

            return true;
        }

        return false;
    }

    /**
     * Obtém o tipo da peça.
     * @return O tipo da peça.
     */
    public PieceType getType() {
        return type;
    }

    /**
     * Obtém o estilo da peça.
     * @return O estilo da peça.
     */
    public PieceStyle getStyle() {
        return style;
    }

    /**
     * Obtém um valor indicando se o movimento é válido para a peça.
     * @param from A posição inicial da peça.
     * @param to A posição final da peça.
     * @return true se a peça foi movida; false se não foi movida.
     */
    protected boolean isValidMove(Point from, Point to) {
        return true;
    }

    /**
     * Obtém um valor indicando se a peça pode ser movida ou possui seu caminho bloqueado por outras peças.
     * @param board O tabuleiro do jogo.
     * @param from A posição da peça de origem
     * @param to A posição final da peça.
     * @return true se a peça foi movida; false se não.
     */
    protected boolean canMove(Board board, Point from, Point to) {
        return true;
    }

    /**
     * Obtém um valor indicando se a peça atual pode capturar uma outra peça.
     * @param board O tabuleiro do jogo.
     * @param from A posição da peça de origem.
     * @param to A posição da peça alvo.
     * @return true se a peça alvo foi capturada; false se não.
     */
    protected boolean canCapture(Board board, Point from, Point to) {
        return canMove(board, from, to);
    }
}
