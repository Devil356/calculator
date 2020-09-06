package operation;

import exception.CalcException;
import helper.Helper;

public abstract class AbstractOperation implements Operation {

    public static Double calculate(String operation, String digits) {
        Double[] parsedDigits = Helper.parseIntoTwoDoubles(digits);
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
                throw new CalcException("Невалидная операция. Введите одну из операций: +, -, *, /");
        }
        return o.calculate(o.getDigits());
    }


}
