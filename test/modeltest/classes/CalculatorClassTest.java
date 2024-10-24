/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package modeltest.classes;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author caue_lazzaroti
 */
public class CalculatorClassTest {

    public CalculatorClassTest() {
    }

    @Test
    public void somaTest() {
        double valor01 = 10;
        double valor02 = 20;

        CalculatorClass aux = new CalculatorClass();

        double resultado = aux.Somar(valor01, valor02);
        assertEquals(30, resultado,0.0);
    }
    @Test
    public void subtracaoTest() {
        double valor01 = 10;
        double valor02 = 20;

        CalculatorClass aux = new CalculatorClass();

        double resultado = aux.Subtrair(valor02, valor01);
        assertEquals(10, resultado,0.0);
    }
    @Test
    public void multiplicarTest() {
        double valor01 = 10;
        double valor02 = 20;

        CalculatorClass aux = new CalculatorClass();

        double resultado = aux.Multiplicar(valor01, valor02);
        assertEquals(200, resultado,0.0);
    }
    @Test
    public void dividirTest() {
        double valor01 = 20;
        double valor02 = 5;

        CalculatorClass aux = new CalculatorClass();

        double resultado = aux.Dividir(valor01, valor02);
        assertEquals(4, resultado,0.0);
    }



}
