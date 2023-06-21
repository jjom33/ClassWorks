package corejava6.TaskAbstract_GadgetStore;

public class Keyboard extends Accessory{
    String size;
    String switchType;
    public Keyboard(String modelName, String switchType,String brand, String size, String color, double price){
        super(modelName,brand,color,price);
        this.size = size;
        this.switchType=switchType;
        
    }
    public String getSize(){
        return this.size;
    }
    public String getSwitchType(){
        return this.switchType;
    }
    public void description(){
        System.out.println(this.modelName+" ("+this.size+")" +"\t $"+this.price
                            +"\n\tSwitch: "+this.switchType+"Color: "+this.color +"\tBrand: "+this.brand
                            );
    }
}
