/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercicio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Usuário
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File arquivo = new File("C:\\Users\\Usuário\\OneDrive\\Documentos\\NetBeansProjects\\Lista14\\src\\Exercicio\\L14_municipios.csv");
        Scanner scanner = new Scanner(arquivo, "UTF-8");
        String separador = ";";
        int maxPop = Integer.MIN_VALUE;
        int minPop = Integer.MAX_VALUE;
        int populacao = 0;
        String nomeCidadeMaxPop = "";
        String nomeCidadeMinPop = "";

        FileInputStream fis = new FileInputStream(arquivo);
        InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
        BufferedReader bf = new BufferedReader(isr);

        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }

        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();
            String[] colunas = linha.split(separador);
            populacao = Integer.parseInt(colunas[3]);

//            System.out.println(colunas[1] + " " + colunas[3]);

            if (populacao > maxPop) {
                maxPop = populacao;
                nomeCidadeMaxPop = colunas[1];
            }
            if (populacao < minPop) {
                minPop = populacao;
                nomeCidadeMinPop = colunas[1];
            }
        }

        System.out.println("Maior populacao: "+ nomeCidadeMaxPop+": " + maxPop);
        System.out.println("Menor populacao: "+ nomeCidadeMinPop+": " + minPop);
    }

}
