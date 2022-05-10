import day6.Calculator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(value= MethodOrderer.OrderAnnotation.class)
public class CalculatorTest {

    @Test
    @DisplayName("2. Testing sum with two positive numbers")
    @Order(2)
    public void testCalculatorSum(){
        Calculator calc = new Calculator();
        //expected value from program for given parameters
        int expected = 20;
        //actual value from program for given parameters
        int actual = calc.sum(10,10);

        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("3. Testing sum with one positive number and one negative number")
    @Order(3)
    public void testCalculatorOneNegative(){
        Calculator calc = new Calculator();
        //expected value from program for given parameters
        int expected = 0;
        //actual value from program for given parameters
        int actual = calc.sum(-10,10);

        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("1. Testing sum with two negative numbers")
    @Order(1)
    public void testCalculatorTwoNegative(){
        Calculator calc = new Calculator();
        //expected value from program for given parameters
        int expected = -20;
        //actual value from program for given parameters
        int actual = calc.sum(-10,-10);

        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("4. Testing subtract with two positive numbers")
    @Order(4)
    public void testCalculatorSubtract(){
        Calculator calc = new Calculator();
        //expected value from program for given parameters
        int expected = 0;
        //actual value from program for given parameters
        int actual = calc.subtract(10,10);

        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("6. Testing subtract with one positive number and zero")
    @Order(6)
    public void testCalculatorSubtract2(){
        Calculator calc = new Calculator();
        //expected value from program for given parameters
        int expected = 10;
        //actual value from program for given parameters
        int actual = calc.subtract(10,0);

        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("5. Testing subtract with one positive number and one negative number")
    @Order(5)
    public void testCalculatorSubtract3(){
        Calculator calc = new Calculator();
        //expected value from program for given parameters
        int expected = 30;
        //actual value from program for given parameters
        int actual = calc.subtract(10,-20);

        assertEquals(expected,actual);
    }
}
