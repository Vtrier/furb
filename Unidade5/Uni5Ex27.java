import java.util.Scanner;

public class Uni5Ex27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int diaMaiorProducao = 0;
        int maiorProducao = 0;
        String periodoMaiorProducao = "";
        int maiorProducaoManha = 0;
        int maiorProducaoTarde = 0;
        
        boolean continuar = true;
        
        while (continuar) {
            int dia;
            do {
                System.out.print("Dia: ");
                dia = scanner.nextInt();
                if (dia < 1 || dia > 30) {
                    System.out.println("Dia inválido");
                }
            } while (dia < 1 || dia > 30);

            System.out.print("Manhã: ");
            int producaoManha = scanner.nextInt();
            System.out.print("Tarde: ");
            int producaoTarde = scanner.nextInt();

            double valorRecebido = 0;

            if (dia >= 1 && dia <= 15) {
                if (producaoManha + producaoTarde > 100 && producaoManha >= 30 && producaoTarde >= 30) {
                    valorRecebido = (producaoManha + producaoTarde) * 0.80;
                } else {
                    valorRecebido = (producaoManha + producaoTarde) * 0.50;
                }
            } else {
                valorRecebido = producaoManha * 0.40 + producaoTarde * 0.30;
            }

            System.out.printf("R$ %.2f (valor recebido)%n", valorRecebido);

            int producaoTotal = producaoManha + producaoTarde;
            if (producaoTotal > maiorProducao) {
                maiorProducao = producaoTotal;
                diaMaiorProducao = dia;
            }

            if (producaoManha > maiorProducaoManha) {
                maiorProducaoManha = producaoManha;
                periodoMaiorProducao = "manhã";
            }
            if (producaoTarde > maiorProducaoTarde) {
                maiorProducaoTarde = producaoTarde;
                periodoMaiorProducao = "tarde";
            }

            System.out.print("Novo funcionário (1.sim 2.não)? ");
            int resposta = scanner.nextInt();
            if (resposta == 2) {
                continuar = false;
            }
        }

        System.out.println("Dia com maior produção: " + diaMaiorProducao);
        System.out.println("Período com maior produção: " + periodoMaiorProducao + " (" + (periodoMaiorProducao.equals("manhã") ? maiorProducaoManha : maiorProducaoTarde) + " peças)");

        scanner.close();
    }
}
