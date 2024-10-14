import java.util.Scanner;

public class Uni5Ex19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double totalRecebido = 0;
        
        while (true) {
            System.out.print("Digite o valor da compra (ou 0 para encerrar): ");
            double valorCompra = scanner.nextDouble();
            
            if (valorCompra == 0) {
                break;
            }
            
            double desconto;
            if (valorCompra > 500) {
                desconto = 0.20 * valorCompra; 
            } else {
                desconto = 0.15 * valorCompra;
            }
            
            double totalAPagar = valorCompra - desconto;
            totalRecebido += totalAPagar;
            
            System.out.printf("Total a pagar: R$ %.2f\n", totalAPagar);
        }
        
        System.out.printf("Total recebido pela loja ao final do dia: R$ %.2f\n", totalRecebido);
        
        scanner.close();
    }
}
