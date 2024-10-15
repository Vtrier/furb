import java.util.Scanner;

public class Uni5Ex33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int votosCandidato1 = 0;
        int votosCandidato2 = 0;
        int votosCandidato3 = 0;
        int votosCandidato4 = 0;
        int votosNulos = 0;
        int votosEmBranco = 0;
        int totalDeVotos = 0;

        int voto;

        do {
            System.out.print("Informe seu voto (1-4 para candidatos, 5 para nulo, 6 para branco, 0 para encerrar): ");
            voto = scanner.nextInt();

            switch (voto) {
                case 1:
                    votosCandidato1++;
                    totalDeVotos++;
                    break;
                case 2:
                    votosCandidato2++;
                    totalDeVotos++;
                    break;
                case 3:
                    votosCandidato3++;
                    totalDeVotos++;
                    break;
                case 4:
                    votosCandidato4++;
                    totalDeVotos++;
                    break;
                case 5:
                    votosNulos++;
                    totalDeVotos++;
                    break;
                case 6:
                    votosEmBranco++;
                    totalDeVotos++;
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção incorreta! Por favor, informe um número válido.");
            }
        } while (voto != 0);

        double percentualNulos = (totalDeVotos > 0) ? ((double) votosNulos / totalDeVotos) * 100 : 0;
        double percentualBrancos = (totalDeVotos > 0) ? ((double) votosEmBranco / totalDeVotos) * 100 : 0;

        System.out.println("\nResultado da votação:");
        System.out.println("Candidato 1: " + votosCandidato1 + " voto(s)");
        System.out.println("Candidato 2: " + votosCandidato2 + " voto(s)");
        System.out.println("Candidato 3: " + votosCandidato3 + " voto(s)");
        System.out.println("Candidato 4: " + votosCandidato4 + " voto(s)");
        System.out.println("Votos nulos: " + votosNulos);
        System.out.println("Votos em branco: " + votosEmBranco);
        System.out.println("Percentual de votos nulos sobre o total: " + percentualNulos + "%");
        System.out.println("Percentual de votos em branco sobre o total: " + percentualBrancos + "%");

        scanner.close();
    }
}
