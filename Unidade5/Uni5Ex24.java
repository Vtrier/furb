import java.util.Scanner;

public class Uni5Ex24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o limite diário de pesca (em kg): ");
        double limiteDiarioKg = scanner.nextDouble();

        double limiteDiarioGramas = limiteDiarioKg * 1000;

        double pesoTotalPesca = 0.0; 
        char continuar = 's';       

        while (continuar == 's' || continuar == 'S') {
            System.out.print("Digite o peso do peixe (em gramas): ");
            double pesoPeixe = scanner.nextDouble();

            pesoTotalPesca += pesoPeixe;

            System.out.printf("Peso total até agora: %.2f gramas%n", pesoTotalPesca);

            if (pesoTotalPesca > limiteDiarioGramas) {
                System.out.println("Limite diário de pesca excedido!");
                break;
            }

            System.out.print("Deseja informar o peso de mais um peixe: s (SIM) / n (NÃO)? ");
            continuar = scanner.next().charAt(0);
        }

        System.out.printf("Peso total da pesca: %.2f gramas%n", pesoTotalPesca);

        scanner.close();
    }
}
