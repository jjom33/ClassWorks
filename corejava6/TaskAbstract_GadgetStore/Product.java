package corejava6.ElectronicShop;

public class Product {
    String storeName;
    String modelName;
    double price;
    public Product(){
        this.storeName="AA Electronic Shop";
    }
    public String getModelName(){
        return this.modelName;
    }
    public double getPrice(){
        return this.price;
    }
    public void printStoreName(){
        System.out.println("This product is sold from "+this.storeName);
    }
}
