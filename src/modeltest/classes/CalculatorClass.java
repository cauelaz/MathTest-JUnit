/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeltest.classes;

/**
 *
 * @author caue_lazzaroti
 */
public class CalculatorClass {

    private double result = 0;

    public double Somar(double valorA, double valorB) {
        result = valorA + valorB;
        return result;
    }

    public double Subtrair(double valorA, double valorB) {
        result = valorA - valorB;
        return result;
    }

    public double Multiplicar(double valorA, double valorB) {
        result = valorA * valorB;
        return result;
    }

    public double Dividir(double valorA, double valorB) {
        result = valorA / valorB;
        return result;
    }
}
