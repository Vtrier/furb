import java.util.Scanner;

public class Uni5Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número total de reabastecimentos: ");
        int n = scanner.nextInt();
        
        System.out.print("Digite a quilometragem do odômetro antes da viagem: ");
        double odometroAnterior = scanner.nextDouble();
        
        double totalQuilometragem = 0;
        double totalCombustivel = 0;
        
        for (int i = 0; i < n; i++) {
            System.out.print("Digite a quilometragem do odômetro na parada " + (i + 1) + ": ");
            double odometroParada = scanner.nextDouble();
            
            System.out.print("Digite a quantidade de combustível comprado (em litros): ");
            double combustivel = scanner.nextDouble();
            
            double quilometragemPercorrida = odometroParada - odometroAnterior;
            
            double quilometragemPorLitro = quilometragemPercorrida / combustivel;
            
            totalQuilometragem += quilometragemPercorrida;
            totalCombustivel += combustivel;
            
            odometroAnterior = odometroParada;
            
            System.out.printf("Quilometragem obtida por litro na parada %d: %.2f km/l\n", (i + 1), quilometragemPorLitro);
        }
        
        double quilometragemMediaPorLitro = totalQuilometragem / totalCombustivel;
        
        System.out.printf("Quilometragem média obtida por litro em toda a viagem: %.2f km/l\n", quilometragemMediaPorLitro);
        
        scanner.close();
    }
}
