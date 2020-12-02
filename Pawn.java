/**
 * Representa a peça Bispo.
 */
public class Pawn extends Piece {
    public Pawn(Board board, Point location, PieceStyle style) {
        super(board, location, PieceType.Pawn, style);
    }
    
    @Override
    protected boolean isValidMove(Point from, Point to) {
        return Math.abs(from.getX() - to.getX()) == Math.abs(from.getY() - to.getY());
    }

    @Override
    protected boolean canMove(Board board, Point from, Point to) {
        if (Math.abs(to.getX() - from.getX()) > 1) {
            int tan = (to.getY() - from.getY()) / (to.getX() - from.getX());
            int sign = Integer.signum(to.getX() - from.getX());

            for (int i = 1; i < Math.abs(to.getX() - from.getX()); i++) {
                Point location = new Point(from.getX() + (i * sign), from.getY() + (tan * i * sign));

                if (board.getSquare(location).hasPiece()) {
                   return false;
                }
            }
        }

        return super.canMove(board, from, to);
    }
}
