/**
 * Representa o tabuleiro do jogo.
 */
public class Board {
    /**
     * Identifica os casas do tabuleiro.
     */
    private Square[][] squares;

    /**
     * Cria uma nova instância da classe Board.
     */
    public Board() {
        squares = new Square[8][8];

        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                squares[x][y] = new Square(new Point(x, y));
            }
        }
    }

    /**
     * Obtém uma casa em uma posição específica.
     * @param point A posição da casa a ser obtida.
     * @return A casa que representa a posição especificada.
     */
    public Square getSquare(Point point) {
        return squares[point.getX()][point.getY()];
    }
}
