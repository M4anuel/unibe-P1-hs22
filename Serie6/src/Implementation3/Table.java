package Implementation3;

public class Table extends Furniture{
    private double area;

    public Table(Material material, double pricePerHour, double workedHours, double area) {
        super(material, pricePerHour, workedHours);
        this.area=area;
    }

    public double totalPrice(){return calculateEffort()+(this.area*this.material.getMaterialcost());}
}
