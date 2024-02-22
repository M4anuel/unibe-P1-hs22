package Implementation2;

public class CD extends StoreItem{
    private String interpreter;

    /** constructor */
    public CD( int id, String title, String interpreter, int year, int price ){
        super(id, title, year, price);
        this.interpreter = interpreter;
    }
    @Override
    public String getDescription()
    {
        return id + "(DVD) "+title+", "+year+", "+price+" CHF ";
    }
}
