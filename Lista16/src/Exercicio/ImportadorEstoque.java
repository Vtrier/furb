/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Usuário
 */
public class ImportadorEstoque {

    private HashMap<Produto, Integer> estoque = new HashMap<>();
    private File arquivo = new File("C:\\Users\\Usuário\\OneDrive\\Documentos\\NetBeansProjects\\Lista16\\src\\Exercicio\\L16_Estoque.csv");

    public File getArquivo() {
        return arquivo;
    }

    public void setArquivo(File arquivo) {
        this.arquivo = arquivo;
    }

    public HashMap<Produto, Integer> getEstoque() {
        return estoque;
    }

    public ImportadorEstoque() {

    }

    public void processarArquivo() throws FileNotFoundException {
        Scanner scanner = new Scanner(arquivo);
        int quantidade = 0;
        int quantidadeAntiga = 0;
        Produto produto = new Produto("", 0);

        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }

        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();
            String[] colunas = linha.split(";");
            quantidade = Integer.parseInt(colunas[2]);
            if (!colunas[0].equals(produto.getNome())) {
                quantidadeAntiga = 0;
                produto = new Produto(colunas[0], Double.parseDouble(colunas[1]));
                estoque.put(produto, Integer.valueOf(colunas[2]));
                quantidadeAntiga = Integer.valueOf(colunas[2]);
           } else {
                estoque.put(produto, quantidade+quantidadeAntiga);
                quantidadeAntiga += quantidade;
            }
        }
        for (Iterator<Produto> it = estoque.keySet().iterator(); it.hasNext();) {
            produto = it.next();
            System.out.println("Produto: " + produto.getNome() + " - Valor: " + produto.getValor() + " - Quantidade: " + estoque.get(produto));
        }
    }

}
