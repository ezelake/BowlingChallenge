package ceq.bowling.util;

public class BowlingException extends Exception {
	private static final long serialVersionUID = 1L;

	public BowlingException(String errorMessage) {
        super(errorMessage);
    }
}