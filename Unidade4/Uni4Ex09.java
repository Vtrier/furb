import java.util.Scanner;

public class Uni4Ex09 {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          System.out.println("Digite um valor: ");
          int n1 = scanner.nextInt();
          System.out.println("Digite outro valor: ");
          int n2 = scanner.nextInt();

          if (Math.max(n1, n2) % Math.min(n1, n2) == 0) {
            System.out.println("São múltiplos");
          }else{
            System.out.println("Não são múltiplos");
          }
    }
}
