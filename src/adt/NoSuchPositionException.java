package adt;

public class NoSuchPositionException extends Exception {

    public NoSuchPositionException() {
        super();
    }

    public NoSuchPositionException(String message) {
        super(message);
    }

    public NoSuchPositionException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoSuchPositionException(Throwable cause) {
        super(cause);
    }
}
