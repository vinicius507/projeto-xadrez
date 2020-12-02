import java.lang.Math;

/**
 * Representa um par ordenado de coordenadas x e y de inteiros que define um ponto em um plano bidimensional.
 */
public class Point {
    /**
     * Identific a coordenada x.
     */
    private int x;

    /**
     * Identific a coordenada y.
     */
    private int y;

    /**
     * Inicializa uma nova instância da classe Point com as coordenadas especificadas.
     * @param x A coordenada x.
     * @param y A coordenada y.
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Obtém a coordenada x deste ponto.
     * @return A coordenada x.
     */
    public int getX() {
        return x;
    }
    
    /**
     * Obtém a coordenada y deste ponto.
     * @return A coordenada y.
     */
    public int getY() {
        return y;
    }

    /**
     * Obtém a distância entre este ponto e um outro ponto especificado.
     * @param point O ponto de destino.
     * @return A distância entre os pontos.
     */
    public double getDistance(Point point) {
        return Math.sqrt(Math.pow(point.getX() - getX(), 2) + Math.pow(point.getY() - getY(), 2));
    }
}
