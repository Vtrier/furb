package Exercicio;

public class Funcionario {

    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        if (salario < 0) {
            throw new IllegalArgumentException("ERRO: Salário não pode ser negativo");
        }
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario < 0) {
            throw new IllegalArgumentException("ERRO: Salário não pode ser negativo");
        }
        this.salario = salario;
    }

    public double calcularIrpf() {

        if (salario > 1903.98 && salario <= 2826.65) {
            return (salario - 1903.98) * 0.075;
        } else if (salario > 2826.65 && salario <= 3751.05) {
            return (2826.65 - 1903.98) * 0.075 + (salario - 2826.65) * 0.15;
        } else if (salario > 3751.05 && salario <= 4664.68) {
            return (2826.65 - 1903.98) * 0.075 + (3751.05 - 2826.65) * 0.15 + (salario - 3751.05) * 0.225;
        } else if (salario > 4664.68) {
            return (2826.65 - 1903.98) * 0.075 + (3751.05 - 2826.65) * 0.15 + (4664.68 - 3751.05) * 0.225 + (salario - 4664.68) * 0.275;
        } else {
            return 0;
        }
    }

    public FaixaIrpf identificarFaixaIrpf() {
        if (salario > 1903.98 && salario <= 2826.65) {
            return FaixaIrpf.SEGUNDA;
        } else if (salario > 2826.65 && salario <= 3751.05) {
            return FaixaIrpf.TERCEIRA;
        } else if (salario > 3751.05 && salario <= 4664.68) {
            return FaixaIrpf.QUARTA;
        } else if (salario > 4664.68) {
            return FaixaIrpf.QUINTA;
        } else {
            return FaixaIrpf.PRIMEIRA;
        }
    }
}
