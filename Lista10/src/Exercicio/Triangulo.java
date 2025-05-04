/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio;

/**
 *
 * @author Usuário
 */
public class Triangulo extends Figura{

    /**
     * @return the lado1
     */
    public int getLado1() {
        return lado1;
    }

    /**
     * @param lado1 the lado1 to set
     */
    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    /**
     * @return the lado2
     */
    public int getLado2() {
        return lado2;
    }

    /**
     * @param lado2 the lado2 to set
     */
    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    /**
     * @return the lado3
     */
    public int getLado3() {
        return lado3;
    }

    /**
     * @param lado3 the lado3 to set
     */
    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }
    private int lado1;
    private int lado2;
    private int lado3;
    
    public Triangulo(int lado1, int lado2, int lado3){
        setLado1(lado1);
        setLado2(lado2);
        setLado3(lado3);
    }
    
    @Override
    public double calcularArea(){
        double s = (lado1 + lado2 + lado3) / 2.0;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }
}
