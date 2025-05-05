/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio;

/**
 *
 * @author Usuário
 */
public class MensalidadeEnsino implements Pagavel{

    /**
     * @return the nrCreditos
     */
    public int getNrCreditos() {
        return nrCreditos;
    }

    /**
     * @param nrCreditos the nrCreditos to set
     */
    public void setNrCreditos(int nrCreditos) {
        this.nrCreditos = nrCreditos;
    }

    /**
     * @return the precoCredito
     */
    public double getPrecoCredito() {
        return precoCredito;
    }

    /**
     * @param precoCredito the precoCredito to set
     */
    public void setPrecoCredito(double precoCredito) {
        this.precoCredito = precoCredito;
    }
    private int nrCreditos;
    private double precoCredito;
    
    public MensalidadeEnsino(int nrCreditos, double precoCredito){
        setNrCreditos(nrCreditos);
        setPrecoCredito(precoCredito);
    }

    @Override
    public double calcularValorPagar() {
        return nrCreditos * precoCredito;
    }
}
