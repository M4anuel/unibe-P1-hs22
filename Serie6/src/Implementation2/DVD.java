package Implementation2;

public class DVD extends StoreItem{

    /** constructor */
    public DVD( int id, String title, int year, int price )
    {
        super(id, title, year, price);
    }
    @Override
    public String getDescription()
    {
        return id + "(DVD) "+title+", "+year+", "+price+" CHF";
    }
}
