/**
 * Representa a peça Cavalo.
 */
public class Knight extends Piece {
    public Knight(Board board, Point position, PieceStyle style) {
        super(board, position, PieceType.Knight, style);
    }
    
    @Override
    protected boolean isValidMove(Point from, Point to) {
        return from.getDistance(to) == Math.sqrt(5);
    }
}
