package corejava5;

public class OverloadMain {
    public static void main(String[] args){
        Overload overload = new Overload();
        overload.sum();
        OverloadSub overloadSub = new OverloadSub();
        overloadSub.sum();
        System.out.println(overloadSub.sum(100,200));

        //TaskOverload 
        overload.sum(1,2,3);
        overloadSub.sum(1,2,3);
        System.out.println(overloadSub.sum(100,200,1,2));
    }
}
