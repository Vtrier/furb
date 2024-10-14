import java.util.Scanner;

public class Uni5Ex25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pontosDireita = 0;
        int pontosEsquerda = 0;
        char ponto;

        while (true) {
            System.out.print("Digite o ponto (D para direita, E para esquerda): ");
            ponto = scanner.next().charAt(0);

            if (ponto == 'D' || ponto == 'd') {
                pontosDireita++;
            } else if (ponto == 'E' || ponto == 'e') {
                pontosEsquerda++;
            } else {
                System.out.println("Código inválido! Use 'D' para direita ou 'E' para esquerda.");
                continue; 
            }

            System.out.printf("Pontuação: Direita %d - Esquerda %d%n", pontosDireita, pontosEsquerda);

            if ((pontosDireita >= 21 && (pontosDireita - pontosEsquerda) >= 2) ||
                (pontosDireita > 21 && (pontosDireita - pontosEsquerda) >= 2)) {
                System.out.println("Jogador da direita venceu!");
                break;
            } else if ((pontosEsquerda >= 21 && (pontosEsquerda - pontosDireita) >= 2) ||
                       (pontosEsquerda > 21 && (pontosEsquerda - pontosDireita) >= 2)) {
                System.out.println("Jogador da esquerda venceu!");
                break;
            }
        }

        scanner.close();
    }
}
