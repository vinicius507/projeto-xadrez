import java.awt.Color;
import javax.swing.JPanel;

public class BoardView extends JPanel {

    private MainView mainView;
    private SquareView[][] squareViews;

    public BoardView() {
        // Construtor sem par�metros requerido pela especifica�?o JavaBeans.
    }

    public BoardView(MainView mainView) {
        this.mainView = mainView;

        initComponents();
        createPieces();
    }

    private void createPieces() {
        squareViews = new SquareView[8][8];

        for (int y = 7; y >= 0; y--) {
            for (int x = 0; x < 8; x++) {
                Point location = new Point(x, y);
                Color color = getSquareColor(location);
                SquareView squareView = new SquareView(location, color, this);

                squareViews[x][y] = squareView;

                add(squareView);
            }
        }
    }

    private Color getSquareColor(Point location) {
        return (location.getX() % 2 + location.getY() % 2) % 2 == 0 
            ? SquareView.DARK_COLOR 
            : SquareView.WHITE_COLOR;
    }

    public void update(Game game) {
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                SquareView squareView = squareViews[x][y];
                Square square = game.getBoard().getSquare(new Point(x, y));

                if (square.hasPiece()) {
                    Piece piece = square.getPiece();
                    squareView.drawPiece(piece.getType(), piece.getStyle());
                }
                else {
                    squareView.erasePiece();
                }
            }
        }
    }

    public MainView getMainView() {
        return mainView;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(new java.awt.GridLayout(8, 8));
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
