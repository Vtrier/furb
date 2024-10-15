import java.util.Scanner;

public class Uni5Ex29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe o valor a ser sacado: ");
        int valor = scanner.nextInt();
        
        int valorRestante = valor;
        
        System.out.println("Cédulas necessárias para o valor " + valor + ":");
        
        while (valorRestante >= 20) {
            int cedulasDe20 = valorRestante / 20;
            valorRestante -= cedulasDe20 * 20;
            System.out.println(cedulasDe20 + " cédula(s) de R$ 20");
        }
        
        while (valorRestante >= 10) {
            int cedulasDe10 = valorRestante / 10;
            valorRestante -= cedulasDe10 * 10;
            System.out.println(cedulasDe10 + " cédula(s) de R$ 10");
        }
        
        while (valorRestante >= 5) {
            int cedulasDe5 = valorRestante / 5;
            valorRestante -= cedulasDe5 * 5;
            System.out.println(cedulasDe5 + " cédula(s) de R$ 5");
        }
        
        while (valorRestante >= 2) {
            int cedulasDe2 = valorRestante / 2;
            valorRestante -= cedulasDe2 * 2;
            System.out.println(cedulasDe2 + " cédula(s) de R$ 2");
        }
        
        while (valorRestante >= 1) {
            int cedulasDe1 = valorRestante / 1;
            valorRestante -= cedulasDe1;
            System.out.println(cedulasDe1 + " cédula(s) de R$ 1");
        }

        scanner.close();
    }
}
