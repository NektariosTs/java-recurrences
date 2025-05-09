package repeat.chapters.chapter13.exceptions;

public class SsnNotValidException extends Exception {

    public SsnNotValidException(String ssn) {
        super("SSN " + ssn + " is not valid.");
    }
}
