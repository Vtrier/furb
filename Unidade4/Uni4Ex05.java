import java.util.Scanner;

public class Uni4Ex05 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in); 

        System.out.println("A cor é azul?");
        boolean cor = teclado.nextBoolean();

        if (cor) {
            System.out.println("Sim");
        }else
            System.out.println("Não");

        teclado.close();
    }

}