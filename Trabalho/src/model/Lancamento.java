package model;

import java.time.LocalDate;

/**
 * Classe abstrata que representa um lançamento financeiro.
 * Pode ser uma Receita ou uma Despesa.
 * @author Vítor Hugo Trierveiler e João Bernardo Porto
 */
public abstract class Lancamento implements Comparable<Lancamento>{
    protected String descricao;
    protected double valor;
    protected LocalDate data;

    public Lancamento() {
        
    }
    
    /**
     * Retorna o nome da categoria do lançamento.
     * @return nome da categoria.
     */
    public abstract String getNomeCategoria();

    public String getDescricao() {
        return descricao; 
    }
    
    public double getValor() {
        return valor; 
    }
    
    public LocalDate getData() {
        return data; 
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
    
    /**
     * Compara este lançamento com outro baseado na data.
     * @param outro lançamento a ser comparado
     * @return valor negativo, zero ou positivo
     */
    @Override
    public int compareTo(Lancamento outro) {
        return this.data.compareTo(outro.data);
    }
}
