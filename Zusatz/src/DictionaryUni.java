//Abdihakin Sahal Omar 20-947-107
//Manuel Flückiger 22-112-502
import java.util.HashMap;

public class DictionaryUni{
    private HashMap<String,String> dict = new HashMap<String,String>();
    public void addWord(String word_language1, String word_language2){
        this.dict.put(word_language1, word_language2);
    }
    public String translate(String word_in_language1) throws WordNotFoundException {
        try{
        if (this.dict.get(word_in_language1)==null){
            throw new WordNotFoundException(word_in_language1);
        }
        else{
            return this.dict.get(word_in_language1);
        }
        }catch (WordNotFoundException ignored){
            System.out.println("Das Wort "+word_in_language1+" ist nicht im Wörterbuch vorhanden");
        }
        return "";
    }
}
