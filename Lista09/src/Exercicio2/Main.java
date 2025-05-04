package Exercicio2;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Vítor", "Rua Sabia");
        ContaBancaria conta = new ContaBancaria("1", 1000, cliente);
        
        conta.depositar(100);
        System.out.println(conta.getSaldo());
        System.out.println(conta.getMovimentos(conta));
    }
}
