import java.util.Scanner;

public class Uni4Ex16{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Homem 1: ");
        int idadeHomem1 = scanner.nextInt();
        System.out.print("Homem 2: ");
        int idadeHomem2 = scanner.nextInt();

        System.out.print("Mulher 1: ");
        int idadeMulher1 = scanner.nextInt();
        System.out.print("Mulher 2: ");
        int idadeMulher2 = scanner.nextInt();

        int homemMaisVelho = Math.max(idadeHomem1, idadeHomem2);
        int homemMaisNovo = Math.min(idadeHomem1, idadeHomem2);

        int mulherMaisVelha = Math.max(idadeMulher1, idadeMulher2);
        int mulherMaisNova = Math.min(idadeMulher1, idadeMulher2);

        int soma = homemMaisVelho + mulherMaisNova;

        int produto = homemMaisNovo * mulherMaisVelha;

        System.out.println("Soma: " + soma);
        System.out.println("Produto: " + produto);

        scanner.close();
    }
}