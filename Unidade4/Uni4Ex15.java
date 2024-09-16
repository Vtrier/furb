import java.util.Scanner;

public class Uni4Ex15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Meses: ");
        int meses = scanner.nextInt();

        if (meses <= 12) {
            System.out.println("O funcionário irá receber 5% de reajuste.");
        } else if (meses >= 13 && meses <= 48) {
            System.out.println("O funcionário irá receber 7% de reajuste.");
        } else {
            System.out.println("Reajuste não informado.");
        }

        scanner.close();
    }
}