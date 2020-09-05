import exception.CalcException;
import operation.AbstractOperation;
import org.junit.Test;

import static org.junit.Assert.*;

public class AbstractOperationTest {

    @Test
    public void getOperationWithInvalidOperation() {
        try {
            AbstractOperation.calculate("s", "2 3");
        } catch (CalcException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void getOperationWithValidOperation() {
        assertEquals(AbstractOperation.calculate("-", "2 3"), -1, 0.0);
        assertEquals(AbstractOperation.calculate("+", "2 3"), 5, 0.0);
        assertEquals(AbstractOperation.calculate("*", "2 3"), 6, 0.0);
        assertEquals(AbstractOperation.calculate("/", "2 3"), 0.66666667, 0.01);
    }

}