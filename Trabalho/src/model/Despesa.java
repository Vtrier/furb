package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Representa uma despesa financeira com categoria específica.
 * @author Vítor Hugo Trierveiler e João Bernardo Porto
 */
public class Despesa extends Lancamento {

    /**
     * Enumeração das categorias de despesa.
     */
    public enum CategoriaDespesa {
        ALIMENTACAO, TRANSPORTE, RESIDENCIA, SAUDE, EDUCACAO, ENTRETENIMENTO, OUTRO
    }

    public CategoriaDespesa getCategoria() {
        return categoria;
    }
    
    @Override
    public String getNomeCategoria() {
        return categoria.toString();
    }
    
    public void setCategoria(CategoriaDespesa categoria){
        this.categoria = categoria;
    }
    
    private CategoriaDespesa categoria;
    
    /**
     * Construtor para Despesa.
     * @param descricao Descrição da despesa
     * @param valor Valor da despesa
     * @param data Data da despesa
     * @param categoria Categoria da despesa
     */
    public Despesa(String descricao, double valor, LocalDate data, CategoriaDespesa categoria) {
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
