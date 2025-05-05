/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio;

/**
 *
 * @author Usuário
 */
public class Investimento implements Pagavel{

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    private double saldo;
    

    @Override
    public double calcularValorPagar() {
        return 0;
    }
    
}
