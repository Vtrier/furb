/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.util.*;

/**
 *
 * @author Usuário
 */
public class GerenciadorFinanceiro {
    private List<Receita> receitas = new ArrayList<>();
    private List<Despesa> despesas = new ArrayList<>();

    public void adicionarReceita(Receita r) {
        receitas.add(r);
    }

    public void adicionarDespesa(Despesa d) {
        despesas.add(d);
    }

    public double getSaldoAte(LocalDate data) {
        double saldo = 0;
        for (Receita r : receitas)
            if (!r.getData().isAfter(data)) saldo += r.getValor();
        for (Despesa d : despesas)
            if (!d.getData().isAfter(data)) saldo -= d.getValor();
        return saldo;
    }

    public double getSaldoTotal() {
        return getSaldoAte(LocalDate.MAX);
    }

    public List<Lancamento> listarLancamentosOrdenados() {
        List<Lancamento> todos = new ArrayList<>();
        todos.addAll(receitas);
        todos.addAll(despesas);
        todos.sort(Comparator.comparing(Lancamento::getData));
        return todos;
    }

    public List<String> extratoComSaldo() {
        List<Lancamento> lancamentos = listarLancamentosOrdenados();
        List<String> extrato = new ArrayList<>();
        double saldo = 0;
        for (Lancamento l : lancamentos) {
            if (l instanceof Receita) {
                saldo += l.getValor();
            } else {
                saldo -= l.getValor();
            }
            extrato.add(String.format("%s - %s - R$ %.2f - Saldo: R$ %.2f\n",
                    l.getData(), l.getDescricao(),
                    (l instanceof Receita ? l.getValor() : -l.getValor()),
                    saldo));
        }
        return extrato;
    }

    public List<Receita> getReceitas() { return receitas; }
    public List<Despesa> getDespesas() { return despesas; }
}
