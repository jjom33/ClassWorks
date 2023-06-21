package corejava6.ElectronicShop;

public abstract class Accessory extends Product{
    static Accessory[] accessoriesList;
    String brand;
    String color;
    public Accessory(String modelName, String brand, String color, double price){
        super();
        this.modelName=modelName;
        this.brand=brand;
        this.color =color;
        this.price = price;
    }
    public String getBrand(){
        return this.brand;
    }
    public String getColor(){
        return this.color;
    }
    public abstract void description();
    public static void printAlldescription(){
        for (int i=0;i<Accessory.accessoriesList.length;i++){
            System.out.print((i+1)+". ");
            Accessory.accessoriesList[i].description();
        }
    }
}
