/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio;

/**
 *
 * @author Usuário
 */
public class Main {
    public static void main(String[] args) {
        Contas contas = new Contas();
        
        contas.incluirConta(new ContaAgua(100, 2));
        contas.incluirConta(new MensalidadeEnsino(300, 5));
        PrevidenciaPrivada prev = new PrevidenciaPrivada();
        contas.incluirConta(prev);
        prev.setValor(100);
        prev.Investir();
        prev.Investir();
        
        System.out.println(contas.calcularTotalContas());
        System.out.println(contas);
        System.out.println(prev.calcularValorPagar());
        System.out.println(prev.getSaldo());
    }
}
