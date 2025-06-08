/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.Buffer;
import java.util.Scanner;

/**
 *
 * @author Usuário
 */
public class ArquivoMp3 {

    private TagMp3 tag;

    public ArquivoMp3(String nomeArquivo) throws FileNotFoundException, IOException {

        File arquivo = new File(nomeArquivo);
        try {
            if (!arquivo.exists()) {
                throw new FileNotFoundException();
            }
            if (!arquivo.isFile()) {
                throw new ArgumentoNaoEhArquivoException();
            }
        } catch (FileNotFoundException e) {
            System.out.println("O arquivo nao existe");
        } catch (ArgumentoNaoEhArquivoException e) {
            System.out.println("Nao eh arquivo");
        }

        RandomAccessFile raf = new RandomAccessFile(arquivo, "r");
        byte[] buffer = new byte[128];

        raf.seek(raf.length() - 128);
        raf.readFully(buffer);

        String cabecalho = new String(buffer, 0, 3);
        if (!cabecalho.equals("TAG")) {
            throw new ArquivoNaoTemTagMp3("Arquivo MP3 nao contem tag ID3v1.1");
        }

        tag = new TagMp3();
        tag.setTitulo(new String(buffer, 3, 30).trim());
        tag.setArtista(new String(buffer, 33, 30).trim());
        tag.setAlbum(new String(buffer, 63, 30).trim());
        tag.setAno(Integer.parseInt(new String(buffer, 93, 4).trim()));
        tag.setComentario(new String(buffer, 97, 28).trim());
        tag.setNumeroFaixa(Byte.toUnsignedInt(buffer[126]));
        tag.setGenero(Byte.toUnsignedInt(buffer[127]));
    }

    public TagMp3 getTagMp3() {
        return tag;
    }
}
