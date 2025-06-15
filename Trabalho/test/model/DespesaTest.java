/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package model;

import java.time.LocalDate;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuário
 */
public class DespesaTest {

    public DespesaTest() {
    }

    @Test
    public void testCriacaoDespesa() {
        Despesa d = new Despesa("Aluguel", 1200.00, LocalDate.of(2025, 6, 1), Despesa.CategoriaDespesa.RESIDENCIA);
        assertEquals("Aluguel", d.getDescricao());
        assertEquals(1200.00, d.getValor(), 0.01);
        assertEquals(LocalDate.of(2025, 6, 1), d.getData());
        assertEquals("RESIDENCIA", d.getNomeCategoria());
    }

}
