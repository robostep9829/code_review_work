import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void add() {
        assertEquals(8, calculator.add(3, 5));
        assertEquals(0, calculator.add(-2, 2));
        assertEquals(-10, calculator.add(-5, -5));
    }

    @Test
    void dif() {
        assertEquals(2, calculator.dif(5, 3));
        assertEquals(-4, calculator.dif(2, 6));
        assertEquals(0, calculator.dif(7, 7));
    }

    @Test
    void div() {
        assertEquals(10, calculator.div(100, 10));
        assertEquals(3, calculator.div(7, 2));
        assertEquals(-4, calculator.div(-8, 2));
        assertThrows(ArithmeticException.class, () -> calculator.div(1, 0));
    }

    @Test
    void times() {
        assertEquals(25, calculator.times(5, 5));
        assertEquals(-15, calculator.times(3, -5));
        assertEquals(0, calculator.times(0, 7));
    }

    @Test
    void solver() {
        assertEquals(30, calculator.solver());
    }
}
