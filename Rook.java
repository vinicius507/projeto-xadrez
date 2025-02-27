/**
 * Representa a peça Torre.
 */
public class Rook extends Piece {
    public Rook(Board board, Point position, PieceStyle style) {
        super(board, position, PieceType.Rook, style);
    }

    @Override
    protected boolean isValidMove(Point from, Point to) {
        return from.getX() == to.getX() || from.getY() == to.getY();
    }

    @Override
    protected boolean canMove(Board board, Point from, Point to) {
        if (Math.abs(to.getY() - from.getY()) > 1) {
            int sign = Integer.signum(to.getY() - from.getY());

            for (int i = 1; i < Math.abs(to.getY() - from.getY()); i++) {
                Point position = new Point(from.getX(), from.getY() + (i * sign));
                
                if (board.getSquare(position).hasPiece()) {
                    return false;
                }
            }
        } else if (Math.abs(to.getX() - from.getX()) > 1) {
            int sign = Integer.signum(to.getX() - from.getX());
            
            for (int i = 1; i < Math.abs(to.getX() - from.getX()); i++) {
                Point position = new Point(from.getX() + (i * sign), from.getY());

                if (board.getSquare(position).hasPiece()) {
                    return false;
                }
            }
        }

        return super.canMove(board, from, to);
    }
}
