package org.example.factorial;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.example.Fibonacci;

public class FibonacciTest {


    @Test
    public void IncorrectValueError(){
        Fibonacci f = new Fibonacci();

        assertThrows(RuntimeException.class,() -> f.compute(-1,-1));
    }

    @Test
    public void Fibonacciof1month(){
        Fibonacci f = new Fibonacci();

        int expectedValue = 1;
        assertEquals(f.compute(1,1),expectedValue);

    }
    @Test
    public void Fibonacciof5MonthAnd3CouplesOfBabies(){
        Fibonacci f = new Fibonacci();

        int expectedValue = 19;
        assertEquals(f.compute(3,5),expectedValue);

    }
}
