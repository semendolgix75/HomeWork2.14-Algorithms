package pro.sky.java.course2.exception;

public class ErrorIndexOutOfBoundsException extends RuntimeException{
    public ErrorIndexOutOfBoundsException() {
    }

    public ErrorIndexOutOfBoundsException(String message) {
        super(message);
    }
}
