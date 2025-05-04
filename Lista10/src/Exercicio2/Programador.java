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
public class Programador extends Funcionario {

    /**
     * @return the linguagens
     */
    public ArrayList<String> getLinguagens() {
        return linguagens;
    }
    private ArrayList<String> linguagens = new ArrayList<>();

    public Programador(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    public void incluirLinguagem(String linguagem) {
        linguagens.add(linguagem);
    }

    public void removerLinguagem(String linguagem) {
        linguagens.remove(linguagem);
    }

    public double calcularSalario() {
        if (linguagens.contains("Java")) {
            return getSalarioBase() * 1.20;
        } else {
            return getSalarioBase();
        }
    }
}
