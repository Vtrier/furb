package lista03;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Funcionario funcionario1 = new Funcionario("A", 1000);
        Funcionario funcionario2 = new Funcionario("B", 1500);
        Funcionario funcionario3 = new Funcionario("C", 2000);
        Funcionario funcionario4 = new Funcionario("D", 2500);
        Funcionario funcionario5 = new Funcionario("E", 3000);
        
        Funcionario[] funcionarios = new Funcionario[5];
        
        funcionarios[0] = funcionario1;
        funcionarios[1] = funcionario2;
        funcionarios[2] = funcionario3;
        funcionarios[3] = funcionario4;
        funcionarios[4] = funcionario5;
        
        for (Funcionario funcionario : funcionarios) {
            System.out.printf("%s: Salario: %.2f, IRPF: %.2f%n", 
                              funcionario.getNome(), 
                              funcionario.getSalario(), 
                              funcionario.calcularIrpf(funcionario.getSalario()));
        }
    }
}