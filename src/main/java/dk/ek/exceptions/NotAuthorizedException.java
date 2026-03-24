package dk.ek.exceptions;

public class NotAuthorizedException extends RuntimeException {
    public NotAuthorizedException(int code, String message) {
        super(message);
    }
}
