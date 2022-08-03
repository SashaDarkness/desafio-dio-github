package br.com.dio.exceptions;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
         System.out.println("--- Executando o Unchecked Exception ---\n");
         exibir_UncheckedException();

        System.out.println("\n--- Executando o Checked Exception ---\n");
        exibir_CheckedException();

        //System.out.println("\n--- Executando ---\n");

    }
    public static void exibir_UncheckedException(){
        UncheckedExceptions.Unchecked_Exception();
    }
    public static void exibir_CheckedException() throws IOException {
        CheckedException.Checked_Exception();
    }

    public static void exibir_Exception1() throws IOException {
        //ExceptionCustomizada_1.Exception_Customizada1();
    }
}