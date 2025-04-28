package Exercicio;

import org.junit.Test;
import static org.junit.Assert.*;


public class ImovelTest {

    @Test
    public void testarAreaNegativa() {
        Bairro bairro = new Bairro("Garcia", 1.5);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Imovel imovel = new Imovel("aaa", -5, bairro, Finalidade.RESIDENCIAL);});
        
            
        String esperado = "Valor não permitido";
        String resultado = exception.getMessage();

        assertEquals(esperado, resultado);
    }
    
    @Test
    public void testarResidencial() {
        Bairro bairro = new Bairro("Garcia", 1);
        Imovel imovel = new Imovel("aaa", 50 , bairro, Finalidade.RESIDENCIAL);
        double resultado = imovel.calcularIptu();
        assertEquals(50, resultado, 0.01);
    }
    
    @Test
    public void testarComercial100() {
        Bairro bairro = new Bairro("Garcia", 1);
        Imovel imovel = new Imovel("aaa", 80 , bairro, Finalidade.COMERCIAL);
        double resultado = imovel.calcularIptu();
        assertEquals(500, resultado, 0.01);
    }
    
}
