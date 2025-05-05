/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio;


import java.util.ArrayList;

/**
 *
 * @author Usuário
 */
public class Contas {

    /**
     * @return the contas
     */
    public ArrayList<Pagavel> getContas() {
        return contas;
    }
    private ArrayList<Pagavel> contas = new ArrayList<>();
    
    public void incluirConta(Pagavel conta){
        contas.add(conta);
    }
    
    public double calcularTotalContas(){
        double totalContas = 0;
        for (Pagavel conta : contas) {
            totalContas += conta.calcularValorPagar();
        }
        return totalContas;
    }
}
