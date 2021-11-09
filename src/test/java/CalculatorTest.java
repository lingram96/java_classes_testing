import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;
    @Before
    public void before(){ calculator = new Calculator();}

    @Test
    public void canAdd(){
        assertEquals(9, calculator.add(7, 2));
    }

    @Test
    public void canSubtract(){
        assertEquals(6, calculator.subtract(10,4));
    }

    @Test
    public void canMultiply(){
        assertEquals(7, calculator.multiply(7,1));
    }

    @Test
    public void canDivide(){
        assertEquals(4.2, calculator.divide(10.5,2.5), 0.0);
    }

}
