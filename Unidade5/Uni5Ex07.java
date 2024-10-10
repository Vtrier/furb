
import java.util.Scanner;

public class Uni5Ex07 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o número de elementos (n): ");
        int n = teclado.nextInt();

        if (n <= 0) {
            System.out.println("Por favor, insira um número positivo.");
        }

        double maior = Double.NEGATIVE_INFINITY;
        double menor = Double.POSITIVE_INFINITY;

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número real: ");
            double numero = teclado.nextDouble();

            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);

        teclado.close();
    }
}
