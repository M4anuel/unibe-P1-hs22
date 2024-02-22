//Abdihakin Sahal Omar 20-947-107
//Manuel Flückiger 22-112-502
import java.io.File;
public class Implementation3 {
    public static void main(String[] args) {
        try {
            File myObj = new File("src/testdocuments/P_privatedocument.txt");
            if(myObj.getName().charAt(0) != 'U' && myObj.getName().charAt(0) != 'C' && myObj.getName().charAt(0) != 'P'){
                throw new InvalidDocumentCodeException();
            }
        } catch ( InvalidDocumentCodeException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        try {
            File myObj = new File("src/testdocuments/p_wrongprivatedocument.txt");
            if(myObj.getName().charAt(0) != 'U' && myObj.getName().charAt(0) != 'C' && myObj.getName().charAt(0) != 'P'){
                throw new InvalidDocumentCodeException();
            }
        } catch (InvalidDocumentCodeException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
