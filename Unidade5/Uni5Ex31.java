import java.util.Scanner;

public class Uni5Ex31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número inteiro positivo: ");
        int numero = scanner.nextInt();

        int valorAtual = numero;

        System.out.println("Número\tDecomposição");

        int fator = 2;

        while (valorAtual > 1) {
            if (valorAtual % fator == 0) {
                System.out.println(valorAtual + "\t" + fator);
                valorAtual /= fator;
            } else {
                fator++;
            }
        }

        System.out.println(valorAtual + "\t");

        scanner.close();
    }
}
