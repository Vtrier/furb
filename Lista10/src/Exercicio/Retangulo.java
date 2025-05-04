package Exercicio;

public class Retangulo extends Figura{

    /**
     * @return the largura
     */
    public int getLargura() {
        return largura;
    }

    /**
     * @param largura the largura to set
     */
    public void setLargura(int largura) {
        this.largura = largura;
    }

    /**
     * @return the altura
     */
    public int getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }
    private int largura;
    private int altura;
    
    public Retangulo(int largura, int altura){
        setAltura(altura);
        setLargura(largura);
    }
    
    @Override
    public double calcularArea() {
        return altura*largura;
    }
    
}
