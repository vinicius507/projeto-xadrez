import javax.swing.JOptionPane;

/**
 * Representa uma Pe�a do jogo.
 * Possui uma casa e um tipo associado.
 * 
 * @author Alan Moraes &lt;alan@ci.ufpb.br&gt;
 * @author Leonardo Villeth &lt;lvilleth@cc.ci.ufpb.br&gt;
 */
public class Peca {
    public static final int PEAO_BRANCO = 0;
    public static final int PEAO_PRETO = 1;
    public static final int TORRE_PRETA = 2;
    public static final int BISPO_BRANCO = 3;
    public static final int RAINHA_BRANCA = 4;
    public static final int RAINHA_PRETA = 5;
    public static final int BISPO_PRETO = 6;
    public static final int REI_PRETO = 7;
    public static final int TORRE_BRANCA = 8;
    public static final int CAVALO_PRETO = 9;
    public static final int REI_BRANCO = 10;
    public static final int CAVALO_BRANCO = 11;

    private Casa casa;
    private int tipo;

    public Peca(Casa casa, int tipo) {
        this.casa = casa;
        this.tipo = tipo;
        casa.colocarPeca(this);
    }
    
    /**
     * Movimenta a peca para uma nova casa.
     * @param destino nova casa que ira conter esta peca.
     */
    public void mover(Casa destino) {
        casa.removerPeca();
        destino.colocarPeca(this);
        casa = destino;
    }

    /**
     * Valor    Tipo
     *   0   Branca (Pedra)
     *   1   Branca (Dama)
     *   2   Vermelha (Pedra)
     *   3   Vermelha (Dama)
     * @return o tipo da peca.
     */
    public int getTipo() {
        return tipo;
    }
}
