package Exercicio;

public class ContaBancaria {

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }
   private String numero;
   private double saldo;
   private Cliente titular;
   
   public ContaBancaria(String numero, double saldo, Cliente titular){
       setNumero(numero);
       setSaldo(saldo);
       setTitular(titular);
   }
   
   public void depositar(double valor){
       setSaldo(saldo+valor);
   }
   
   public void sacar(double valor){
       if(valor>saldo)
           throw new IllegalArgumentException("Sem saldo");
       setSaldo(saldo-valor);
   }
   
   public void transferir(ContaBancaria contaDestino, double valor){
       contaDestino.setSaldo(saldo+valor);
   }
}
