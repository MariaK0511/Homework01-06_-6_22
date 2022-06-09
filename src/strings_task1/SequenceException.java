package strings_task1;

public class SequenceException extends Exception{
    @Override
    public String getMessage() {
        return "there is no sequence ABC";
    }
}
