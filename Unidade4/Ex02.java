import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Numero: ");
    int bus = teclado.nextInt();

    if(bus<0){
        System.out.println("Numero precisa ser maior do que 0");
    }else if(bus % 2 == 0){
        System.out.println("Par");
    }else{
        System.out.println("Ímpar");
    }
    teclado.close();
    }
}
