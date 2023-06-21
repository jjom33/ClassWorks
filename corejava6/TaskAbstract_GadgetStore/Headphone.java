package corejava6.ElectronicShop;

public class Headphone extends Accessory{
    double version;
    public Headphone(String modelName, String brand,double version, String color, double price){
        super(modelName,brand,color,price);
        this.version = version;
    }
    public double getVersion(){
        return this.version;
    }
    public void description(){
        System.out.println(this.modelName+" ("+this.version+")" +"\t $"+this.price
                            +"\n\tColor: "+this.color+"\tBrand: "+this.brand
                            );
    }
}
