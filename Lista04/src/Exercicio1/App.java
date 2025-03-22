package Exercicio1;

public class App {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(10, 5);
        
        System.out.println(retangulo.calcularPerimetro(retangulo.getAltura(), retangulo.getComprimento()));
    }
}
