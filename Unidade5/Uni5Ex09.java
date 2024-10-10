import java.util.Scanner;

public class Uni5Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de alunos (n): ");
        int n = scanner.nextInt();
        scanner.nextLine();

        int contAlunosAcima20 = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o nome do aluno: ");
            String nome = scanner.nextLine();

            System.out.print("Digite a idade do aluno: ");
            int idade = scanner.nextInt();
            scanner.nextLine();

            if (idade == 18) {
                System.out.println("Aluno com 18 anos: " + nome);
            }

            if (idade > 20) {
                contAlunosAcima20++;
            }
        }

        System.out.println("Quantidade de alunos acima de 20 anos: " + contAlunosAcima20);

        scanner.close();
    }
}
