package Implementation2;

public class Book extends StoreItem{
	private String author;

	/** constructor */
	public Book( int id, String title, String author, int year, int price ){
		super(id, title, year, price);
		this.author = author;
	}
	@Override
	public String getDescription()
	{
		return id + "(DVD) "+title+", "+year+", "+price+" CHF";
	}
}
