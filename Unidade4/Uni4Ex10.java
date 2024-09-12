
import java.util.Scanner;

public class Uni4Ex10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Idade do Marquinhos: ");
        int m = scanner.nextInt();
        System.out.println("Idade do Zezinho: ");
        int z = scanner.nextInt();
        System.out.println("Idade da Luluzinha: ");
        int l = scanner.nextInt();

        if (Math.min(m, Math.min(z, l)) == m) {
            System.out.println("Marquinhos é o caçula");
        } else if (Math.min(m, Math.min(z, l)) == z) {
            System.out.println("Zezinho é o caçula");
        } else if (Math.min(m, Math.min(z, l)) == l) {
            System.out.println("Luluzinha é a caçula");
        }
    }
}
