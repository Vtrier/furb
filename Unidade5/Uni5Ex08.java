import java.util.Scanner;

public class Uni5Ex08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o número de elementos (n): ");
        int n = teclado.nextInt();

        if (n <= 0) {
            System.out.println("Por favor, insira um número positivo.");
        }

        int menor = Integer.MAX_VALUE;
        double somaPositivos = 0;
        int numeroPositivos = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número inteiro: ");
            int numero = teclado.nextInt();

            if (numero > 0) {
                numeroPositivos++;
                somaPositivos += numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("Media: " + (somaPositivos / numeroPositivos));
        System.out.println("Menor número: " + menor);

        teclado.close();
    }
}
