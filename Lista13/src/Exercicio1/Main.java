package Exercicio1;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o caminho do diretório: ");
        String caminho = scanner.nextLine();

        File diretorio = new File(caminho);

        if (!diretorio.exists() || !diretorio.isDirectory()) {
            throw new IllegalArgumentException("Erro: O diretório informado não existe.");
        }

        long tamanhoTotalBytes = calcularTamanho(diretorio);
        double tamanhoEmMB = tamanhoTotalBytes / (1024.0 * 1024.0);

        System.out.printf("Tamanho total dos arquivos: %.2f MB%n", tamanhoEmMB);
    }

    public static long calcularTamanho(File arquivoOuDiretorio) {
        long tamanho = 0;

        if (arquivoOuDiretorio.isFile()) {
            return arquivoOuDiretorio.length();
        }

        File[] arquivos = arquivoOuDiretorio.listFiles();
        if (arquivos != null) {
            for (File f : arquivos) {
                tamanho += calcularTamanho(f);
            }
        }

        return tamanho;
    }
}