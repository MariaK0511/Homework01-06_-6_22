package Task2_exceptions;

public class WrongLoginException extends Exception{
    public WrongLoginException(Exception e) {
    }
    public WrongLoginException(String message) {
        super(message);
    }
}
