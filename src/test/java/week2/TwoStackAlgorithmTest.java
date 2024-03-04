package week2;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TwoStackAlgorithmTest {
    @Test
    @Order(1)
    void testAddition() {
        assertEquals(8, round(TwoStackAlgorithm.calculate("( 3 + 5 )")));
        assertEquals(7.7, round(TwoStackAlgorithm.calculate("( 2.7 + 5 )")));
        assertEquals(18.3, round(TwoStackAlgorithm.calculate("( 13 + 5.3 )")));
        assertEquals(8.9, round(TwoStackAlgorithm.calculate("( 3.5 + 5.4 )")));
    }

    @Test
    @Order(2)
    void testSubtraction() {
        assertEquals(-2, round(TwoStackAlgorithm.calculate("( 3 - 5 )")));
        assertEquals(-2.3, round(TwoStackAlgorithm.calculate("( 2.7 - 5 )")));
        assertEquals(7.7, round(TwoStackAlgorithm.calculate("( 13 - 5.3 )")));
        assertEquals(-1.9, round(TwoStackAlgorithm.calculate("( 3.5 - 5.4 )")));
    }

    @Test
    @Order(3)
    void testMultiplication() {
        assertEquals(15, round(TwoStackAlgorithm.calculate("( 3 * 5 )")));
        assertEquals(13.5, round(TwoStackAlgorithm.calculate("( 2.7 * 5 )")));
        assertEquals(68.9, round(TwoStackAlgorithm.calculate("( 13 * 5.3 )")));
        assertEquals(18.9, round(TwoStackAlgorithm.calculate("( 3.5 * 5.4 )")));
    }

    @Test
    @Order(4)
    void testDivision() {
        assertEquals(0.6, round(TwoStackAlgorithm.calculate("( 3 / 5 )")));
        assertEquals(0.54, round(TwoStackAlgorithm.calculate("( 2.7 / 5 )")));
        assertEquals(2.45, round(TwoStackAlgorithm.calculate("( 13 / 5.3 )")));
        assertEquals(0.65, round(TwoStackAlgorithm.calculate("( 3.5 / 5.4 )")));
    }

    @Test
    @Order(5)
    void testModulo() {
        assertEquals(2, round(TwoStackAlgorithm.calculate("( 5 % 3 )")));
        assertEquals(2.7, round(TwoStackAlgorithm.calculate("( 2.7 % 5 )")));
        assertEquals(2.4, round(TwoStackAlgorithm.calculate("( 13 % 5.3 )")));
        assertEquals(3.5, round(TwoStackAlgorithm.calculate("( 3.5 % 5.4 )")));
    }

    @Test
    @Order(6)
    void testExponentiation() {
        assertEquals(125, round(TwoStackAlgorithm.calculate("( 5 ^ 3 )")));
        assertEquals(143.49, round(TwoStackAlgorithm.calculate("( 2.7 ^ 5 )")));
        assertEquals(801493.06, round(TwoStackAlgorithm.calculate("( 13 ^ 5.3 )")));
        assertEquals(866.9, round(TwoStackAlgorithm.calculate("( 3.5 ^ 5.4 )")));
    }

    @Test
    @Order(7)
    void testSquareRoot() {
        assertEquals(4, round(TwoStackAlgorithm.calculate("( √ 16 )")));
        assertEquals(3.16, round(TwoStackAlgorithm.calculate("( √ 10 )")));
        assertEquals(2.3, round(TwoStackAlgorithm.calculate("( √ 5.3 )")));
    }

    @Test
    @Order(8)
    void testMixedExpressions() {
        assertEquals(-10, round(TwoStackAlgorithm.calculate("( ( ( 3 + 4 ) - 8 ) * 10 )")));
        assertEquals(512.5, round(TwoStackAlgorithm.calculate("( ( ( 10 / 5 ) / 4 ) + ( 8 ^ 3 ) )")));
        assertEquals(1.66, round(TwoStackAlgorithm.calculate("( ( ( √ 256 ) + ( 4 ^ 1.25 ) ) % 5 )")));
        assertEquals(5.08, round(TwoStackAlgorithm.calculate("( ( ( 2.8 + 4 ) / ( 31.3 % 4.6 ) ) ^ 2.67 )")));
        assertEquals(14.73, round(TwoStackAlgorithm.calculate("( ( ( ( √ 10 ) ^ 3.4 ) % 3.2 ) * ( ( 5.3 + 10 ) / 2.2 ) )")));
        assertEquals(0.99, round(TwoStackAlgorithm.calculate("( ( ( 11 - 2.9 ) ^ ( 3 * 0.18 ) ) / 3.14 )")));
        assertEquals(-3255.79, round(TwoStackAlgorithm.calculate("( ( ( 4.5 - 19.3 ) ^ 3 ) - ( 14 % ( 4 ^ ( √ 7 ) ) ) )")));
    }

    private Double round(Double n) {
        return Math.round(n * 100.0) / 100.0;
    }
}
