package lista02ex01;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Pessoa p3 = new Pessoa();
        
        System.out.println("Nome: ");
        p1.setNome(teclado.nextLine());
        System.out.println("Altura: ");
        p1.setAltura(teclado.nextDouble());
        System.out.println("Peso: ");
        p1.setPeso(teclado.nextDouble());
        System.out.println(p1.getNome() + " IMC: " + );
        
    }
    
}
