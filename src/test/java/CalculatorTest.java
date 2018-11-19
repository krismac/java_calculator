import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
   public void before() { calculator = new Calculator(); }


    //add
    @Test
    public void hasAdd() {
        assertEquals(10, calculator.getAdd(5, 5));

    }

    //subtract
    @Test
    public void hasSubtract() {
        assertEquals(15, calculator.getSubtract(20,5));

    }


    //multiply
    @Test
    public void hasMultiply() {
        assertEquals(10, calculator.getMultiply(5,2));

    }

    //divide
    @Test
    public void hasDivide() {
            assertEquals(10, calculator.getDivide(20,2));

    }

}
