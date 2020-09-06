package util;

import exception.CalcException;

public class CalcUtil {

    public static Double[] parseIntoTwoDoubles(String s){
        String[] strings = split(s);
        if (strings.length != 2) {
            throw new CalcException("Слишком много (мало) данных в массиве. Должно быть не более и не менее 2-х чисел.");
        }
        return validateAndParseTwoDigits(strings);

    }

    private static Double[] validateAndParseTwoDigits(String[] strings) {
        Double[] digits = new Double[2];
        for (int i = 0; i < strings.length; i++) {
            try {
                digits[i] = Double.parseDouble(strings[i]);
            } catch (NumberFormatException e){
                throw new CalcException("Переданная строка не является числом.");
            }
        }
        return digits;
    }

    private static String[] split(String s) {
        return s.replaceAll("\\s+"," ").trim().split(" ");
    }
}
