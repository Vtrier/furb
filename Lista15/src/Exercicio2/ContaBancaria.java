package Exercicio2;

import java.util.ArrayList;
import java.util.Collections;

public class ContaBancaria {

    public ArrayList<Movimento> getMovimentos() {
        return movimentos;
    }

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
   private ArrayList<Movimento> movimentos = new ArrayList<>();
   
   public ContaBancaria(String numero, double saldo, Cliente titular){
       setNumero(numero);
       setSaldo(saldo);
       setTitular(titular);
       this.movimentos = new ArrayList<>();
   }
   
   public void depositar(double valor, TipoMovimento tipo){
       setSaldo(saldo+valor);
       movimentos.add(new Movimento(valor, tipo));
   }
   
   public void sacar(double valor, TipoMovimento tipo){
       if(valor>saldo)
           throw new IllegalArgumentException("Sem saldo");
       setSaldo(saldo-valor);
       movimentos.add(new Movimento(valor, tipo));
   }
   
   public void transferir(ContaBancaria contaDestino, double valor){
       contaDestino.setSaldo(saldo+valor);
       movimentos.add(new Movimento(valor, TipoMovimento.DEBITO));
   }
   
   public void ordenaMovimentosHoraDecrescente(){
       Collections.sort(movimentos, new OrdenaMovimentos().reversed());
   }
}
