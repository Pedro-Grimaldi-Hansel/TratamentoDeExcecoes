package Controller;

import com.sun.org.apache.bcel.internal.generic.FLOAD;

import javax.swing.*;

public class Calculadora {
    public static void main(String[] args) {
        try {
            float num1 = 0;
            float num2 = 0;
            String operacao;
            num1 = Float.parseFloat(JOptionPane.showInputDialog(null, "De o primeiro valor"));
            num2 = Float.parseFloat(JOptionPane.showInputDialog(null, "De o segundo valor"));
            operacao = JOptionPane.showInputDialog(null, "De a operação");
            if (operacao.equals("soma")) {
                JOptionPane.showInputDialog(null, num1 + num2);
            } else if (operacao.equals("subtracao")) {
                JOptionPane.showInputDialog(null, num1 - num2);
            } else if (operacao.equals("multiplicacao")) {
                JOptionPane.showInputDialog(null, num1 * num2);
            } else if (operacao.equals("divisao")) {
                JOptionPane.showInputDialog(null, num1 / num2);
            }
        }catch (NumberFormatException e){
            JOptionPane.showInputDialog(null, "Problema de tipo de variavel");
        }catch (ArithmeticException e){
            JOptionPane.showInputDialog(null, "Impossivel realizar a divisão por zero");
        }finally {
            JOptionPane.showInputDialog(null, "Programa Concluido");
        }

    }
}
