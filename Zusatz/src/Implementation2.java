//Abdihakin Sahal Omar 20-947-107
//Manuel Flückiger 22-112-502
import java.util.Scanner;

public class Implementation2 {
    public static void main(String[] args) throws StringTooLongException {
        Scanner scanner = new Scanner(System.in);
        String s ="";
        while(true){
            System.out.println("Geben Sie etwas in die Konsole ein. Solange Sie " +
                    "nicht \"DONE\" in die Konsole geben, werden weiter Zeichen erwartet");
            String input = scanner.nextLine();
            if(input.contains("DONE")){
                try {
                    isStringTooLong(s);
                    break;
                }catch (StringTooLongException ignored){
                    System.out.println("String was too long, must be shorter than 20 Characters");
                    s="";
                }

            }
            else{
                s+=input;
            }
        }

        System.out.println("Zeichenkette erfolgreich eingelesen");
    }
    public static void isStringTooLong(String s) throws StringTooLongException{
        if(s.length()>20){
            throw new StringTooLongException();
        }
    }
}
