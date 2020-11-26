import java.lang.Math;
/**
 * Armazena o tabuleiro e responsavel por posicionar as pecas.
 * 
 * @author Alan Moraes &lt;alan@ci.ufpb.br&gt;
 * @author Leonardo Villeth &lt;lvilleth@cc.ci.ufpb.br&gt;
 */
public class Jogo {

    private Tabuleiro tabuleiro;

    public Jogo() {
        tabuleiro = new Tabuleiro();
        criarPecas();
    }
    
    /**
     * Posiciona pe�as no tabuleiro.
     * Utilizado na inicializa�ao do jogo.
     */
    private void criarPecas() {
        Casa casa1 = tabuleiro.getCasa(0, 1);
        Peca peca1 = new Peca(casa1, Peca.PEAO_BRANCO);
            
        Casa casa2 = tabuleiro.getCasa(1, 1);
        Peca peca2 = new Peca(casa2, Peca.PEAO_BRANCO);
            
        Casa casa3 = tabuleiro.getCasa(2, 1);
        Peca peca3 = new Peca(casa3, Peca.PEAO_BRANCO);
            
        Casa casa4 = tabuleiro.getCasa(3, 1);
        Peca peca4 = new Peca(casa4, Peca.PEAO_BRANCO);
            
        Casa casa5 = tabuleiro.getCasa(4, 1);
        Peca peca5 = new Peca(casa5, Peca.PEAO_BRANCO);
            
        Casa casa6 = tabuleiro.getCasa(5, 1);
        Peca peca6 = new Peca(casa6, Peca.PEAO_BRANCO);
            
        Casa casa7 = tabuleiro.getCasa(6, 1);
        Peca peca7 = new Peca(casa7, Peca.PEAO_BRANCO);
            
        Casa casa8 = tabuleiro.getCasa(7, 1);
        Peca peca8 = new Peca(casa8, Peca.PEAO_BRANCO);
            
        Casa casa9 = tabuleiro.getCasa(0, 6);
        Peca peca9 = new Peca(casa9, Peca.PEAO_PRETO);
            
        Casa casa10 = tabuleiro.getCasa(1, 6);
        Peca peca10 = new Peca(casa10, Peca.PEAO_PRETO);
            
        Casa casa11 = tabuleiro.getCasa(2, 6);
        Peca peca11 = new Peca(casa11, Peca.PEAO_PRETO);
            
        Casa casa12 = tabuleiro.getCasa(3, 6);
        Peca peca12 = new Peca(casa12, Peca.PEAO_PRETO);
            
        Casa casa13 = tabuleiro.getCasa(4, 6);
        Peca peca13 = new Peca(casa13, Peca.PEAO_PRETO);
            
        Casa casa14 = tabuleiro.getCasa(5, 6);
        Peca peca14 = new Peca(casa14, Peca.PEAO_PRETO);
            
        Casa casa15 = tabuleiro.getCasa(6, 6);
        Peca peca15 = new Peca(casa15, Peca.PEAO_PRETO);
            
        Casa casa16 = tabuleiro.getCasa(7, 6);
        Peca peca16 = new Peca(casa16, Peca.PEAO_PRETO);
            
        Casa casa17 = tabuleiro.getCasa(0, 7);
        Peca peca17 = new Peca(casa17, Peca.TORRE_PRETA);
                
        Casa casa18 = tabuleiro.getCasa(7, 7);
        Peca peca18 = new Peca(casa18, Peca.TORRE_PRETA);
                
        Casa casa19 = tabuleiro.getCasa(2, 0);
        Peca peca19 = new Peca(casa19, Peca.BISPO_BRANCO);
                
        Casa casa20 = tabuleiro.getCasa(5, 0);
        Peca peca20 = new Peca(casa20, Peca.BISPO_BRANCO);
                
        Casa casa21 = tabuleiro.getCasa(3, 0);
        Peca peca21 = new Peca(casa21, Peca.RAINHA_BRANCA);
                
        Casa casa22 = tabuleiro.getCasa(3, 7);
        Peca peca22 = new Peca(casa22, Peca.RAINHA_PRETA);
                
        Casa casa23 = tabuleiro.getCasa(2, 7);
        Peca peca23 = new Peca(casa23, Peca.BISPO_PRETO);
                
        Casa casa24 = tabuleiro.getCasa(5, 7);
        Peca peca24 = new Peca(casa24, Peca.BISPO_PRETO);
                
        Casa casa25 = tabuleiro.getCasa(4, 7);
        Peca peca25 = new Peca(casa25, Peca.REI_PRETO);
                
        Casa casa26 = tabuleiro.getCasa(0, 0);
        Peca peca26 = new Peca(casa26, Peca.TORRE_BRANCA);
                
        Casa casa27 = tabuleiro.getCasa(7, 0);
        Peca peca27 = new Peca(casa27, Peca.TORRE_BRANCA);
                
        Casa casa28 = tabuleiro.getCasa(1, 7);
        Peca peca28 = new Peca(casa28, Peca.CAVALO_PRETO);
                
        Casa casa29 = tabuleiro.getCasa(6, 7);
        Peca peca29 = new Peca(casa29, Peca.CAVALO_PRETO);
                
        Casa casa30 = tabuleiro.getCasa(4, 0);
        Peca peca30 = new Peca(casa30, Peca.REI_BRANCO);
                
        Casa casa31 = tabuleiro.getCasa(1, 0);
        Peca peca31 = new Peca(casa31, Peca.CAVALO_BRANCO);
                
        Casa casa32 = tabuleiro.getCasa(6, 0);
        Peca peca32 = new Peca(casa32, Peca.CAVALO_BRANCO);
    }
    
    /**
     * Comanda uma Pe�a na posicao (origemX, origemY) fazer um movimento 
     * para (destinoX, destinoY).
     * 
     * @param origemX linha da Casa de origem.
     * @param origemY coluna da Casa de origem.
     * @param destinoX linha da Casa de destino.
     * @param destinoY coluna da Casa de destino.
     */

    // Fazer as verificações de movimento dentro do moverPeça
    public void moverPeca(int origemX, int origemY, int destinoX, int destinoY) {
        Casa origem = tabuleiro.getCasa(origemX, origemY);
        Casa destino = tabuleiro.getCasa(destinoX, destinoY);
        Peca peca = origem.getPeca();
        if (valido(origemX, origemY, destinoX, destinoY, peca)){
            peca.mover(destino);
        }
    }

    public void consumirPeca(int origemX, int origemY, int destinoX, int destinoY, boolean pecasDiferentes) {
        Casa origem = tabuleiro.getCasa(origemX, origemY);
        Casa destino = tabuleiro.getCasa(destinoX, destinoY);
        Peca peca = origem.getPeca();
        if (pecasDiferentes && podeConsumir(origemX, origemY, destinoX, destinoY, peca)) {
            peca.mover(destino);
        }
    }

    public boolean podeConsumir(int origemX, int origemY, int destinoX, int destinoY, Peca peca) {
        boolean podeConsumir;
        double distance = Math.sqrt((origemY - destinoY) * (origemY - destinoY) +
                                     (origemX - destinoX) * (origemX - destinoX));
        switch (peca.getTipo()) {
            case Peca.PEAO_BRANCO:
                podeConsumir = distance == Math.sqrt(2) && destinoY > origemY;
                break;
            case Peca.PEAO_PRETO:
                podeConsumir = distance == Math.sqrt(2) && destinoY < origemY;
                break;
            default:
                podeConsumir = valido(origemX, origemY, destinoX, destinoY, peca);
        }

        return podeConsumir;
    }

    public boolean valido(int origemX, int origemY, int destinoX, int destinoY, Peca peca) {
        boolean isValid = true;
        double distance = Math.sqrt((origemY - destinoY) * (origemY - destinoY) + 
                                    (origemX - destinoX) * (origemX - destinoX));

        switch (peca.getTipo()) {
            case Peca.CAVALO_BRANCO:
            case Peca.CAVALO_PRETO:
                isValid = distance == Math.sqrt(5);
                break;
            case Peca.REI_PRETO:
            case Peca.REI_BRANCO:
                isValid = distance == 1 || distance == Math.sqrt(2);
                break;
            case Peca.TORRE_BRANCA:
            case Peca.TORRE_PRETA:
                isValid = (origemX == destinoX || origemY == destinoY) && caminhoLivre(origemX, origemY, destinoX, destinoY, peca);
                break;
            case Peca.BISPO_BRANCO:
            case Peca.BISPO_PRETO:
                isValid = Math.abs(origemX - destinoX) == Math.abs(origemY - destinoY) && caminhoLivre(origemX, origemY, destinoX, destinoY, peca);
                break;
            case Peca.RAINHA_BRANCA: 
            case Peca.RAINHA_PRETA:
                isValid = caminhoLivre(origemX, origemY, destinoX, destinoY, peca) && (
                    origemX == destinoX || origemY == destinoY || Math.abs(origemX - destinoX) == Math.abs(origemY - destinoY)
                    );
                break;
            case Peca.PEAO_BRANCO:
                isValid =  origemY < destinoY && (
                    distance == 1 || distance == 2 && origemY == 1 && caminhoLivre(origemX, origemY, destinoX, destinoY, peca)
                    );
                break;
            case Peca.PEAO_PRETO:
                isValid = origemY > destinoY && (
                    distance == 1 || distance == 2 && origemY == 6 && caminhoLivre(origemX, origemY, destinoX, destinoY, peca)
                );
                break;
        }

        return isValid;
    }

    public boolean caminhoLivre(int origemX, int origemY, int destinoX, int destinoY, Peca peca) {
        boolean caminhoLivre = true;
        switch (peca.getTipo()) {
            case Peca.BISPO_BRANCO:
            case Peca.BISPO_PRETO:
                if (Math.abs(destinoX - origemX) > 1) {
                    int tan = (destinoY - origemY)/(destinoX - origemX);
                    int sign = Integer.signum(destinoX - origemX);
                    for (int i = 1; i < Math.abs(destinoX - origemX); i++) {
                        if (tabuleiro.getCasa(origemX + i*sign, origemY + tan*i*sign).possuiPeca()) {
                            caminhoLivre = false;
                            break;
                        }
                    }
                }
                break;
            case Peca.PEAO_BRANCO:
            case Peca.PEAO_PRETO:
            case Peca.TORRE_BRANCA:
            case Peca.TORRE_PRETA:
                if (Math.abs(destinoY - origemY) > 1) {
                    int sign = Integer.signum(destinoY - origemY);
                    for (int i = 1; i < Math.abs(destinoY - origemY); i++) {
                        if (tabuleiro.getCasa(origemX, origemY + i*sign).possuiPeca()) {
                            caminhoLivre = false;
                            break;
                        }
                    }
                } else if (Math.abs(destinoX - origemX) > 1) {
                    int sign = Integer.signum(destinoX - origemX);
                    for (int i = 1; i < Math.abs(destinoX - origemX); i++) {
                        if (tabuleiro.getCasa(origemX + i*sign, origemY).possuiPeca()) {
                            caminhoLivre = false;
                            break;
                        }
                    }
                }
                break;
            case Peca.RAINHA_BRANCA:
            case Peca.RAINHA_PRETA:
                if (origemX == destinoX && Math.abs(destinoY - origemY) > 1) {
                    int sign = Integer.signum(destinoY - origemY);
                    for (int i = 1; i < Math.abs(destinoY - origemY); i++) {
                        if (tabuleiro.getCasa(origemX, origemY + i*sign).possuiPeca()) {
                            caminhoLivre = false;
                            break;
                        }
                    } 
                } else if (origemY == destinoY && Math.abs(destinoX - origemX) > 1) {
                    int sign = Integer.signum(destinoX - origemX);
                    for (int i = 1; i < Math.abs(destinoX - origemX); i++) {
                        if (tabuleiro.getCasa(origemX + i*sign, origemY).possuiPeca()) {
                            caminhoLivre = false;
                            break;
                        }
                    }
                } else if (Math.abs(destinoY - origemY) > 1) {
                    int tan = (destinoY - origemY)/(destinoX - origemX);
                    int sign = Integer.signum(destinoX - origemX);
                    for (int i = 1; i < Math.abs(destinoX - origemX); i++) {
                        if (tabuleiro.getCasa(origemX + i*sign, origemY + tan*i*sign).possuiPeca()) {
                            caminhoLivre = false;
                            break;
                        }
                    }
                }
                break;
        }

        return caminhoLivre;
    }
    
    /**
     * @return o Tabuleiro em jogo.
     */
    public Tabuleiro getTabuleiro() {
        return tabuleiro;
    }
}
