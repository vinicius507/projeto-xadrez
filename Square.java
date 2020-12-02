/**
 * Representa uma casa no tabuleiro.
 */
public class Square {
    /**
     * Identifica a posição da casa no tabueleiro.
     */
    private Point position;

    /**
     * Identifica a peça contida nesta casa.
     */
    private Piece piece;

    /**
     * Cria uma nova instância da classe {@see Square}.
     * @param location A posição da casa no tabuleiro.
     */
    public Square(Point position) {
        this.position = position;
        this.piece = null;
    }

    /**
     * Obtém a posição da casa no tabuleiro.
     * @return A posição da cada.
     */
    public Point getPosition() {
        return position;
    }

    /**
     * Define uma peça nesta casa.
     * @param piece A peça a ser definida.
     */
    public void setPiece(Piece piece) {
        this.piece = piece;
    }
    
    /**
     * Remove a peça definida nesta casa.
     */
    public void removePiece() {
        piece = null;
    }

    /**
     * Obtém um valor indicando se há alguma peça definida nesta casa. 
     * @return A peça definida nesta casa ou {@see null} se não tiver peça definida.
     */
    public Piece getPiece() {
        return piece;
    }

    /**
     * Obtém um valor indicando se há peça definida nesta casa.
     * @return {@see true} se tiver peça definida; pelo contrário, {@see false}.
     */
    public boolean hasPiece() {
        return piece != null;
    }
}
