package operation;

public class Multiplication extends AbstractOperation implements Operation {
    private final Double[] digits;

    protected Multiplication(Double[] digits) {
        super();
        this.digits = digits;
    }

    public Double[] getDigits() {
        return digits;
    }

    @Override
    public Double calculate(Double[] digits) {
        return digits[0] * digits[1];
    }
}
