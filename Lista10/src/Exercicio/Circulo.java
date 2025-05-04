/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio;

/**
 *
 * @author Usuário
 */
public class Circulo extends Figura{

    /**
     * @return the raio
     */
    public int getRaio() {
        return raio;
    }

    /**
     * @param raio the raio to set
     */
    public void setRaio(int raio) {
        this.raio = raio;
    }
    private int raio;
    
    public Circulo(int raio){
        setRaio(raio);
    }
    
    @Override
    public double calcularArea(){
        return Math.PI * (raio*raio);
    }
}
