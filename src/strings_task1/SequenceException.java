package strings_task1;

public class SequenceException extends Exception{
    @Override
    public String getMessage() {
        return "sequence must be according to ABC";
    }
}
