/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio2;

/**
 *
 * @author Usuário
 */
public class Main {

    public static void main(String[] args) {
        Empresa empresa = new Empresa("EA");

        Vendedor luiz = new Vendedor("Luiz", 1000, 0.1);
        luiz.incluirVendas(new Venda(200));
        luiz.incluirVendas(new Venda(100));

        Vendedor paula = new Vendedor("Paula", 1200, 0.07);
        paula.incluirVendas(new Venda(500));
        paula.incluirVendas(new Venda(350));
        paula.incluirVendas(new Venda(280));

        Programador julio = new Programador("Julio", 1000);
        julio.incluirLinguagem("C");
        julio.incluirLinguagem("Java");

        Programador ana = new Programador("Ana", 1000);
        ana.incluirLinguagem("Java");
        ana.incluirLinguagem("C#");

        Programador anderson = new Programador("Anderson", 1200);
        anderson.incluirLinguagem("Phyton");

        Funcionario jose = new Funcionario("José", 1000);
        Funcionario maria = new Funcionario("Maria", 1400);

        empresa.incluirFuncionario(luiz);
        empresa.incluirFuncionario(paula);
        empresa.incluirFuncionario(julio);
        empresa.incluirFuncionario(ana);
        empresa.incluirFuncionario(anderson);
        empresa.incluirFuncionario(jose);
        empresa.incluirFuncionario(maria);

        System.out.println(empresa.calcularCustosSalario());
        for (Funcionario funcionario : empresa.getFuncionarios()) {
            System.out.println("Nome: " + funcionario.getNome() + " Salario: " + funcionario.calcularSalario());
        }

        System.out.println("\n-------------------------------\nVendedores:\n");
        for (Funcionario f : empresa.getFuncionarios()) {
            if (f instanceof Vendedor) {
                Vendedor vendedor = (Vendedor) f;
                System.out.println("Vendedor: " + vendedor.getNome() + " | Comissao: " + vendedor.getPercentualComissao());
            }
        }
        System.out.println("\n-------------------------------\nProgramadores:\n");
        for (Funcionario f : empresa.getFuncionarios()) {
            if (f instanceof Programador){
                Programador programador = (Programador) f;
                System.out.println("Nome: " + programador.getNome() + " Linguagens: " + programador.getLinguagens());
            }
        }
    }
}
