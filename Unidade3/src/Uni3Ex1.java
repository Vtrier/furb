
import java.util.Scanner;

public class Uni3Ex1 {
    public static void main(String[] args) throws Exception {     
        Scanner teclado = new Scanner(System.in);   

        System.out.println("Lado 1:");
        double lado1 = teclado.nextDouble();
        System.out.println("Lado 2:");
        double lado2 = teclado.nextDouble();

        double resultado = lado1 * lado2;
        System.out.println(resultado);
        teclado.close();
    }
}
