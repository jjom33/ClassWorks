package corejava6.ElectronicShop;

public class AirConditioner extends HomeAppliance{
    String type;
    public AirConditioner(String modelName, String type,String brand,String color, int year, double price){
        super(modelName, brand, color,year,price);
        this.type =type;
    }
    public String getType(){
        return this.type;
    }
    public void description(){
        System.out.println(this.modelName+" ("+this.type+")"+"\t $"+this.price
                            +"\n\tyear: "+this.year +"\tColor: "+this.color+"\tBrand: "+this.brand
                            );
    }
}
