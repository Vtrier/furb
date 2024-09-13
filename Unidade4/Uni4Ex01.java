import java.util.Scanner;

public class Uni4Ex01 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Jornada de trabalho semanal: ");
        int jornada = teclado.nextInt();

        System.out.println("Valor por hora: ");
        double valor = teclado.nextDouble();

        if (jornada > 40) {
            int horaExtra = jornada - 40;
            double salario = (valor * 1.5 *horaExtra + 40*valor)*4;
            System.out.println("Salário: " + salario);
        }else{
            double salario = valor * jornada * 4;
            System.out.println("Salário: " + salario);
        }
        
        teclado.close();
    }
}