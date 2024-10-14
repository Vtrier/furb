
public class Uni5Ex22 {
    public static void main(String[] args) {
        double salario = 2000.00; 
        double aumento = 0.015;   
        
        int anoAtual = 2024; 

        for (int ano = 1996; ano <= anoAtual; ano++) {
            salario += salario * aumento; 
            aumento *= 2;                 
        }

        System.out.printf("O salário atual do funcionário é: R$ %.2f%n", salario);
    }
}
