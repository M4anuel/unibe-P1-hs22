package Implementation3;

public enum Material {
    Eiche(10),
    Buche(13),
    Esche(5);
    private double materialcost;
    Material(double c){this.materialcost = c;}
    public double getMaterialcost(){return this.materialcost;}
}
