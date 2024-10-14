import java.util.Scanner;

public class Uni5Ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double somaAlturaMulheres = 0;
        double somaAlturaTotal = 0;
        int contadorMulheres = 0;
        int contadorTotal = 0;
        
        while (true) {
            System.out.print("Digite a altura da pessoa (ou 0 para encerrar): ");
            double altura = scanner.nextDouble();
            
            if (altura == 0) {
                break;
            }
            
            System.out.print("Digite o gênero (M/F/O): ");
            char genero = scanner.next().charAt(0);
            
            if (genero == 'F' || genero == 'f') {
                somaAlturaMulheres += altura;
                contadorMulheres++;
            }
            
            somaAlturaTotal += altura;
            contadorTotal++;
        }
        
        double mediaAlturaMulheres = (contadorMulheres > 0) ? somaAlturaMulheres / contadorMulheres : 0;
        double mediaAlturaTotal = (contadorTotal > 0) ? somaAlturaTotal / contadorTotal : 0;

        System.out.printf("Média de altura das mulheres: %.2f\n", mediaAlturaMulheres);
        System.out.printf("Média de altura do grupo: %.2f\n", mediaAlturaTotal);
        
        scanner.close();
    }
}
