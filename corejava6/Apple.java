package corejava6;

public class Apple extends Fruit{
    public Apple(String color, double weight){
        super(color, weight);
    }
    void color(){
        System.out.println("The color of Apple is "+this.color);
    }
    void avgWeight(){
        System.out.println("The average weight of Apple is "+this.weight+"grams");
    }
}
