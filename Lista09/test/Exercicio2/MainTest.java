package Exercicio2;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    
    
        @Test
    public void validarFuncionamento() {
    Cliente cliente = new Cliente("Vítor", "Rua Sabia");
    ContaBancaria conta = new ContaBancaria("123", 0, cliente);
    conta.depositar(1000, TipoMovimento.CREDITO);
    conta.sacar(250, TipoMovimento.DEBITO);
    
    ArrayList<Movimento> movimentos = conta.getMovimentos();

        assertEquals(2, movimentos.size());

        Movimento mov1 = movimentos.get(0);
        assertEquals(TipoMovimento.CREDITO, mov1.getTipo());
        assertEquals(1000, mov1.getValor(), 0.001); // tolerância para double

        Movimento mov2 = movimentos.get(1);
        assertEquals(TipoMovimento.DEBITO, mov2.getTipo());
        assertEquals(250, mov2.getValor(), 0.001);
}
    
}
