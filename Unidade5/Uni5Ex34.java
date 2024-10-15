import java.util.Scanner;

public class Uni5Ex34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contasEncerradas = 0;
        int opcao;

        do {
            System.out.println("\n--- Menu do Hotel ---");
            System.out.println("(1) Encerrar a conta de um hóspede");
            System.out.println("(2) Verificar número de contas encerradas");
            System.out.println("(3) Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Informe o nome do hóspede: ");
                    String nomeHospede = scanner.nextLine();

                    System.out.print("Informe o número de diárias: ");
                    int numeroDiarias = scanner.nextInt();

                    double valorDiarias = numeroDiarias * 50.0;
                    double taxaServico;

                    if (numeroDiarias < 15) {
                        taxaServico = numeroDiarias * 7.50;
                    } else if (numeroDiarias == 15) {
                        taxaServico = numeroDiarias * 6.50;
                    } else {
                        taxaServico = numeroDiarias * 5.00;
                    }

                    double totalAPagar = valorDiarias + taxaServico;

                    System.out.println("\nHóspede: " + nomeHospede);
                    System.out.printf("Total a ser pago: R$ %.2f%n", totalAPagar);

                    contasEncerradas++;
                    break;

                case 2:
                    System.out.println("Número de contas encerradas: " + contasEncerradas);
                    break;

                case 3:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
                    break;
            }
        } while (opcao != 3);

        scanner.close();
    }
}
