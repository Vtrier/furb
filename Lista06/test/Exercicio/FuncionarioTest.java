package Exercicio;

import org.junit.Test;
import static org.junit.Assert.*;

public class FuncionarioTest {

    @Test
    public void testar1Faixa() {
        var Funcionario = new Funcionario("Vitor", 850);
        FaixaIrpf resultado = Funcionario.identificarFaixaIrpf();
        assertEquals(FaixaIrpf.PRIMEIRA, resultado);
    }

    @Test
    public void testar1FaixaSalario() {
        var Funcionario = new Funcionario("Vitor", 850);
        double resultado = Funcionario.calcularIrpf();
        assertEquals(0, resultado, 0);
    }

    @Test
    public void testar1FaixaLimite() {
        var Funcionario = new Funcionario("Vitor", 1903.98);
        FaixaIrpf resultado = Funcionario.identificarFaixaIrpf();
        assertEquals(FaixaIrpf.PRIMEIRA, resultado);
    }

    @Test
    public void testar2Faixa() {
        var Funcionario = new Funcionario("Vitor", 1903.99);
        FaixaIrpf resultado = Funcionario.identificarFaixaIrpf();
        assertEquals(FaixaIrpf.SEGUNDA, resultado);
    }

    @Test
    public void testar2FaixaSalario() {
        var Funcionario = new Funcionario("Vitor", 1903.99);
        double resultado = Funcionario.calcularIrpf();
        assertEquals(0, resultado, 0.01);
    }

    @Test
    public void testar2Faixa2000() {
        var Funcionario = new Funcionario("Vitor", 2000);
        FaixaIrpf resultado = Funcionario.identificarFaixaIrpf();
        assertEquals(FaixaIrpf.SEGUNDA, resultado);
    }

    @Test
    public void testar2FaixaSalario2000() {
        var Funcionario = new Funcionario("Vitor", 2000);
        double resultado = Funcionario.calcularIrpf();
        assertEquals(7.2, resultado, 0.01);
    }

    @Test
    public void testar2FaixaLimite() {
        var Funcionario = new Funcionario("Vitor", 2826.65);
        FaixaIrpf resultado = Funcionario.identificarFaixaIrpf();
        assertEquals(FaixaIrpf.SEGUNDA, resultado);
    }

    @Test
    public void testar2FaixaSalarioLimite() {
        var Funcionario = new Funcionario("Vitor", 2826.65);
        double resultado = Funcionario.calcularIrpf();
        assertEquals(69.2, resultado, 0.01);
    }

    @Test
    public void testar3Faixa() {
        var Funcionario = new Funcionario("Vitor", 2826.66);
        FaixaIrpf resultado = Funcionario.identificarFaixaIrpf();
        assertEquals(FaixaIrpf.TERCEIRA, resultado);
    }

    @Test
    public void testar3FaixaSalario() {
        var Funcionario = new Funcionario("Vitor", 2826.66);
        double resultado = Funcionario.calcularIrpf();
        assertEquals(69.2, resultado, 0.01);
    }

    @Test
    public void testar3Faixa3000() {
        var Funcionario = new Funcionario("Vitor", 3000);
        FaixaIrpf resultado = Funcionario.identificarFaixaIrpf();
        assertEquals(FaixaIrpf.TERCEIRA, resultado);
    }

    @Test
    public void testar3FaixaSalario3000() {
        var Funcionario = new Funcionario("Vitor", 3000);
        double resultado = Funcionario.calcularIrpf();
        assertEquals(95.2, resultado, 0.01);
    }

    @Test
    public void testar3FaixaLimite() {
        var Funcionario = new Funcionario("Vitor", 3751.05);
        FaixaIrpf resultado = Funcionario.identificarFaixaIrpf();
        assertEquals(FaixaIrpf.TERCEIRA, resultado);
    }

    @Test
    public void testar3FaixaSalarioLimite() {
        var Funcionario = new Funcionario("Vitor", 3751.05);
        double resultado = Funcionario.calcularIrpf();
        assertEquals(207.86, resultado, 0.01);
    }

    @Test
    public void testar4Faixa() {
        var Funcionario = new Funcionario("Vitor", 3751.06);
        FaixaIrpf resultado = Funcionario.identificarFaixaIrpf();
        assertEquals(FaixaIrpf.QUARTA, resultado);
    }

    @Test
    public void testar4FaixaSalario() {
        var Funcionario = new Funcionario("Vitor", 3751.06);
        double resultado = Funcionario.calcularIrpf();
        assertEquals(207.86, resultado, 0.01);
    }

    @Test
    public void testar4Faixa4000() {
        var Funcionario = new Funcionario("Vitor", 4000);
        FaixaIrpf resultado = Funcionario.identificarFaixaIrpf();
        assertEquals(FaixaIrpf.QUARTA, resultado);
    }

    @Test
    public void testar4FaixaSalario4000() {
        var Funcionario = new Funcionario("Vitor", 4000);
        double resultado = Funcionario.calcularIrpf();
        assertEquals(263.87, resultado, 0.01);
    }

    @Test
    public void testar4FaixaLimite() {
        var Funcionario = new Funcionario("Vitor", 4664.68);
        FaixaIrpf resultado = Funcionario.identificarFaixaIrpf();
        assertEquals(FaixaIrpf.QUARTA, resultado);
    }

    @Test
    public void testar4FaixaSalarioLimite() {
        var Funcionario = new Funcionario("Vitor", 4664.68);
        double resultado = Funcionario.calcularIrpf();
        assertEquals(413.42, resultado, 0.01);
    }

    @Test
    public void testar5Faixa() {
        var Funcionario = new Funcionario("Vitor", 4664.69);
        FaixaIrpf resultado = Funcionario.identificarFaixaIrpf();
        assertEquals(FaixaIrpf.QUINTA, resultado);
    }

    @Test
    public void testar5FaixaSalario() {
        var Funcionario = new Funcionario("Vitor", 4664.69);
        double resultado = Funcionario.calcularIrpf();
        assertEquals(413.42, resultado, 0.01);
    }

    @Test
    public void testar5Faixa5000() {
        var Funcionario = new Funcionario("Vitor", 5000);
        FaixaIrpf resultado = Funcionario.identificarFaixaIrpf();
        assertEquals(FaixaIrpf.QUINTA, resultado);
    }

    @Test
    public void testar5FaixaSalario5000() {
        var Funcionario = new Funcionario("Vitor", 5000);
        double resultado = Funcionario.calcularIrpf();
        assertEquals(505.64, resultado, 0.01);
    }

    @Test
    public void testarExcecaoNumeroNegativo() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Funcionario funcionario = new Funcionario("Vitor", -12);});
        
            
        String esperado = "ERRO: Salário não pode ser negativo";
        String resultado = exception.getMessage();

        assertEquals(esperado, resultado);
    }

}
