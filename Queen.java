/**
 * Representa a peça Rainha.
 */
public class Queen extends Piece {
    public Queen(Board board, Point location, PieceStyle style) {
        super(board, location, PieceType.Queen, style);
    }
    
    @Override
    protected boolean isValidMove(Point from, Point to) {
        return from.getX() == to.getX() || from.getY() == to.getY() 
            || Math.abs(from.getX() - to.getX()) == Math.abs(from.getY() - to.getY());
    }

    @Override
    protected boolean canMove(Board board, Point from, Point to) {
        if (from.getX() == to.getX() && Math.abs(to.getY() - from.getY()) > 1) {
            int sign = Integer.signum(to.getY() - from.getY());

            for (int i = 1; i < Math.abs(to.getY() - from.getY()); i++) {
                Point location = new Point(from.getX(), from.getY() + (i * sign));

                if (board.getSquare(location).hasPiece()) {
                   return false;
                }
            } 
        } else if (from.getY() == to.getY() && Math.abs(to.getX() - from.getX()) > 1) {
            int sign = Integer.signum(to.getX() - from.getX());

            for (int i = 1; i < Math.abs(to.getX() - from.getX()); i++) {
                Point location = new Point(from.getX() + (i * sign), from.getY());

                if (board.getSquare(location).hasPiece()) {
                    return false;
                }
            }
        } else if (Math.abs(to.getY() - from.getY()) > 1) {
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
