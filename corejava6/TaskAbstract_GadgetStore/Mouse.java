package corejava6.TaskAbstract_GadgetStore;

public class Mouse extends Accessory{
    String type;
    public Mouse(String modelName, String brand, String type, String color, double price){
        super(modelName,brand,color,price);
        this.type = type;
        
    }
    public String getType(){
        return this.type;
    }
    public void description(){
        System.out.println(this.modelName+": "+this.type+"" +"\t $"+this.price
                            +"\n\tColor: "+this.color +"\tBrand: "+this.brand
                            );
    }
}
