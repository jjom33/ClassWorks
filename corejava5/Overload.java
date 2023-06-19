package corejava5;

public class Overload {
    int num1 =10, num2=20, sum;
    int multiply;
    void sum(){
        sum = num1 + num2;
        System.out.println("Sum: "+sum);
    }
    //Task
    void sum(int i, int j, int k){
        sum = i+j+k;
        System.out.println("Sum: "+sum);
    }
}
