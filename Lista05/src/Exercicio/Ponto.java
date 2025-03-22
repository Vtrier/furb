package Exercicio;

public class Ponto {

    private int x;
    private int y;

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Quadrante identificarQuadrante() {
        if (x > 0 && y > 0) {
            return Quadrante.PRIMEIRO;
        } else if (x < 0 && y > 0) {
            return Quadrante.SEGUNDO;
        } else if (x < 0 && y < 0) {
            return Quadrante.TERCEIRO;
        } else if (x > 0 && y < 0) {
            return Quadrante.QUARTO;
        } else {
            return Quadrante.NENHUM;
        }
    }

    public boolean estaIncidindoSobreX() {
        if (x == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean estaIncidindoSobreY() {
        if (y == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static double calcularDistancia(Ponto outroPonto, Ponto ponto) {
        return Math.sqrt(Math.pow(outroPonto.getX()-ponto.getX(), 2) + Math.pow(outroPonto.getY()-ponto.getY(), 2));
    }

}
