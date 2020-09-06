import exception.CalcException;
import util.CalcUtil;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalcUtilTest {

    @Test
    public void parseWithOneSpace() {
        Double[] actual = CalcUtil.parseIntoTwoDoubles("5 5");
        Double[] expected = new Double[]{5.0, 5.0};
        assertEquals(actual, expected);
    }

    @Test
    public void parseWithTwoOrMoreSpaces() {
        Double[] actual = CalcUtil.parseIntoTwoDoubles("5     5");
        Double[] expected = new Double[]{5.0, 5.0};
        assertEquals(actual, expected);
    }

    @Test
    public void parseWithInfinitySpaces() {
        Double[] actual = CalcUtil.parseIntoTwoDoubles("     5     5    ");
        Double[] expected = new Double[]{5.0, 5.0};
        assertEquals(actual, expected);
    }

    @Test
    public void tryToParseWithOneNumber() {
        try {
            CalcUtil.parseIntoTwoDoubles("5");
        } catch (CalcException calcException){
            System.out.println(calcException.getMessage());
        }

    }

    @Test
    public void tryToParseWithMoreThanTwoNumbers() {
        try {
            CalcUtil.parseIntoTwoDoubles("5 5 5");
        } catch (CalcException calcException){
            System.out.println(calcException.getMessage());
        }
    }

    @Test
    public void tryToParseWithStrings() {
        try {
            CalcUtil.parseIntoTwoDoubles("o l");
        } catch (CalcException calcException){
            System.out.println(calcException.getMessage());
        }
    }


}