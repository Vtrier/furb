
import java.util.Scanner;

public class Uni5Ex05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor para n (maior que 2): ");
        int n = scanner.nextInt();
        double n1 = 0;
        double n2 = 0;

        if (n <= 2) {
            System.out.println("O valor de n deve ser maior que 2.");
            scanner.close();
        } else {

            System.out.println("Os primeiros " + n + " termos da sequência são:");
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    n1 = Math.pow(2, (i / 2) + 3);
                    System.out.print(n1 + " ");
                } else {
                    n2 =  n1 + 2;
                    System.out.print(n2 + " ");
                }
            }
        }
        scanner.close();
    }
}
