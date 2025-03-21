package lista03;

public class Funcionario {

    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
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

    public double calcularIrpf(double salario) {
        double imposto = 0;
        if (salario <= 1903.98) {
            imposto = 0;
        } else if (salario > 1903.98 && salario < 2826.65) {
            imposto = (2826.65 - 1903.98) * 0.075;
        } else if (salario > 2826.65 && salario <= 3751.06) {
            imposto = (2826.65 - 1903.98) * 0.075 + (salario - 2826.65) * 0.15;
        } else if(salario > 3751.06 && salario <= 4664.68){
            imposto = (2826.65 - 1903.98) * 0.075 + (3751.06 - 2826.65) * 0.15 + (salario - 3751.06) * 0.225;
        } else if(salario > 4664.68){
            imposto = (2826.65 - 1903.98) * 0.075 + (3751.06 - 2826.65) * 0.15 + (4664.68 - 3751.06) * 0.225 + (salario * 0.275);
        }
        return imposto;
    }
}
