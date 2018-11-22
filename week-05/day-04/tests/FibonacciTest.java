import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    private Fibonacci fibonacciTest;

    @BeforeEach
    void setUp() {
        System.out.println("this is when the BeforeEach runs");

    }

    @Test
    void counter() {
        assertEquals(5, Fibonacci.counter(5));
    }

    @Test
    void counterZero(){
        assertEquals(0,Fibonacci.counter(0));
    }

    @Test
    void counterWithFour() {
        assertEquals(3,Fibonacci.counter(4));
    }
}