package lista02;

public class App {

    public static void main(String[] args) {
        ContaBancaria conta01 = new ContaBancaria();
        ContaBancaria conta02 = new ContaBancaria();

        conta01.setNumero("01");
        conta01.setTitular("Vitor");
        
        conta02.setNumero("02");
        conta02.setTitular("Hugo");
        
        conta01.depositar(1000);
        conta01.depositar(700);
        
        conta02.depositar(5000);
        conta02.sacar(3000);
        
        conta02.tranferir(conta01, 1800);
        
        System.out.println(conta01.getTitular()+": "+conta01.getSaldo());
        System.out.println(conta02.getTitular()+": "+conta02.getSaldo());

       // System.out.println(conta.getNumero()+" "+conta.getTitular()+" "+conta.getSaldo());

    }

}
