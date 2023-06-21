package corejava6.TaskOverride_FruitTask;

public class FruitMain {
    public static void main(String[] args){
        Fruit fruit;
        Mango mango = new Mango("yellow",100);
        Apple apple = new Apple("red",80);
        mango.color();
        mango.avgWeight();
        apple.color();
        apple.avgWeight();
    }
}
