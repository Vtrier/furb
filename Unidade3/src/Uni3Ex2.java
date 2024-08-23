
import java.util.Scanner;

public class Uni3Ex2 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor dos sapatos: ");
        double produto = teclado.nextDouble();

        double resultado = produto * 0.88;

        System.out.println("O valor do desconto é: " + (produto - produto * 0.88));
        System.out.println("O valor do produto com desconto é: " + (resultado));
        teclado.close();
    }
}
