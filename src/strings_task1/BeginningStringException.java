package strings_task1;

public class BeginningStringException extends Exception{
    public BeginningStringException(Exception e) {

    }
    @Override
    public String getMessage() {
        return "the document does not start 555";
    }
}
