import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;

public class SquareView extends JButton {
	public static final Color WHITE_COLOR = new Color(182, 155, 76);
    public static final Color DARK_COLOR = new Color(65, 41, 1);
    private static final Color HIGHLIGHT_COLOR = new Color(0, 1, 0, 0.4f);
    
    public static final int NO_PIECE = -1;
    public static final int WHITE_PIECE = 0;
    public static final int BLACK_PIECE = 1;
    
    private Point location;
    private Color color;

    public SquareView(Point location, Color color, BoardView board) {
        this.location = location;
        this.color = color;

        setIcon(null);

        // Layout e cor
        setBackground(color);
        setOpaque(false);
        setBorder(BorderFactory.createLineBorder(color, 1));
        setContentAreaFilled(false);

        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                board.getMainView().interact((SquareView) e.getSource());
            }
        });
    }

    public Point getBoardLocation() {
        return location;
    }

    public void drawPiece(PieceType type, PieceStyle style) {
        setIcon(AssetFactory.createIcon(type, style));
    }

    public void erasePiece() {
        setIcon(null);
    }

    public boolean hasPiece() {
        return getIcon() != null;
    }
    
    public int getPieceColor() {
        if (hasPiece()) {
            String iconName = getIcon().toString();
            
            if (iconName.contains("white")){
                return WHITE_PIECE;
            } else if (iconName.contains("black")) {
                return BLACK_PIECE;
            }
        }

        return NO_PIECE;
    }
    
    public void highliht() {
        setBackground(HIGHLIGHT_COLOR);
    }

    public void soften() {
        setBackground(color);
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(getBackground());
        g.fillRect(0, 0, getWidth(), getHeight());
        
        super.paintComponent(g);
    }
}