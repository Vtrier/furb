import java.util.Scanner;

public class Uni5Ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numeroInscricaoMaisAlto = 0;
        double alturaMaisAlta = Double.MIN_VALUE; 
        int numeroInscricaoMaisBaixo = 0;
        double alturaMaisBaixa = Double.MAX_VALUE; 
        double somaAlturas = 0;
        int contadorAtletas = 0;
        
        while (true) {
            System.out.print("Digite o número de inscrição do atleta (ou 0 para encerrar): ");
            int numeroInscricao = scanner.nextInt();
            
            if (numeroInscricao == 0) {
                break;
            }
            
            System.out.print("Digite a altura do atleta: ");
            double altura = scanner.nextDouble();
            
            if (altura > alturaMaisAlta) {
                alturaMaisAlta = altura;
                numeroInscricaoMaisAlto = numeroInscricao;
            }
            
            if (altura < alturaMaisBaixa) {
                alturaMaisBaixa = altura;
                numeroInscricaoMaisBaixo = numeroInscricao;
            }
            
            somaAlturas += altura;
            contadorAtletas++;
        }
        

        double alturaMedia = (contadorAtletas > 0) ? somaAlturas / contadorAtletas : 0;

        System.out.printf("Atleta mais alto: Número de Inscrição: %d, Altura: %.2f\n", numeroInscricaoMaisAlto, alturaMaisAlta);
        System.out.printf("Atleta mais baixo: Número de Inscrição: %d, Altura: %.2f\n", numeroInscricaoMaisBaixo, alturaMaisBaixa);
        System.out.printf("Altura média do grupo: %.2f\n", alturaMedia);
        
        scanner.close();
    }
}
