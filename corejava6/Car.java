package corejava6;

public class Car { //TaskOverload
    String color;
    double topSpeed;
    String type;
    String convertible;
    public Car(String color, double topSpeed,String type,String convertible){
        this.color = color;
        this.topSpeed = topSpeed;
        this.type = type;
        this.convertible = convertible;
    }
    void features(){
        System.out.println("Prints the car's features");
    }
}
