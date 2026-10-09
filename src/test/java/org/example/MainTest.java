package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testFizzBuzz() {
        assertEquals("fizzbuzz", Main.fizzBuzz(35));
        assertEquals("fizz", Main.fizzBuzz(10));
        assertEquals("buzz", Main.fizzBuzz(14));
        assertEquals("1", Main.fizzBuzz(1));
    }

    @Test
    void testReverseString() {
        assertEquals("llatsni ekam", Main.reverseString("make install"));
        assertEquals("", Main.reverseString(""));
    }

    @Test
    void testSolveQuadratic() {
        assertEquals("нет вещественных корней", Main.solveQuadratic(1, 0, 1));
        assertTrue(Main.solveQuadratic(1, -3, 2).contains("x1 = 2.0"));
    }

    @Test
    void testIsPalindrome() {
        assertTrue(Main.isPalindrome("шалаш"));
        assertFalse(Main.isPalindrome("привет"));
    }

    @Test
    void testSumSeries() {
        double result = Main.sumSeries();
        assertTrue(result > 0.6 && result < 0.7);
    }
}