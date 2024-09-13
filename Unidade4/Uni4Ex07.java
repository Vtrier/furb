import java.util.Scanner;

public class Uni4Ex07 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Peso da carta (em gramas): ");
        double carta = teclado.nextDouble();

        if (carta <= 50 && carta > 0) {
            double valorFinal = 0.45;
            System.out.println("Custo do selo: " + valorFinal);
        }else if(carta > 50){
            double pesoExcedido = carta - 50;
            double qtdAdicional = (pesoExcedido/20)+1;

            double valorFinal = 0.45 + 0.45 *qtdAdicional;
            System.out.printf("Custo do selo: R$%.2f", valorFinal);
        }
        
        teclado.close();
    }
}