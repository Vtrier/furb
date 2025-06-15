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
public class ReceitaTest {

    public ReceitaTest() {
    }

    @Test
    public void testCriacaoReceita() {
        Receita r = new Receita("Salário", 3000.00, LocalDate.of(2025, 6, 1), Receita.CategoriaReceita.SALARIO);
        assertEquals("Salário", r.getDescricao());
        assertEquals(3000.00, r.getValor(), 0.01);
        assertEquals(LocalDate.of(2025, 6, 1), r.getData());
        assertEquals("SALARIO", r.getNomeCategoria());
    }
}
