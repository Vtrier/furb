package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 * Classe que gerencia receitas e despesas do sistema financeiro.
 * @author Vítor Hugo Trierveiler e João Bernardo Porto
 */
public class GerenciadorFinanceiro {

    private final List<Receita> receitas = new ArrayList<>();
    private final List<Despesa> despesas = new ArrayList<>();

    /**
     * Adiciona uma receita.
     * @param r Receita a ser adicionada
     */
    public void adicionarReceita(Receita r) {
        receitas.add(r);
    }

    /**
     * Adiciona uma despesa.
     * @param d Despesa a ser adicionada
     */
    public void adicionarDespesa(Despesa d) {
        despesas.add(d);
    }

    /**
     * Calcula o saldo disponível na data de hoje.
     * @param data Data limite(hoje)
     * @return Saldo disponível até a data de hoje
     */
    public double getSaldoAtual(LocalDate data) {
        double saldo = 0;
        for (Receita r : receitas) {
            if (!r.getData().isAfter(data)) {
                saldo += r.getValor();
            }
        }
        for (Despesa d : despesas) {
            if (!d.getData().isAfter(data)) {
                saldo -= d.getValor();
            }
        }
        return saldo;
    }

    /**
     * Retorna o saldo total (considerando todos os lançamentos).
     * @return Saldo total
     */
    public double getSaldoTotal() {
        return getSaldoAtual(LocalDate.MAX);
    }

    /**
     * Retorna todos os lançamentos ordenados por data.
     * @return Lista de lançamentos
     */
    public List<Lancamento> listarLancamentosOrdenados() {
        List<Lancamento> todos = new ArrayList<>();
        todos.addAll(receitas);
        todos.addAll(despesas);
        Collections.sort(todos);
        return todos;
    }

    /**
     * Gera uma lista de extrato detalhado com o saldo acumulado.
     * @return Lista com o extrato e saldo após cada lançamento
     */
    public List<String> verLancamentos() {
        List<Lancamento> lancamentos = listarLancamentosOrdenados();
        List<String> extrato = new ArrayList<>();
        double saldo = 0;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        for (Lancamento l : lancamentos) {
            double valor = l.getValor();
            String tipo;
            if (l instanceof Receita) {
                tipo = "Receita";
            } else {
                tipo = "Despesa";
            }

            if (l instanceof Receita) {
                saldo += valor;
            } else {
                saldo -= valor;
            }

            extrato.add(String.format(
                    "Tipo: %s\nDescrição: %s\nValor: R$ %.2f\nCategoria: %s\nData: %s\nSaldo após: R$ %.2f",
                    tipo,
                    l.getDescricao(),
                    valor,
                    l.getNomeCategoria(),
                    l.getData().format(formatter),
                    saldo
            ));
            extrato.add("--------------------------------------------------");
        }
        return extrato;
    }

    public List<Receita> getReceitas() {
        return receitas;
    }

    public List<Despesa> getDespesas() {
        return despesas;
    }
}
