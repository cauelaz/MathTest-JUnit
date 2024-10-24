/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modeltest;

import modeltest.classes.CalculatorClass;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Calculator {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double valor1 = 0;
        double valor2 = 0;
        double result = 0.0;
        int operacao = 0;
        CalculatorClass calculator = new CalculatorClass();

        valor1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro valor: "));
        valor2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo valor: "));
        operacao = Integer.parseInt(JOptionPane.showInputDialog("Digite valor correspondente a operação desejada: \n"
                + "\n 1 - Somar \n 2 -Subtrair \n 3-Multiplicar \n 4-Dividir \n Operação:"));


        switch (operacao) {
            case 1:
                result = calculator.Somar(valor1, valor2);
                break;

            case 2:
                result = calculator.Subtrair(valor2, valor2);
                break;

            case 3:
                result = calculator.Multiplicar(valor1, valor2);

            case 4:
                result = calculator.Dividir(valor1, valor2);
        }

//       JOptionPane.showMessageDialog("Resultado :" + result);

    }
    

}
