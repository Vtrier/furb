public class Uni4Ex02 {

    public static void main(String[] args) {
        int i;
        int somaPar = 0;
        int somaImpar = 0;

        for (i = 1; i < 101; i++) {
            if (i % 2 == 0) {
                somaPar += i;
            } else {
                somaImpar += i;
            }
        }
        System.out.println("Soma dos numeros pares: " + somaPar);
        System.out.println("Soma dos números ímpares:  " + somaImpar);
    }
}
