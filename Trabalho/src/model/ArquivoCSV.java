/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


import java.io.*;
import java.time.LocalDate;
import java.util.*;

/**
 *
 * @author Usuário
 */
public class ArquivoCSV {
    public static void salvarDados(String arquivo, List<? extends Lancamento> lista) throws IOException {
        try (PrintWriter pw = new PrintWriter(new FileWriter(arquivo))) {
            for (Lancamento l : lista) {
                pw.printf("%s,%f,%s,%s\n", l.getDescricao(), l.getValor(), l.getData(), l.getCategoria());
            }
        }
    }

    public static List<Receita> carregarReceitas(String arquivo) throws IOException {
        List<Receita> receitas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(",");
                receitas.add(new Receita(partes[0], Double.parseDouble(partes[1]),
                        LocalDate.parse(partes[2]), Receita.CategoriaReceita.valueOf(partes[3])));
            }
        }
        return receitas;
    }

    public static List<Despesa> carregarDespesas(String arquivo) throws IOException {
        List<Despesa> despesas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(",");
                despesas.add(new Despesa(partes[0], Double.parseDouble(partes[1]),
                        LocalDate.parse(partes[2]), Despesa.CategoriaDespesa.valueOf(partes[3])));
            }
        }
        return despesas;
    }
}
