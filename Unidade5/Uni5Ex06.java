
import java.util.Random;

public class Uni5Ex06 {

    public static void main(String[] args) {
        Random gerador = new Random();
        int i;
        double soma = 0;

        for (i = 0; i < 20; i++) {
            double altura = gerador.nextDouble(1.40, 2.10);
            System.out.printf("%.2f\n", altura);
            soma += altura;
        } 
        
        double media = soma / 20;
        System.out.printf("Media: %.2f\n", media);
    }
}

