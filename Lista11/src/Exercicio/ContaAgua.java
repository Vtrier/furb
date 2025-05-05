/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio;

/**
 *
 * @author Usuário
 */
public class ContaAgua implements Pagavel{

    /**
     * @return the metrosCubicos
     */
    public int getMetrosCubicos() {
        return metrosCubicos;
    }

    /**
     * @param metrosCubicos the metrosCubicos to set
     */
    public void setMetrosCubicos(int metrosCubicos) {
        this.metrosCubicos = metrosCubicos;
    }

    /**
     * @return the precoMetroCubico
     */
    public double getPrecoMetroCubico() {
        return precoMetroCubico;
    }

    /**
     * @param precoMetroCubico the precoMetroCubico to set
     */
    public void setPrecoMetroCubico(double precoMetroCubico) {
        this.precoMetroCubico = precoMetroCubico;
    }
    private int metrosCubicos;
    private double precoMetroCubico;
    
    public ContaAgua(int metrosCubicos, double precoMetroCubico){
        setMetrosCubicos(metrosCubicos);
        setPrecoMetroCubico(precoMetroCubico);
    }

    @Override
    public double calcularValorPagar() {
        return metrosCubicos*precoMetroCubico;
    }
    
    
}
