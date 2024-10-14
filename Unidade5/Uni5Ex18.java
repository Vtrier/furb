import java.util.Scanner;

public class Uni5Ex18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int totalPessoas = 0;
        int totalCanal4 = 0;
        int totalCanal5 = 0;
        int totalCanal9 = 0;
        int totalCanal12 = 0;
        
        while (true) {
            System.out.print("Digite o número do canal (4, 5, 9, 12 ou 0 para encerrar): ");
            int canal = scanner.nextInt();
            
            if (canal == 0) {
                break;
            }
            
            System.out.print("Digite o número de pessoas assistindo: ");
            int pessoas = scanner.nextInt();
            
            if (canal == 4) {
                totalCanal4 += pessoas;
            } else if (canal == 5) {
                totalCanal5 += pessoas;
            } else if (canal == 9) {
                totalCanal9 += pessoas;
            } else if (canal == 12) {
                totalCanal12 += pessoas;
            }
            
            totalPessoas += pessoas;
        }
        
        if (totalPessoas > 0) {
            double percentualCanal4 = (double) totalCanal4 / totalPessoas * 100;
            double percentualCanal5 = (double) totalCanal5 / totalPessoas * 100;
            double percentualCanal9 = (double) totalCanal9 / totalPessoas * 100;
            double percentualCanal12 = (double) totalCanal12 / totalPessoas * 100;
            
            System.out.printf("Percentual de audiência do canal 4: %.2f%%\n", percentualCanal4);
            System.out.printf("Percentual de audiência do canal 5: %.2f%%\n", percentualCanal5);
            System.out.printf("Percentual de audiência do canal 9: %.2f%%\n", percentualCanal9);
            System.out.printf("Percentual de audiência do canal 12: %.2f%%\n", percentualCanal12);
        } else {
            System.out.println("Nenhuma pessoa estava assistindo.");
        }
        
        scanner.close();
    }
}
