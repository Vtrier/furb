import java.util.Scanner;
import java.lang.Math;

public class Ex04 {
public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double num = teclado.nextDouble();

        if(num < 0){
            System.out.println("Numero precisa ser maior que 0");
        }
        else if (Math.floor(num) == num) {
            System.out.println(num + " é inteiro");
        }else {
            System.out.println(num + " é decimal");
        }
}
}
