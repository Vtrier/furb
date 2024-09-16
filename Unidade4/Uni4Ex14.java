import java.util.Scanner;

public class Uni4Ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dia: ");
        int dia = scanner.nextInt();
        System.out.print("Mês: ");
        int mes = scanner.nextInt();
        System.out.print("Ano: ");
        int ano = scanner.nextInt();

        if (dia > 31 || dia < 1 || mes > 12 || mes < 1) {
            System.out.println("Não válida");
        } else if (mes == 2 && dia == 29 && ano % 4 != 0) {
            System.out.println("Não válida");
        } else if (dia == 31 && mes == 2 || mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            System.out.println("Não válida");
        } else if (mes == 2 && dia == 30) {
            System.out.println("Não válida");
        } else{
            System.out.println("Válida");
        }

        scanner.close();
    }
}
