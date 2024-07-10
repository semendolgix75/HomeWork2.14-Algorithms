package pro.sky.java.course2.exception;

public class ErrorValueNotFoundInArray extends RuntimeException{
    public ErrorValueNotFoundInArray() {
    }

    public ErrorValueNotFoundInArray(String message) {
        super(message);
    }
}
