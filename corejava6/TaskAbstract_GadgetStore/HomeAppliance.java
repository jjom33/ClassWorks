package corejava6.TaskAbstract_GadgetStore;

public abstract class HomeAppliance extends Product{
    static HomeAppliance[] homeAppliancesList;
    String brand;
    String color;
    int year;
    public HomeAppliance(String modelName, String brand,String color, int year, double price){
        super();
        this.modelName=modelName;
        this.brand=brand;
        this.color =color;
        this.year=year;
        this.price = price;
    }
    public String getBrand(){
        return this.brand;
    }
    public String getColor(){
        return this.color;
    }
    public double getYear(){
        return this.year;
    }
    public abstract void description();
    
    public static void printAlldescription(){
        for (int i=0;i<HomeAppliance.homeAppliancesList.length;i++){
            System.out.print((i+1)+". ");
            HomeAppliance.homeAppliancesList[i].description();
        }
    }
}
