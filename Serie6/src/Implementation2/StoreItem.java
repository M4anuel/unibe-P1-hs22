package Implementation2;

public abstract class StoreItem implements IArticle{
    protected int id;
    protected String title;
    protected int year;
    protected int price; // CHF

    /** constructor */
    public StoreItem( int id, String title, int year, int price ){
        this.id = id;
        this.title = title;
        this.year = year;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }
}
