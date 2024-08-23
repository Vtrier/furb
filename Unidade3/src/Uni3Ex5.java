
import java.util.Scanner;

public class Uni3Ex5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Numero de frangos:");
        double frangolenho = teclado.nextDouble();

        double resultado = frangolenho * 11;

        System.out.println("Resultado: " + resultado);
        teclado.close();
    }
}
