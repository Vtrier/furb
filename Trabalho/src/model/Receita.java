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
public class Receita extends Lancamento {

    public enum CategoriaReceita {
        SALARIO, DECIMO_TERCEIRO, FERIAS, OUTRO
    }

    private CategoriaReceita categoria;

    public Receita(String descricao, double valor, LocalDate data, CategoriaReceita categoria) {
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
