public class Bag {
    Bag bag;
    boolean empty = true;
    Integer value;

    public Bag(){
    }
    public Bag(int value){
        this.value=value;
        this.empty=false;
    }
    public void addValue(int value){
        this.bag=new Bag(value);
    }
    public boolean isEmpty(){
        return this.empty;
    }
    public String toString(){
        if (this.empty){
            return "Empty bag";
        }
        if (this.value!=null && this.bag==null){
            return this.value.toString();
        }
        return this.value+", "+this.bag.toString();
    }
}
