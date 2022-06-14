package strings_task1;

public class EndStringException extends Exception{
    public EndStringException(Exception e) {

    }
    @Override
    public String getMessage() {
        return "document doesn't end with 1a2b";
    }
}
