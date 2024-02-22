package Implementation2;

import java.util.List;

public class Order {
    private int id;
    private String customerName;
    private String customerAddress;
    private IArticle[] iArticle;
    private static int idnr = 1;

    public Order(){
        this.id = idnr;
        idnr++;
        this.customerName="";
        this.customerAddress="";
        this.iArticle = new IArticle[0];
    }

    public Order(String customerName, String customerAdress, IArticle... iArticles) {
        helper(customerName, customerAdress);
        this.iArticle = iArticles;
    }
    private void helper(String customerName, String customerAdress){
        this.id = idnr;
        idnr++;
        this.customerName = customerName;
        this.customerAddress = customerAdress;
    }

    @Override
    public String toString(){
        String returnstr = "Order id: "+this.id+"Customer: "+this.customerName+
                ", "+this.customerAddress;

        for (IArticle iArticles : iArticle) {
            returnstr += "\n"+ iArticles.toString();
        }
            return returnstr;
    }

    public void add(IArticle a){
        IArticle[] newarr = new IArticle[this.iArticle.length+1];
        for (int i = 0; i < this.iArticle.length; i ++) {
            newarr[i]=this.iArticle[i];
        }
        newarr[this.iArticle.length]=a;
        this.iArticle=newarr;
    }
    public Iterable<IArticle> getOrderedArticles(){
        return List.of(this.iArticle);
    }

    public int getId() {
        return this.id;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getCustomerAddress() {
        return this.customerAddress;
    }
    public int getTotalPrice(){
        int sum = 0;
        for (IArticle iarticle : getOrderedArticles()){
            sum+=iarticle.getPrice();
        }
        return sum;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public void setCustomerAddress(String customerAdress){
        this.customerAddress=customerAdress;
    }

}
