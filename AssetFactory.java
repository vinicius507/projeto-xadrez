import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 * Classe usada para instancias recursos de jogo.
 */
public class AssetFactory {
    /**
     * Cria o ícone para uma peça.
     * @param type O tipo da peça.
     * @param style O estilo da peça.
     * @return O ícone represetando a peça.
     */
    public static Icon createIcon(PieceType type, PieceStyle style) {
        switch(type) {
            case Bishop:
                return style == PieceStyle.White 
                    ? new ImageIcon("assets/bishop-white.png") 
                    : new ImageIcon("assets/bishop-black.png");
            case King:
                return style == PieceStyle.White 
                    ? new ImageIcon("assets/king-white.png") 
                    : new ImageIcon("assets/king-black.png");
            case Knight:
                return style == PieceStyle.White 
                    ? new ImageIcon("assets/knight-white.png") 
                    : new ImageIcon("assets/knight-black.png");
            case Pawn:
                return style == PieceStyle.White 
                    ? new ImageIcon("assets/pawn-white.png") 
                    : new ImageIcon("assets/pawn-black.png");
            case Queen:
                return style == PieceStyle.White 
                    ? new ImageIcon("assets/queen-white.png") 
                    : new ImageIcon("assets/queen-black.png");
            case Rook:
                return style == PieceStyle.White 
                    ? new ImageIcon("assets/rook-white.png") 
                    : new ImageIcon("assets/rook-black.png");
            default:
                return null;
        }
    }
}
