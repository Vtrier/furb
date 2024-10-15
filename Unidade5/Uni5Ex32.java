import java.util.Scanner;

public class Uni5Ex32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o dia da semana do primeiro dia do mês (1=Domingo, 2=Segunda,...,7=Sábado): ");
        int primeiroDiaSemana = scanner.nextInt();

        System.out.print("Informe o número de dias do mês: ");
        int numeroDeDias = scanner.nextInt();

        System.out.println("D\tS\tT\tQ\tQ\tS\tS");

        int dia = 1;

        for (int i = 1; i < primeiroDiaSemana; i++) {
            System.out.print("\t");
        }

        for (int i = primeiroDiaSemana; i <= 7; i++) {
            System.out.print(dia + "\t");
            dia++;
        }
        System.out.println();

        while (dia <= numeroDeDias) {
            for (int i = 1; i <= 7 && dia <= numeroDeDias; i++) {
                System.out.print(dia + "\t");
                dia++;
            }
            System.out.println();
        }

        scanner.close();
    }
}
