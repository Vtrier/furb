import java.util.Scanner;

public class Uni4Ex20 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Prova 1: ");
        double notaProva1 = scanner.nextDouble();

        System.out.print("Prova 2: ");
        double notaProva2 = scanner.nextDouble();

        System.out.print("Prova 3: ");
        double notaProva3 = scanner.nextDouble();

        System.out.print("Média dos exercícios: ");
        double mediaExercicios = scanner.nextDouble();

        double mediaAproveitamento = (notaProva1 + notaProva2 * 2 + notaProva3 * 3 + mediaExercicios) / 7;

        System.out.printf("Média de aproveitamento: %.2f\n", mediaAproveitamento);

        if (mediaAproveitamento >= 9.0) {
            System.out.println("Conceito: A");
            System.out.println("Aprovado");
        } else if (mediaAproveitamento >= 7.5) {
            System.out.println("Conceito: B");
            System.out.println("Aprovado");
        } else if (mediaAproveitamento >= 6.0) {
            System.out.println("Conceito: C");
            System.out.println("Aprovado");
        } else if (mediaAproveitamento >= 4.0) {
            System.out.println("Conceito: D");
            System.out.println("Reprovado");
        } else {
            System.out.println("Conceito: E");
            System.out.println("Reprovado");
        }

        scanner.close();
    }
}
