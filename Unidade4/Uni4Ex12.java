import java.util.Scanner;

public class Uni4Ex12 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Irmão 1: ");
        int i1 = scanner.nextInt();
        System.out.println("irmão 2: ");
        int i2 = scanner.nextInt();
        System.out.println("Irmão 3: ");
        int i3 = scanner.nextInt();

        if (i1 == i2 && i1 == i3) {
            System.out.println("TRIGÊMEOS");
        } else if (i1 == i2 || i1 == i3 || i2 == i3) {
            System.out.println("GÊMEOS");
        } else{
            System.out.println("NÃO SÃO GÊMEOS");
        }
    }
}
