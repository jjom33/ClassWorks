package corejava6.TaskOverride_FruitTask;

public class Fruit {
    String color;
    double weight;
    public Fruit(String color, double weight){
        this.color = color;
        this.weight = weight;
    }
    void color(){
        System.out.println("Print fruit color");
    }
    void avgWeight(){
        System.out.println("print average weight");
    }
}
