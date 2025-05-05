import java.util.Scanner;

public class Teclado {
    private Scanner scanner;

    public Teclado() {
        scanner = new Scanner(System.in);
    }

    public int lerInt(String mensagem) {
        while (true) {
            System.out.print(mensagem);
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Digite um número inteiro válido.");
            }
        }
    }

    public double lerDouble(String mensagem) {
        while (true) {
            System.out.print(mensagem);
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Digite um número decimal válido.");
            }
        }
    }

    public String lerString(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine();
    }

    public boolean lerBoolean(String mensagem) {
        while (true) {
            System.out.print(mensagem);
            String entrada = scanner.nextLine().toLowerCase();

            if (entrada.equals("sim") || entrada.equals("verdadeiro") || entrada.equals("positivo") || entrada.equals("s")) {
                return true;
            } else if (entrada.equals("nao") || entrada.equals("não") || entrada.equals("falso") || entrada.equals("negativo") || entrada.equals("n")) {
                return false;
            } else {
                System.out.println("Digite uma opção válida (sim/não, verdadeiro/falso, s/n).");
            }
        }
    }
}