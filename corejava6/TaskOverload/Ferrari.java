package corejava6.TaskOverload;

public class Ferrari extends Car{
    public Ferrari(String color, double topSpeed,String type,String convertible){
        super( color,  topSpeed, type, convertible);
    }
    void features(String color){
        System.out.println("The color of this Ferrari is "+this.color+".");
    }
    void features(String color,double topSpeed){
        System.out.println("The color of this Ferrari is "+this.color
                            +", \nand its top speed is "+this.topSpeed+"MPH.");
    }
    void features(String color,double topSpeed,String type){
        System.out.println("The color of this Ferrari is "+this.color
                            +", \nand its top speed is "+this.topSpeed
                            +"MPH, \nand it is a "+this.type+".");
    }
    void features(boolean printAll){
        if (printAll){
            System.out.println("Entire features of this Ferrari: \n"
                            +"The color of this Ferrari is "+this.color
                            +", \nand its top speed is "+this.topSpeed
                            +"MPH, \nand it is a "+this.type
                            +", \nand it is a "+convertible+".");
        }
    }
}
