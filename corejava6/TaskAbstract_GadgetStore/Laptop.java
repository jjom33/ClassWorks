package corejava6.TaskAbstract_GadgetStore;

public abstract class Laptop extends Product{
    static Laptop[] laptopList;
    int year;
    double storage;
    int memory;
    public Laptop(String modelName, int year, double storage, int memory, double price){
        super();
        this.modelName=modelName;
        this.year=year;
        this.storage=storage;
        this.memory=memory;
        this.price = price;
    }
    public int getYear(){
        return this.year;
    }
    public double getStorage(){
        return this.storage;
    }
    public int getMemory(){
        return this.memory;
    }
    public abstract void description();
    public static void printAlldescription(){
        for (int i=0;i<Laptop.laptopList.length;i++){
            System.out.print((i+1)+". ");
            Laptop.laptopList[i].description();
        }
    }
}
