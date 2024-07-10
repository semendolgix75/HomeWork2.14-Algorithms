package pro.sky.java.course2.exception;

public class ErrorNullPointerException extends RuntimeException{
    public ErrorNullPointerException() {
    }

    public ErrorNullPointerException(String message) {
        super(message);
    }
}
