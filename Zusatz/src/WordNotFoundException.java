public class WordNotFoundException extends Exception {
    public WordNotFoundException(String s){
        super("Das Wort "+s+" ist nicht im Wörterbuch vorhanden");
    }
}
