public class Main {
    public static void main(String[] args) {
        Teclado teclado = new Teclado();

        int numero = teclado.lerInt("Digite um número inteiro: ");
        double numeroInteiro = teclado.lerDouble("Digite um número: ");
        boolean valorBooleano = teclado.lerBoolean("Digite uma opção (sim/não, verdadeiro/falso, s/n): ");
        String valorString = teclado.lerString("Digite uma String: ");

        System.out.println(numero);
        System.out.println(numeroInteiro);
        System.out.println(valorBooleano);
        System.out.println(valorString);
    }
}