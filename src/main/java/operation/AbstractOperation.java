package operation;

import exception.CalcException;
import util.CalcUtil;

public abstract class AbstractOperation implements Operation {

    public static Double calculate(String operation, String digits) {
        Double[] parsedDigits = CalcUtil.parseIntoTwoDoubles(digits);
        Operation o;
        switch (operation.trim()){
            case "+":
                o = new Addition(parsedDigits);
                break;
            case "-":
                o = new Substraction(parsedDigits);
                break;
            case "*":
                o = new Multiplication(parsedDigits);
                break;
            case "/":
                o = new Division(parsedDigits);
                break;
            default:
                throw new CalcException("Invalid operation. Please, choose operation from those: +, -, *, /");
        }
        return o.calculate(o.getDigits());
    }


}
