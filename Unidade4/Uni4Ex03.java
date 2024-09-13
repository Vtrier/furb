import java.util.Scanner;

public class Uni4Ex03 {
public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n1 = teclado.nextInt();
        int n2 = teclado.nextInt();

        if (n1 > n2) {
            System.out.println(n1 + " é maior que " + n2);
        }else if (n1 < n2) {
            System.out.println(n1 + " é menor que " + n2);
        }else{
            System.out.println(n1+" é igual a "+n2);
        }

        teclado.close();
    }
}
