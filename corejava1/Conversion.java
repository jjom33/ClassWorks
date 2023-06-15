package corejava1;

public class Conversion {
    public static void main(String[] args){
        int in1 = 257;
        double do1 =257.1;
        System.out.println("do1: "+ do1);
        int in2 = (int)do1;
        System.out.println("in2: "+ in2);
        double do2 = in1;
        System.out.println("do2: "+ do2);

        // This give compile-time error
        // byte b1=130;
        // System.out.print(b1;)
        
    }
}
