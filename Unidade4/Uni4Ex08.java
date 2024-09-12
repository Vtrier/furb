import java.util.Scanner;

public class Uni4Ex08 {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          System.out.println("Escreva uma letra: ");
          String letra = scanner.nextLine();
          letra = letra.toLowerCase();

          if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
            System.out.println("Vogal");
          }else{
            System.out.println("Não é vogal");
          }
    }
}
