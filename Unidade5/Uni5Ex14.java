import java.util.Scanner;

public class Uni5Ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int menorQue10 = 0, entre10e20 = 0, maiorQue20 = 0;
        double totalCompra = 0, totalVenda = 0;
        
        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o nome da mercadoria " + (i + 1) + ": ");
            String nome = scanner.next();
            
            System.out.print("Digite o preço de compra (PC) da mercadoria " + nome + ": ");
            double precoCompra = scanner.nextDouble();
            
            System.out.print("Digite o preço de venda (PV) da mercadoria " + nome + ": ");
            double precoVenda = scanner.nextDouble();
            
            double lucroPercentual = (precoVenda - precoCompra) / precoCompra * 100;
            
            if (lucroPercentual < 10) {
                menorQue10++;
            } else if (lucroPercentual <= 20) {
                entre10e20++;
            } else {
                maiorQue20++;
            }
                        totalCompra += precoCompra;
            totalVenda += precoVenda;
        }
        
        double lucroTotal = totalVenda - totalCompra;
        
        System.out.println("Quantidade de mercadorias com lucro < 10%: " + menorQue10);
        System.out.println("Quantidade de mercadorias com 10% <= lucro <= 20%: " + entre10e20);
        System.out.println("Quantidade de mercadorias com lucro > 20%: " + maiorQue20);
        System.out.printf("Valor total de compra: R$ %.2f\n", totalCompra);
        System.out.printf("Valor total de venda: R$ %.2f\n", totalVenda);
        System.out.printf("Lucro total: R$ %.2f\n", lucroTotal);
        
        scanner.close();
    }
}
