package exception;

public class CalcException extends RuntimeException {
    private final String cause;

    public CalcException(String cause) {
        this.cause = cause;
    }

    @Override
    public String getMessage() {
        return cause;
    }
}
