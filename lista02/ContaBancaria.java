package lista02;

public class ContaBancaria {

    private static String numero;
    private String titular;
    private double saldo;
    
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void depositar(double dinheiro){
        if(dinheiro < 0){
            throw new IllegalArgumentException("Erro: Valor a ser depositado nao pode ser negativo");
        }
        saldo = saldo + dinheiro;
    }  
    
    public void sacar(double dinheiro){
        if(dinheiro < 0){
            throw new IllegalArgumentException("Erro: Valor a ser sacado nao pode ser negativo");
        }else if(dinheiro > saldo){
            throw new IllegalArgumentException("Erro: Valor a ser sacado ultrapassa o saldo da conta");
        }
        saldo = saldo - dinheiro;
    }  
    
    public void tranferir(ContaBancaria contaDestino,double valor){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
}
