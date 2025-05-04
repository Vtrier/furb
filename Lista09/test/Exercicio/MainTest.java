/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Exercicio;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuário
 */
public class MainTest {
    
    public MainTest() {
    }

    @Test
    public void testarSacar() {
        Cliente cliente = new Cliente("Vitor", "Rua Sabia");
        ContaEspecial conta = new ContaEspecial(100, "123", 0, cliente);
        conta.depositar(20);
        conta.sacar(50);
        double resultado = conta.getSaldo();
        assertEquals(-30, resultado, 0.01);
    }
    
    @Test
    public void testarSacarSuperiorSaldo() {
        Cliente cliente = new Cliente("Vitor", "Rua Sabia");
        ContaEspecial conta = new ContaEspecial(100, "123", 0, cliente);
        conta.depositar(20);
        conta.sacar(120);
        double resultado = conta.getSaldo();
        assertEquals(-100, resultado, 0.01);
    }
    
    @Test
public void testarSacarAcimaLimite() {
    Cliente cliente = new Cliente("Vitor", "Rua Sabia");
    ContaEspecial conta = new ContaEspecial(100, "123", 0, cliente);
    conta.depositar(20);

    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
        conta.sacar(120.01);
    });

    String esperado = "Sem saldo";
    String resultado = exception.getMessage();

    assertEquals(esperado, resultado);
}
    
}
