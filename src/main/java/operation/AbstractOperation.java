package operation;

import exception.CalcException;
import helper.Helper;

public abstract class AbstractOperation implements Operation {

    public static Double calculate(String operation, String digits) {
        Operation o;
        switch (operation.trim()){
            case "+":
                o = new Addition(Helper.parseIntoTwoDoubles(digits));
                break;
            case "-":
                o = new Substraction(Helper.parseIntoTwoDoubles(digits));
                break;
            case "*":
                o = new Multiplication(Helper.parseIntoTwoDoubles(digits));
                break;
            case "/":
                o = new Division(Helper.parseIntoTwoDoubles(digits));
                break;
            default:
                throw new CalcException("Невалидная операция. Введите одну из операций: +, -, *, /");
        }
        return o.calculate(o.getDigits());
    }


}
