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
    public void testGetNum2() {
        System.out.println("getNum2");
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.getNum2();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetNum2() {
        System.out.println("setNum2");
        int num2 = 0;
        Calculadora instance = new Calculadora();
        instance.setNum2(num2);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetNum1() {
        System.out.println("getNum1");
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.getNum1();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetNum1() {
        System.out.println("setNum1");
        int num1 = 0;
        Calculadora instance = new Calculadora();
        instance.setNum1(num1);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSuma() {
        System.out.println("suma");
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.suma();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testResta() {
        System.out.println("resta");
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.resta();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testMultiplicacion() {
        System.out.println("multiplicacion");
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.multiplicacion();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDivision() {
        System.out.println("division");
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.division();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
