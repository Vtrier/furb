public class Uni5Ex21 {
    public static void main(String[] args) {
        double alturaChico = 1.50; 
        double alturaZe = 1.10;    
        
        double crescimentoChico = 0.02;
        double crescimentoZe = 0.03;   
        
        int anos = 0;
        
        while (alturaZe <= alturaChico) {
            alturaChico += crescimentoChico;
            alturaZe += crescimentoZe;
            anos++;
        }
        
        System.out.println("Serão necessários " + anos + " anos para que Zé seja maior que Chico.");
    }
}
