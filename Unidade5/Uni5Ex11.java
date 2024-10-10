public class Uni5Ex11 {
    public static void main(String[] args) {
        int biscoitosQuebrados = 1; 

        for (int hora = 1; hora <= 16; hora++) {
            biscoitosQuebrados *= 3; 
            if (hora == 2) {
                biscoitosQuebrados = 4;
            }
        }

        System.out.println("Total de biscoitos quebrados ao final do dia: " + biscoitosQuebrados);
    }
}
