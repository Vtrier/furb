
public class Uni5Ex04 {

    public static void main(String[] args) {
        int i;
        double soma = 0;
        double n1 = 1;
        double n2 = 0;
        for (i = 1; i <= 20; i++) {
            n1 += 2;
            n2 += (i*2.0);
            soma += n1/n2;
        }
        System.out.println(soma);
    }
}
