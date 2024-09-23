
import java.util.Random;

public class Uni4Ex01 {

    public static void main(String[] args) {
        Random gerador = new Random();
        int i;

        for (i = 0; i < 20; i++) {
            int num = gerador.nextInt(1001);
            
            if (num  % 2 == 0) {
                System.out.println(num + " é par");
            }else{
                System.out.println(num + " é impar");
            }
        }
    }
}
