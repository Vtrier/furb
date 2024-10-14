import java.util.Scanner;

public class Uni5Ex26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Valor máximo de pedágio: ");
        double valorMaximoPedagio = scanner.nextDouble();

        int totalTrechos = 0;
        int trechosAcimaLimite = 0;
        int trechosAcima150kmComValorAceito = 0;

        while (true) {
            System.out.print("Digite o valor do pedágio (valor negativo para encerrar): ");
            double valorPedagio = scanner.nextDouble();

            if (valorPedagio < 0) {
                break;
            }

            System.out.print("Digite a distância do trecho (em Km): ");
            double distancia = scanner.nextDouble();

            totalTrechos++;

            if (valorPedagio > valorMaximoPedagio) {
                trechosAcimaLimite++;
            }

            if (distancia > 150 && valorPedagio <= valorMaximoPedagio) {
                trechosAcima150kmComValorAceito++;
            }
        }

        System.out.println(trechosAcimaLimite + " trechos com valor acima do qual ele nega-se a pagar.");
        System.out.println(totalTrechos + " trechos informados.");
        System.out.println(trechosAcima150kmComValorAceito + " trechos acima de 150km com valor aceito por ele.");

        scanner.close();
    }
}
