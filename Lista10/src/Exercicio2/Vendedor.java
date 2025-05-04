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
public class Vendedor extends Funcionario{

    /**
     * @return the vendas
     */
    public ArrayList<Venda> getVendas() {
        return vendas;
    }

    /**
     * @return the percentualComissao
     */
    public double getPercentualComissao() {
        return percentualComissao;
    }

    /**
     * @param percentualComissao the percentualComissao to set
     */
    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }
    private double percentualComissao;
    private ArrayList<Venda> vendas = new ArrayList<>();
    
    public Vendedor(String nome, double salarioBase, double percentualComissao){
        super(nome, salarioBase);
        setPercentualComissao(percentualComissao);
    }
    
    public void incluirVendas(Venda v){
        vendas.add(v);
    }
    
    @Override
    public double calcularSalario(){
        double totalValorVendas = 0;
        for (Venda venda : vendas) {
            totalValorVendas += venda.getValor();
        }
        
        return getSalarioBase() + totalValorVendas*percentualComissao;
    }
}
