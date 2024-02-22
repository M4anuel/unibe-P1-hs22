public class StringTooLongException extends Exception {
    public StringTooLongException(){
        super("String must be shorter than 20 characters");
    }
}
