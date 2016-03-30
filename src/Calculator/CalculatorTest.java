package Calculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd(){
        Calculator calc = new Calculator();
        double expected = 5;
        double actual = calc.add(3, 2);

        assertEquals("3+2 should equal 5", expected, actual, 0.0);
    }

    @Test
    public void testSubtract(){
        Calculator calc = new Calculator();
        double expected = 10;
        double actual = calc.subtract(15, 5);

        assertEquals("15-5 should equal 10", expected, actual, 0.0);
    }

    @Test
    public void testMulitply(){
        Calculator calc = new Calculator();
        double expected = 6;
        double actual = calc.multiply(3, 2);

        assertEquals("3*2 should equal 6", expected, actual, 0.0);
    }

    @Test
    public void testDivide(){
        Calculator calc = new Calculator();
        double expected = 2.5;
        double actual = calc.divide(7.5, 3);

        assertEquals("7.5/3 should equal 2.5", expected, actual, 0.0);
    }

    @Test
    public void testInputStringParse(){
        Calculator calculator = new Calculator();

        String[] expected = {"1", "+", "1"};
        String[] actual = calculator.parseInputString("1 + 1");
        for(int i = 0; i < 3; i++) {
            assertEquals("Input \"1 + 1\"' should return {\"1\", \"+\", \"1\"}", expected[i], actual[i]);
        }
    }


    @Test
    public void testCalculation(){
        Calculator calc = new Calculator();

        String input = "3 * 1";
        double expected = 3.0;
        double actual = calc.calculation(input);
    }

}
