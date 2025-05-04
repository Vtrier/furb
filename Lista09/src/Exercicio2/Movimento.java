package Exercicio2;
import java.time.LocalDate;
import java.time.LocalTime;

public class Movimento {

    public double getValor() {
        return valor;
    }

    public TipoMovimento getTipo() {
        return tipo;
    }

    public LocalDate getData() {
        return data;
    }

    public LocalTime getHora() {
        return hora;
    }
    
    private double valor;
    private TipoMovimento tipo;
    private LocalDate data;
    private LocalTime hora;
    
    public Movimento(double valor, TipoMovimento tipo){
        this.valor = valor;
        this.tipo = tipo;
        this.data = data.now();
        this.hora = hora.now();
    }
}
