import java.util.Scanner;

public class Uni5Ex23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar = 's';

        while (continuar == 's' || continuar == 'S') {
            System.out.print("Digite o nome do vendedor: ");
            String nome = scanner.nextLine();

            System.out.print("Digite o número de produtos vendidos: ");
            int numeroProdutos = scanner.nextInt();

            double totalVendas = 0.0;

            for (int i = 1; i <= numeroProdutos; i++) {
                System.out.print("Digite o preço unitário do produto " + i + ": ");
                double precoUnitario = scanner.nextDouble();

                System.out.print("Digite a quantidade vendida do produto " + i + ": ");
                int quantidadeVendida = scanner.nextInt();

                totalVendas += precoUnitario * quantidadeVendida;
            }

            double salario = totalVendas * 0.30;

            System.out.printf("Nome: %s%n", nome);
            System.out.printf("Total de vendas: R$ %.2f%n", totalVendas);
            System.out.printf("Salário: R$ %.2f%n", salario);

            System.out.print("Deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)? ");
            continuar = scanner.next().charAt(0);

            scanner.nextLine();
        }

        scanner.close();
    }
}
