import java.util.Scanner;

public class Uni4Ex02 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Numero: ");
    int num = teclado.nextInt();

    if(num<0){
        System.out.println("Numero precisa ser maior do que 0");
    }else if(num % 2 == 0){
        System.out.println("Par");
    }else{
        System.out.println("Ímpar");
    }
    teclado.close();
    }
}
