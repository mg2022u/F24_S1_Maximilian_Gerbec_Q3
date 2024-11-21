/**
 * 
 */
package com.jwetherell.algorithms.mathematics;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author m
 *
 */
public class MultiplicationTest {

	@Test
    void testMultiplication() {
        // Regular cases
        assertEquals(6, Multiplication.multiplication(2, 3));
        assertEquals(-6, Multiplication.multiplication(-2, 3));
        assertEquals(6, Multiplication.multiplication(2, -3));
        assertEquals(0, Multiplication.multiplication(0, 5));
        assertEquals(0, Multiplication.multiplication(5, 0));

        // Edge case: Large number multiplication
        assertEquals(1000000000L, Multiplication.multiplication(1000000, 1000));
        assertEquals(-1000000000L, Multiplication.multiplication(-1000000, 1000));

        // Edge case: Very large input that overflows long
        assertEquals(9223372036854775807L, Multiplication.multiplication(2147483647, 429467295));  // Large int multiplication
        
        // Test multiplication with zeros and negative numbers
        assertEquals(0, Multiplication.multiplication(0, 0));
    }

    @Test
    void testMultiplyUsingLoop() {
        // Regular cases
        assertEquals(6, Multiplication.multiplyUsingLoop(2, 3));
        assertEquals(-6, Multiplication.multiplyUsingLoop(-2, 3));
        assertEquals(6, Multiplication.multiplyUsingLoop(2, -3));
        assertEquals(0, Multiplication.multiplyUsingLoop(0, 5));
        assertEquals(0, Multiplication.multiplyUsingLoop(5, 0));

        // Edge case: Large number multiplication
        assertEquals(1000000000L, Multiplication.multiplyUsingLoop(1000000, 1000));
        assertEquals(-1000000000L, Multiplication.multiplyUsingLoop(-1000000, 1000));
        
        assertEquals(0, Multiplication.multiplyUsingLoop(0, 0));
    }

    @Test
    void testMultiplyUsingRecursion() {
        // Regular cases
        assertEquals(6, Multiplication.multiplyUsingRecursion(2, 3));
        assertEquals(-6, Multiplication.multiplyUsingRecursion(-2, 3));
        assertEquals(6, Multiplication.multiplyUsingRecursion(2, -3));
        assertEquals(0, Multiplication.multiplyUsingRecursion(0, 5));
        assertEquals(0, Multiplication.multiplyUsingRecursion(5, 0));

        // Edge case: Large number multiplication
        assertEquals(1000000000L, Multiplication.multiplyUsingRecursion(1000000, 1000));
        assertEquals(-1000000000L, Multiplication.multiplyUsingRecursion(-1000000, 1000));
        
        assertEquals(0, Multiplication.multiplyUsingRecursion(0, 0));
    }

    @Test
    void testMultiplyUsingShift() {
        // Regular cases
        assertEquals(6, Multiplication.multiplyUsingShift(2, 3));
        assertEquals(-6, Multiplication.multiplyUsingShift(-2, 3));
        assertEquals(6, Multiplication.multiplyUsingShift(2, -3));
        assertEquals(0, Multiplication.multiplyUsingShift(0, 5));
        assertEquals(0, Multiplication.multiplyUsingShift(5, 0));

        // Edge case: Large number multiplication
        assertEquals(1000000000L, Multiplication.multiplyUsingShift(1000000, 1000));
        assertEquals(-1000000000L, Multiplication.multiplyUsingShift(-1000000, 1000));
        
        assertEquals(0, Multiplication.multiplyUsingShift(0, 0));
    }

    @Test
    void testMultiplyUsingLogs() {
        // Regular cases
        assertEquals(6, Multiplication.multiplyUsingLogs(2, 3));
        assertEquals(-6, Multiplication.multiplyUsingLogs(-2, 3));
        assertEquals(6, Multiplication.multiplyUsingLogs(2, -3));
        assertEquals(0, Multiplication.multiplyUsingLogs(0, 5));
        assertEquals(0, Multiplication.multiplyUsingLogs(5, 0));

        // Edge case: Large number multiplication
        assertEquals(1000000000L, Multiplication.multiplyUsingLogs(1000000, 1000));
        assertEquals(-1000000000L, Multiplication.multiplyUsingLogs(-1000000, 1000));
        
        assertEquals(0, Multiplication.multiplyUsingLogs(0, 0));
    }

    @Test
    void testMultiplyUsingFFT() {
        // Regular cases
        assertEquals("6", Multiplication.multiplyUsingFFT("2", "3"));
        assertEquals("-6", Multiplication.multiplyUsingFFT("-2", "3"));
        assertEquals("6", Multiplication.multiplyUsingFFT("2", "-3"));
        assertEquals("0", Multiplication.multiplyUsingFFT("0", "5"));
        assertEquals("0", Multiplication.multiplyUsingFFT("5", "0"));

        // Edge case: Large number multiplication
        assertEquals("1000000000", Multiplication.multiplyUsingFFT("1000000", "1000"));
        assertEquals("-1000000000", Multiplication.multiplyUsingFFT("-1000000", "1000"));
        
        // Test invalid or edge values like negative inputs
        assertEquals("-12", Multiplication.multiplyUsingFFT("-3", "4"));
    }

    @Test
    void testMultiplyUsingLoopWithStringInput() {
        // Regular cases
        assertEquals("6", Multiplication.multiplyUsingLoopWithStringInput("2", "3"));
        assertEquals("-6", Multiplication.multiplyUsingLoopWithStringInput("-2", "3"));
        assertEquals("6", Multiplication.multiplyUsingLoopWithStringInput("2", "-3"));
        assertEquals("0", Multiplication.multiplyUsingLoopWithStringInput("0", "5"));
        assertEquals("0", Multiplication.multiplyUsingLoopWithStringInput("5", "0"));

        // Edge case: Large number multiplication
        assertEquals("1000000000", Multiplication.multiplyUsingLoopWithStringInput("1000000", "1000"));
        assertEquals("-1000000000", Multiplication.multiplyUsingLoopWithStringInput("-1000000", "1000"));
    }

    @Test
    void testMultiplyUsingLoopWithIntegerInput() {
        // Regular cases
        assertEquals(6, Multiplication.multiplyUsingLoopWithIntegerInput(2, 3));
        assertEquals(-6, Multiplication.multiplyUsingLoopWithIntegerInput(-2, 3));
        assertEquals(6, Multiplication.multiplyUsingLoopWithIntegerInput(2, -3));
        assertEquals(0, Multiplication.multiplyUsingLoopWithIntegerInput(0, 5));
        assertEquals(0, Multiplication.multiplyUsingLoopWithIntegerInput(5, 0));

        // Edge case: Large number multiplication
        assertEquals(1000000000, Multiplication.multiplyUsingLoopWithIntegerInput(1000000, 1000));
        assertEquals(-1000000000, Multiplication.multiplyUsingLoopWithIntegerInput(-1000000, 1000));
        
        assertEquals("-12", Multiplication.multiplyUsingLoopWithStringInput("-3", "4"));
    }
}

