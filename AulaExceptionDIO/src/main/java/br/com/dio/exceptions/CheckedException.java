package br.com.dio.exceptions;

import javax.swing.*;
import java.io.*;
//imprimir um arquivo no console
public class CheckedException {
    public static void Checked_Exception() {
        String nomeDoArquivo = ("src/main/resources/arquivo/arquivoDeTexto.txt");

        try {
            imprimirArquivoNoConsole(nomeDoArquivo);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Arquivo não encontrado.");
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Erro inesperado. "+e.getCause());
        } finally {
            System.out.println("\nFim da operação.");
        }

    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException {
        File file = new File(nomeDoArquivo);

        //file.getName() se não estiver dentro de uma pasta
        BufferedReader br = new BufferedReader(new FileReader(file.getPath()));

        String line = br.readLine();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do {
            bw.write(line); //escrita
            bw.newLine(); //criação da nova linha
            line = br.readLine(); //leitura da linha
        } while (line != null);
        bw.flush(); //descarregamento
        br.close(); //fechamento
    }
}
