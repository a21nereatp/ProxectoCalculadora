/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.proxectocalculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Usuario
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }

    @Test
    public void testSuma() {
        System.out.println("suma");
        Calculadora instance = new Calculadora(16,4);
        int expResult = 20;
        int result = instance.suma();
        assertEquals(expResult, result);
    }

    @Test
    public void testResta() {
        System.out.println("resta");
        Calculadora instance = new Calculadora(16,4);
        int expResult = 12;
        int result = instance.resta();
        assertEquals(expResult, result);
    }

    @Test
    public void testMultiplicacion() {
        System.out.println("multiplicacion");
        Calculadora instance = new Calculadora(16,4);
        int expResult = 64;
        int result = instance.multiplicacion();
        assertEquals(expResult, result);
    }

    @Test
    public void testDivision() {
        System.out.println("division");
        Calculadora instance = new Calculadora(16,4);
        int expResult = 4;
        int result = instance.division();
        assertEquals(expResult, result);
    }
    
}
