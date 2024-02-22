package Implementation1;

public class Order {
    private int id;
    private String customerName;
    private String customerAdress;
    private Book[] books;

    private static int idnr = 1;

    public Order(){
        this.id = idnr;
        idnr++;
        this.customerName="";
        this.customerAdress="";
        this.books = new Book[0];
    }

    public Order(String customerName, String customerAdress, Book ... books) {
        helper(customerName, customerAdress);
        this.books = books;
    }
    private void helper(String customerName, String customerAdress){
        this.id = idnr;
        idnr++;
        this.customerName = customerName;
        this.customerAdress = customerAdress;
    }
    @Override
    public String toString(){
        String returnstr = "Order id: "+this.id+"Customer: "+this.customerName+
                ", "+this.customerAdress;

        for (Book book : books) {
            returnstr += "\n"+book.toString();
        }
        return returnstr;
    }

    public void addBook(Book book){
        Book[] newarr = new Book[this.books.length+1];
        for (int i = 0; i < this.books.length; i ++) {
            newarr[i]=this.books[i];
        }
        newarr[this.books.length]=book;
        this.books=newarr;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public void setCustomerAddress(String customerAdress){
        this.customerAdress=customerAdress;
    }
}
