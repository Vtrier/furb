/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio;

/**
 *
 * @author Usuário
 */
public class Bairro {

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCoeficienteIptu() {
        return coeficienteIptu;
    }

    public void setCoeficienteIptu(double coeficienteIptu) {
        this.coeficienteIptu = coeficienteIptu;
    }
    private String nome;
    private double coeficienteIptu;
    
    public Bairro(String nome, double coeficienteIptu){
        setNome(nome);
        if(coeficienteIptu < 0){
            throw new IllegalArgumentException("Valor não permitido");
        }
        setCoeficienteIptu(coeficienteIptu);
    }
}
