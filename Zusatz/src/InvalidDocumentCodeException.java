public class InvalidDocumentCodeException extends Exception{
    public InvalidDocumentCodeException(){
        super("Document not classified as either U, C or P");
    }
}
