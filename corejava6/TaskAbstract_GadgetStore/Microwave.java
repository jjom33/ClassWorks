package corejava6.TaskAbstract_GadgetStore;

public class Microwave extends HomeAppliance{
    int power;
    public Microwave(String modelName, int power,String brand,String color, int year, double price){
        super(modelName,brand, color,year,price);
        this.power =power;
    }
    public int getPower(){
        return this.power;
    }
    public void description(){
        System.out.println(this.modelName+" ("+this.power+" watts)"+"\t $"+this.price
                            +"\n\tyear: "+this.year +"\tColor: "+this.color+"\tBrand: "+this.brand
                            );
    }
}
