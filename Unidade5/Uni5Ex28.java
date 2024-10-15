import java.util.Scanner;

public class Uni5Ex28{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int votosNenhumDeNos = 0;
        int votosCPM22 = 0;
        int votosSkank = 0;
        int votosJotaQuest = 0;
        int totalVotos = 0;
        String continuar = "s";

        while (continuar.equalsIgnoreCase("s")) {
            System.out.println("Informe seu voto:");
            System.out.println("1 - Nenhum de Nós");
            System.out.println("2 - CPM22");
            System.out.println("3 - Skank");
            System.out.println("4 - Jota Quest");
            int voto = scanner.nextInt();
            
            switch (voto) {
                case 1:
                    votosNenhumDeNos++;
                    break;
                case 2:
                    votosCPM22++;
                    break;
                case 3:
                    votosSkank++;
                    break;
                case 4:
                    votosJotaQuest++;
                    break;
                default:
                    System.out.println("Voto inválido. Tente novamente.");
                    continue;
            }
            
            totalVotos++;
            
            System.out.print("Mais um voto: s (SIM) / n (NÃO)? ");
            continuar = scanner.next();
        }

        double percentualNenhumDeNos = (votosNenhumDeNos * 100.0) / totalVotos;
        double percentualCPM22 = (votosCPM22 * 100.0) / totalVotos;
        double percentualSkank = (votosSkank * 100.0) / totalVotos;
        double percentualJotaQuest = (votosJotaQuest * 100.0) / totalVotos;

        System.out.println("\nResultado da votação:");
        System.out.println("Nenhum de Nós: " + votosNenhumDeNos + " votos (" + percentualNenhumDeNos + "%)");
        System.out.println("CPM22: " + votosCPM22 + " votos (" + percentualCPM22 + "%)");
        System.out.println("Skank: " + votosSkank + " votos (" + percentualSkank + "%)");
        System.out.println("Jota Quest: " + votosJotaQuest + " votos (" + percentualJotaQuest + "%)");

        String vencedor = "";
        int maiorVotos = Math.max(Math.max(votosNenhumDeNos, votosCPM22), Math.max(votosSkank, votosJotaQuest));

        if (maiorVotos == votosNenhumDeNos) {
            vencedor = "Nenhum de Nós";
        } else if (maiorVotos == votosCPM22) {
            vencedor = "CPM22";
        } else if (maiorVotos == votosSkank) {
            vencedor = "Skank";
        } else if (maiorVotos == votosJotaQuest) {
            vencedor = "Jota Quest";
        }

        System.out.println("\nO grupo vencedor é: " + vencedor);

        scanner.close();
    }
}