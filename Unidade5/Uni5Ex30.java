import java.util.Scanner;

public class Uni5Ex30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor de N: ");
        int N = scanner.nextInt();

        System.out.print("Informe o valor de K: ");
        int K = scanner.nextInt();

        System.out.print("Informe o tamanho da mochila M: ");
        int M = scanner.nextInt();

        String elementosDentroDaMochila = "";
        String elementosForaDaMochila = "";
        int somaDentro = 0;
        int somaFora = 0;
        int valorAtual = N;

        System.out.print("Elementos a serem colocados na mochila: ");

        while (valorAtual > 0) {
            System.out.print(valorAtual + " ");
            if (somaDentro + valorAtual <= M) {
                elementosDentroDaMochila += valorAtual + " ";
                somaDentro += valorAtual;
            } else {
                elementosForaDaMochila += valorAtual + " ";
                somaFora += valorAtual;
            }
            valorAtual -= K;
        }

        System.out.println("\nElementos que entraram na mochila: " + elementosDentroDaMochila);
        System.out.println("Elementos que ficaram fora da mochila: " + elementosForaDaMochila);
        System.out.println("Soma dos elementos que entraram na mochila: " + somaDentro);
        System.out.println("Soma dos elementos que ficaram fora da mochila: " + somaFora);

        scanner.close();
    }
}
