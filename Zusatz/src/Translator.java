//Abdihakin Sahal Omar 20-947-107
//Manuel Flückiger 22-112-502
import java.util.Scanner;

public class Translator {
    public static void main(String[] args) throws WordNotFoundException {
        DictionaryUni dict = new DictionaryUni();
        dict.addWord("Wasser","Water");
        dict.addWord("Erde","Earth");
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Geben Sie ein Wort zur Übersetzung ein: (0 um Abzubrechen)");
            String input = scanner.nextLine();
            if(!input.equals("0")){
                System.out.println(dict.translate(input));
            }
            else{
                break;
            }
        }
    }
}
