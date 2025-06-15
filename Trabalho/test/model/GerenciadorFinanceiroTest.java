/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuário
 */
public class GerenciadorFinanceiroTest {

    public GerenciadorFinanceiroTest() {
    }

    @Test
    public void testAdicionarReceita() {
        GerenciadorFinanceiro g = new GerenciadorFinanceiro();
        Receita r = new Receita("Tigrinho", 500.00, LocalDate.now(), Receita.CategoriaReceita.OUTRO);
        g.adicionarReceita(r);
        assertTrue(g.getReceitas().contains(r));
    }

    @Test
    public void testAdicionarDespesa() {
        GerenciadorFinanceiro g = new GerenciadorFinanceiro();
        Despesa d = new Despesa("Cinema", 50.00, LocalDate.now(), Despesa.CategoriaDespesa.ENTRETENIMENTO);
        g.adicionarDespesa(d);
        assertTrue(g.getDespesas().contains(d));
    }

    @Test
    public void testGetSaldoAtual() {
        GerenciadorFinanceiro g = new GerenciadorFinanceiro();
        g.adicionarReceita(new Receita("Salário", 2000, LocalDate.of(2025, 1, 1), Receita.CategoriaReceita.SALARIO));
        g.adicionarDespesa(new Despesa("Conta de Luz", 200, LocalDate.of(2025, 1, 2), Despesa.CategoriaDespesa.RESIDENCIA));
        assertEquals(1800, g.getSaldoAtual(LocalDate.now()), 0.01);
    }

    @Test
    public void testListarLancamentosOrdenados() {
        GerenciadorFinanceiro g = new GerenciadorFinanceiro();
        Receita r = new Receita("Salário", 1000, LocalDate.of(2025, 5, 10), Receita.CategoriaReceita.SALARIO);
        Despesa d = new Despesa("Mercado", 200, LocalDate.of(2025, 5, 1), Despesa.CategoriaDespesa.ALIMENTACAO);
        g.adicionarReceita(r);
        g.adicionarDespesa(d);

        List<Lancamento> ordenados = g.listarLancamentosOrdenados();
        assertEquals(d, ordenados.get(0));
        assertEquals(r, ordenados.get(1));
    }

    @Test
    public void testVerLancamentos() {
        GerenciadorFinanceiro g = new GerenciadorFinanceiro();

        Receita r = new Receita("Projeto", 800.00, LocalDate.of(2025, 6, 2), Receita.CategoriaReceita.OUTRO);
        Despesa d = new Despesa("Padaria", 100.00, LocalDate.of(2025, 6, 1), Despesa.CategoriaDespesa.ALIMENTACAO);

        g.adicionarReceita(r);
        g.adicionarDespesa(d);

        List<String> extrato = g.verLancamentos();

        String primeiroLancamento = extrato.get(0);
        String segundoLancamento = extrato.get(2);

        assertTrue(primeiroLancamento.contains("Tipo: Despesa"));
        assertTrue(segundoLancamento.contains("Tipo: Receita"));
    }
}
