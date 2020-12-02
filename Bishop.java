/**
 * Representa a peça Peão.
 */
public class Bishop extends Piece {
    public Bishop(Board board, Point location, PieceStyle style) {
        super(board, location, PieceType.Bishop, style);
    }
    
    @Override
    protected boolean isValidMove(Point from, Point to) {
        double distance = from.getDistance(to);

        if (getStyle() == PieceStyle.White) {
            return  from.getY() < to.getY() && (distance == 1 || distance == 2 && from.getY() == 1);
        } else {
            return from.getY() > to.getY() && (distance == 1 || distance == 2 && from.getY() == 6);
        }
    }

    @Override
    protected boolean canMove(Board board, Point from, Point to) {
        if (Math.abs(to.getY() - from.getY()) > 1) {
            int sign = Integer.signum(to.getY() - from.getY());

            for (int i = 1; i < Math.abs(to.getY() - from.getY()); i++) {
                Point location = new Point(from.getX(), from.getY() + (i * sign));
                
                if (board.getSquare(location).hasPiece()) {
                    return false;
                }
            }
        } else if (Math.abs(to.getX() - from.getX()) > 1) {
            int sign = Integer.signum(to.getX() - from.getX());

            for (int i = 1; i < Math.abs(to.getX() - from.getX()); i++) {
                Point location = new Point(from.getX() + (i * sign), from.getY());

                if (board.getSquare(location).hasPiece()) {
                    return false;
                }
            }
        }

        return super.canMove(board, from, to);
    }

    @Override
    protected boolean canCapture(Board board, Point from, Point to) {
        double distance = from.getDistance(to);

        if (getStyle() == PieceStyle.White) {
            return distance == Math.sqrt(2) && to.getY() > from.getY();
        } else {
            return distance == Math.sqrt(2) && to.getY() < from.getY();
        }
    }
}
