import java.util.Scanner;

public class Uni5Ex20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a massa inicial em Kg: ");
        double massaInicial = scanner.nextDouble();
        
        double massaAtual = massaInicial;
        int tempo = 0;
        
        while (massaAtual >= 0.0005) { 
            massaAtual /= 2; 
            tempo += 50; 
        }
        
        System.out.printf("Massa inicial: %.4f Kg\n", massaInicial);
        System.out.printf("Massa final: %.4f Kg\n", massaAtual);
        System.out.printf("Tempo necessário: %d segundos\n", tempo);
        
        scanner.close();
    }
}
