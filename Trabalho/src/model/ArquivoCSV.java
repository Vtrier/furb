package model;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 * Classe utilitária para salvar, carregar e apagar dados financeiros em um arquivo CSV.
 * @author Vítor Hugo Trierveiler e João Bernardo Porto
 */
public class ArquivoCSV {

    public static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    /**
     * Salva uma lista de despesas no arquivo CSV.
     * @param arquivo Caminho do arquivo
     * @param listaDespesa Lista de despesas
     * @throws java.io.IOException
     */
    public static void salvarDespesa(String arquivo, List<Despesa> listaDespesa) throws IOException {
        try (PrintWriter pw = new PrintWriter(new FileWriter(arquivo))) {

            for (Despesa d : listaDespesa) {
                String data = d.getData().format(formatter);
                pw.printf(Locale.US, "%s;%.2f;%s;%s\n", d.getDescricao(), d.getValor(), data, d.getNomeCategoria());
            }
            pw.close();
        }
    }

    /**
     * Salva uma lista de receitas no arquivo CSV.
     * @param arquivo Caminho do arquivo
     * @param listaReceita Lista de receitas
     * @throws java.io.IOException
     */
    public static void salvarReceita(String arquivo, List<Receita> listaReceita) throws IOException {
        try (PrintWriter pw = new PrintWriter(new FileWriter(arquivo))) {
            for (Receita r : listaReceita) {
                String data = r.getData().format(formatter);
                pw.printf(Locale.US, "%s;%.2f;%s;%s\n", r.getDescricao(), r.getValor(), data, r.getNomeCategoria());
            }
            pw.close();
        }
    }

    /**
     * Carrega as receitas do arquivo CSV.
     * @param arquivo Caminho do arquivo
     * @return Lista de receitas
     * @throws java.io.IOException
     */
    public static List<Receita> carregarReceitas(String arquivo) throws IOException {
        List<Receita> receitas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(";");
                receitas.add(new Receita(partes[0], Double.parseDouble(partes[1]),
                        LocalDate.parse(partes[2], formatter), Receita.CategoriaReceita.valueOf(partes[3])));
            }
            br.close();
        }
        return receitas;
    }

    /**
     * Carrega as despesas do arquivo CSV.
     * @param arquivo Caminho do arquivo
     * @return Lista de despesas
     * @throws java.io.IOException
     */
    public static List<Despesa> carregarDespesas(String arquivo) throws IOException {
        List<Despesa> despesas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(";");
                despesas.add(new Despesa(partes[0], Double.parseDouble(partes[1]),
                        LocalDate.parse(partes[2], formatter), Despesa.CategoriaDespesa.valueOf(partes[3])));
            }
            br.close();
        }
        return despesas;
    }

    /**
     * Apaga todo o conteúdo de um arquivo CSV.
     * @param arquivo Caminho do arquivo a ser apagado
     * @throws java.io.IOException
     */
    public static void apagarDados(String arquivo) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter(arquivo));
        pw.close();
    }
}
