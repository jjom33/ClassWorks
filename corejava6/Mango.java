package corejava6;

public class Mango extends Fruit{
    public Mango(String color, double weight){
        super(color, weight);
    }
    void color(){
        System.out.println("The color of Mango is "+this.color);
    }
    void avgWeight(){
        System.out.println("The average weight of Mango is "+this.weight+"grams");
    }
}
