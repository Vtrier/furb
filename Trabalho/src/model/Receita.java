package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Representa uma receita financeira com categoria específica.
 *
 * @author Vítor Hugo Trierveiler e João Bernardo Porto
 */
public class Receita extends Lancamento {

    /**
     * Enumeração das categorias de receita.
     */
    public enum CategoriaReceita {
        SALARIO, DECIMO_TERCEIRO, FERIAS, OUTRO
    }

    @Override
    public String getNomeCategoria() {
        return categoria.toString();
    }

    public CategoriaReceita getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaReceita categoria) {
        this.categoria = categoria;
    }

    private CategoriaReceita categoria;

    /**
     * Construtor para Receita.
     *
     * @param descricao Descrição da receita
     * @param valor Valor da receita
     * @param data Data da receita
     * @param categoria Categoria da receita
     */
    public Receita(String descricao, double valor, LocalDate data, CategoriaReceita categoria) {
        setDescricao(descricao);
        setValor(valor);
        setData(data);
        setCategoria(categoria);
    }

    /**
     * Metodo toString sobrescrito para retornar texto ja formatado.
     */
    @Override
    public String toString() {
        return "Descrição: " + descricao + "\n"
                + "Tipo: " + categoria + "\n"
                + "Data: " + data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "\n"
                + "Valor: R$ " + String.format("%.2f", valor) + "\n"
                + "-------------------------\n";
    }
}
