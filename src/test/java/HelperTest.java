import exception.CalcException;
import helper.Helper;
import org.junit.Test;

import static org.junit.Assert.*;

public class HelperTest {

    //один пробел между числами - ОК

    @Test
    public void parseWithOneSpace() {
        assertEquals(Helper.parseIntoTwoDoubles("5 5"), new Double[]{5.0,5.0});
    }

    //более одного пробела между числами - ОК

    @Test
    public void parseWithTwoOrMoreSpaces() {
        assertEquals(Helper.parseIntoTwoDoubles("5      5"), new Double[]{5.0,5.0});
    }

    //пробелов хоть сколько и хоть где - ОК

    @Test
    public void parseWithInfinitySpaces() {
        assertEquals(Helper.parseIntoTwoDoubles("   5      5  "), new Double[]{5.0,5.0});
    }

    //одно число

    @Test
    public void tryToParseWithOneNumber() {
        try {
            Helper.parseIntoTwoDoubles("5");
        } catch (CalcException calcException){
            System.out.println(calcException.getMessage());
        }

    }

    //больше 2-х чисел

    @Test
    public void tryToParseWithMoreThanTwoNumbers() {
        try {
            Helper.parseIntoTwoDoubles("5 5 5");
        } catch (CalcException calcException){
            System.out.println(calcException.getMessage());
        }
    }

    //парсинг строк

    @Test
    public void tryToParseWithStrings() {
        try {
            Helper.parseIntoTwoDoubles("o l");
        } catch (CalcException calcException){
            System.out.println(calcException.getMessage());
        }
    }


}