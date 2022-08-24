package br.com.dio.exceptions;

import javax.swing.*;
import java.io.*;

public class ExceptionCustomizada_1 {
    public static void Exception_Personalizada(){

        String nomeDoArquivo = JOptionPane.showInputDialog("Nome do arquivo a ser exibido.");

        // src/main/resources/arquivo/arquivoDeTexto.txt
            imprimirArquivoNoConsole(nomeDoArquivo);


    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException {

        try {
            BufferedReader br = lerArquivo(nomeDoArquivo);
            String line = br.readLine();

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            do {
                bw.write(line); //escrita
                bw.newLine(); //criação da nova linha
                line = br.readLine(); //leitura da linha
            } while (line != null);
                bw.flush(); //descarregamento
                br.close(); //fechamento
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Erro inesperado. "+e.getCause());
        } finally {
            System.out.println("\nFim da operação.");
        }
    }

    public static BufferedReader lerArquivo(String nomeDoArquivo) {
        File file = new File(nomeDoArquivo);

        return new BufferedReader(new FileReader(nomeDoArquivo));
    }

}
