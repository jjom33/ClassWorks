package corejava6;

public class TaskOverload {
    public static void main(String[] args){
        Ferrari ferrari = new Ferrari("blue", 205, "coupe", "convertible");
        ferrari.features("color");
        System.out.println("");
        ferrari.features(true);
    }
} 
