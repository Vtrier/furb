package Exercicio;

public class ContaEspecial extends ContaBancaria {

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }
    private double limiteCredito;
    
    public ContaEspecial(double limiteCredito, String numero, double saldo, Cliente titular){
        super(numero, saldo, titular);
        setLimiteCredito(limiteCredito);
    }
    
    @Override
    public void sacar(double valor){
        if(valor>getSaldo()+limiteCredito)
            throw new IllegalArgumentException("Sem saldo");
        setSaldo(getSaldo()- valor);
    }
}
