/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio1;

import java.util.Comparator;

/**
 *
 * @author Usuário
 */
public class ComparadorPorMatricula implements Comparator<Aluno>{

    @Override
    public int compare(Aluno a1, Aluno a2) {
        return Integer.compare(a1.getMatricula(), a2.getMatricula());
    }
    
}
