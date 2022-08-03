package br.com.dio.exceptions;

import javax.swing.*;
import java.awt.*;

public class UncheckedExceptions {
    public static void Unchecked_Exception(){
        JOptionPane.showMessageDialog(null, "EXEMPLO DE UNCHECKED EXCEPTION");

        Boolean ContinueLooping = true;
        do{
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Divisor: ");

            try {
                double resultado = dividir(Double.parseDouble(a), Double.parseDouble(b));
                JOptionPane.showMessageDialog(null, "resultado: " + resultado);
                ContinueLooping = false;

            } catch (NumberFormatException | HeadlessException e) {
                JOptionPane.showMessageDialog(null, "INPUT INVÁLIDO INFORME UM NÚMERO. ERRO EM: " + e.getMessage());
                e.printStackTrace();
            } catch (ArithmeticException e) {
                e.printStackTrace();
            } finally {
                System.out.println("Fim de execução.");
            }
        } while(ContinueLooping);

    }
    public static double dividir(double a, double b){
        return a / b ;
    }

}