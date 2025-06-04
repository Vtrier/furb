/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercicio;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
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
        FileInputStream fis = new FileInputStream(arquivo);
        BufferedInputStream bis = new BufferedInputStream(fis);
        RandomAccessFile raf = new RandomAccessFile(arquivo, "r");
        raf.seek(52);
        String separador = ";";
        int separadorContador = 0;

        while (scanner.hasNextLine()) {
            if(scanner.next().equals(separador)){
                System.out.println("bunda");
            }
            
        }
    }

}
