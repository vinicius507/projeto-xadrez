/**
 * Representa a peça Rei.
 */
public class King extends Piece {
    public King(Board board, Point position, PieceStyle style) {
        super(board, position, PieceType.King, style);
    }
    
    @Override
    protected boolean isValidMove(Point from, Point to) {
        double distance = from.getDistance(to);
        return distance == 1 || distance == Math.sqrt(2);
    }
}
