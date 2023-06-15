package corejava3;

public class Function1 {
    int a;
    int b;
    int c;
    public Function1(){
        this.a = 3;
        this.b = 4;
        this.c = 5;
    }
    public int sum(){
        return a+b+c;
    }
    public void product(){
        System.out.println("Product is: "+ (a*b*c));
    }
}
