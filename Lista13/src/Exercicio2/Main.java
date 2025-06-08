/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Usuário
 */
public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Digite o caminho do arquivo: ");
        Scanner scanner = new Scanner(System.in);
        
        String caminhoArquivo = scanner.nextLine();
       
        ArquivoMp3 arquivoMp3 = new ArquivoMp3(caminhoArquivo);
        
        TagMp3 tag = arquivoMp3.getTagMp3();

            System.out.println("\n--- TAG MP3 ---");
            System.out.println("Titulo: " + tag.getTitulo());
            System.out.println("Artista: " + tag.getArtista());
            System.out.println("Album: " + tag.getAlbum());
            System.out.println("Ano: " + tag.getAno());
            System.out.println("Comentario: " + tag.getComentario());
            System.out.println("Numero da faixa: " + tag.getNumeroFaixa());
            System.out.println("Genero (codigo): " + tag.getGenero());
    }
}
