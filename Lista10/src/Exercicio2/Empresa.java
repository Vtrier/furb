/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio2;

import java.util.ArrayList;

/**
 *
 * @author Usuário
 */
public class Empresa {

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the funcionarios
     */
    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }
    
    private String nome;
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();
    
    public Empresa(String nome){
        setNome(nome);
    }
    public void incluirFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }
    
    
    public void removerFuncionario(Funcionario funcionario){
        funcionarios.remove(funcionario);
    }
    
    public double calcularCustosSalario(){
        double totalCustos = 0;
        for (Funcionario funcionario : funcionarios) {
            totalCustos += funcionario.getSalarioBase();
        }
        return totalCustos;
    }
}
