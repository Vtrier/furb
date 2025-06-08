package Exercicio2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Cliente cliente1 = new Cliente("Vítor", "Rua Sabia");
        Cliente cliente2 = new Cliente("Rubens", "Rua Canario");
        ContaBancaria conta1 = new ContaBancaria("1", 1000, cliente1);
        ContaBancaria conta2 = new ContaBancaria("2", 5000, cliente2);
        
        conta1.depositar(500, TipoMovimento.DEBITO);
        Thread.sleep(1000);
        conta2.transferir(conta1, 200);
        Thread.sleep(1000);
        conta2.sacar(1000, TipoMovimento.CREDITO);
        Thread.sleep(1000);
        conta2.depositar(10000, TipoMovimento.DEBITO);
        Thread.sleep(1000);
        conta2.sacar(5000, TipoMovimento.CREDITO);
        
        for (Movimento movimento : conta2.getMovimentos()) {
            System.out.println(movimento.getValor() + " Hora: " + movimento.getHora());
        }
        
        conta2.ordenaMovimentosHoraDecrescente();
        
        System.out.println("---------------------\nORDEM DECRESCENTE:");
        
        for (Movimento movimento : conta2.getMovimentos()) {
            System.out.println(movimento.getValor() + " Hora: " + movimento.getHora());
        }
    }
}
