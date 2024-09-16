import java.util.Scanner;

public class Uni4Ex18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dia do vencimento: ");
        int diaVencimento = scanner.nextInt();

        System.out.print("Dia do pagamento: ");
        int diaPagamento = scanner.nextInt();

        System.out.print("Valor da prestação: ");
        double valorPrestacao = scanner.nextDouble();

        double valorFinal = valorPrestacao;

        if (diaPagamento <= diaVencimento) {
            valorFinal = valorPrestacao * 0.9;
            System.out.println("O pagamento está em dia.");
            System.out.printf("Valor da prestação = R$%.2f\n", valorFinal);
        } else if (diaPagamento <= diaVencimento + 5) {
            System.out.println("O pagamento está atrasado, mas dentro de 5 dias.");
            System.out.printf("Valor da prestação = R$%.2f\n", valorFinal);
        } else {
            int diasAtraso = diaPagamento - diaVencimento;
            valorFinal = valorPrestacao * (1 + 0.02 * diasAtraso);
            System.out.println("O pagamento está atrasado. Multa de 2% por dia de atraso.");
            System.out.printf("Valor da prestação = R$%.2f\n", valorFinal);
        }

        scanner.close();
    }
}
