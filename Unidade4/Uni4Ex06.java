import java.util.Scanner;

public class Uni4Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Qual o seu gênero? (M-masculino, F-Feminino, I-Não informado)");
        String genero = scanner.nextLine();
        genero = genero.toUpperCase();

        if (genero.equals("M")) {
            System.out.println("Masculino");
        }else if (genero.equals("F")) {
            System.out.println("Feminino");
        }else if (genero.equals("I")) {
            System.out.println("Não informado");
        }else
        System.out.println("Entrada incorreta ");
        
        scanner.close();
    }
}