/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Usuário
 */
public class Despesa extends Lancamento {
    public enum CategoriaDespesa {
        ALIMENTACAO, TRANSPORTE, RESIDENCIA, SAUDE, EDUCACAO, ENTRETENIMENTO, OUTRO
    }

    private CategoriaDespesa categoria;

    public Despesa(String descricao, double valor, LocalDate data, CategoriaDespesa categoria) {
        super(descricao, valor, data);
        this.categoria = categoria;
    }

    @Override
    public String getCategoria() {
        return categoria.name();
    }
    
    @Override
    public String toString() {
        return "Descrição: " + descricao + "\n"
                + "Tipo: " + categoria + "\n"
                + "Data: " + data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "\n"
                + "Valor: R$ " + String.format("%.2f", valor) + "\n"
                + "-------------------------\n";
    }
}
