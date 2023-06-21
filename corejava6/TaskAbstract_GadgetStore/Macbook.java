package corejava6.TaskAbstract_GadgetStore;

public class Macbook extends Laptop{
    int displaySize;
    public Macbook(String modelName, int year, double storage, int memory, int displaySize, double price){
        super(modelName, year,storage,memory,price);
        this.displaySize = displaySize;
    }
    public void description(){
        System.out.println(this.modelName+" ("+this.year+")" +"\t $"+this.price
                            +"\n\tDisplay size: "+this.displaySize+"-inch \tStorage: "+this.storage+ "GB\tMemory: "+this.memory +"GB"
                            );
    }
}
