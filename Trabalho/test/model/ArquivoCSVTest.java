/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package model;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuário
 */
public class ArquivoCSVTest {

    private final String arquivoReceita = "test_receitas.csv";
    private final Receita receita = new Receita("Salário", 2500.00, LocalDate.of(2025, 5, 20), Receita.CategoriaReceita.SALARIO);

    private final String arquivoDespesa = "test_despesas.csv";
    private final Despesa despesa = new Despesa("Aluguel", 1200.00, LocalDate.of(2025, 5, 15), Despesa.CategoriaDespesa.RESIDENCIA);

    @After
    public void limparArquivo() throws IOException {
        ArquivoCSV.apagarDados(arquivoReceita);
        ArquivoCSV.apagarDados(arquivoDespesa);
    }

    @Test
    public void testSalvarReceita() throws IOException {
        List<Receita> lista = List.of(receita);
        ArquivoCSV.salvarReceita(arquivoReceita, lista);
        File file = new File(arquivoReceita);
        assertTrue(file.exists() && file.length() > 0);
    }

    @Test
    public void testCarregarReceita() throws IOException {
        List<Receita> lista = List.of(receita);
        ArquivoCSV.salvarReceita(arquivoReceita, lista);

        List<Receita> carregada = ArquivoCSV.carregarReceitas(arquivoReceita);
        assertEquals(1, carregada.size());
        Receita r = carregada.get(0);
        assertEquals("Salário", r.getDescricao());
        assertEquals(2500.00, r.getValor(), 0.01);
        assertEquals(LocalDate.of(2025, 5, 20), r.getData());
        assertEquals(Receita.CategoriaReceita.SALARIO, r.getCategoria());
    }
    
    @Test
    public void testSalvarDespesa() throws IOException {
        List<Despesa> lista = List.of(despesa);
        ArquivoCSV.salvarDespesa(arquivoDespesa, lista);
        File file = new File(arquivoDespesa);
        assertTrue(file.exists() && file.length() > 0);
    }

    @Test
    public void testCarregarDespesa() throws IOException {
        List<Despesa> lista = List.of(despesa);
        ArquivoCSV.salvarDespesa(arquivoDespesa, lista);

        List<Despesa> carregada = ArquivoCSV.carregarDespesas(arquivoDespesa);
        assertEquals(1, carregada.size());
        Despesa d = carregada.get(0);
        assertEquals("Aluguel", d.getDescricao());
        assertEquals(1200.00, d.getValor(), 0.01);
        assertEquals(LocalDate.of(2025, 5, 15), d.getData());
        assertEquals(Despesa.CategoriaDespesa.RESIDENCIA, d.getCategoria());
    }
}
