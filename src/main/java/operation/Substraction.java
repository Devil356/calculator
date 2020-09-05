package operation;

public class Substraction extends AbstractOperation implements Operation {
    private final Double[] digits;

    protected Substraction(Double[] digits) {
        super();
        this.digits = digits;
    }

    public Double[] getDigits() {
        return digits;
    }

    @Override
    public Double calculate(Double[] digits) {
        return digits[0] - digits[1];
    }
}
