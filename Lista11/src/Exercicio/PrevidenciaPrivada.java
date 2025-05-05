/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio;

/**
 *
 * @author Usuário
 */
public class PrevidenciaPrivada extends Investimento implements Pagavel{

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }
    private double valor;
    
    @Override
    public double calcularValorPagar(){
        return valor * 1.05;
    }
    
    public void Investir(){
        double novoSaldo = getSaldo() + valor;
        setSaldo(novoSaldo);
    }
    
}
