package Exercicio1;

public class Retangulo {

    private int altura;
    private int comprimento;

    public Retangulo(int altura, int comprimento) {
        this.altura=altura;
        this.comprimento=comprimento;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }
    
    public int calcularPerimetro(int altura, int comprimento){
        int perimetro = (altura*2)+(comprimento*2);
        return perimetro;
    
    }
    public int calcularArea(int altura, int comprimento) {
        int area = (altura * comprimento);
        return area;
    }
    
    
}
