package corejava5;

public class OverloadSub extends Overload{
    int sum(int i, int j){
        return i+j;
    }
    //Task
    int sum(int i, int j, int k, int l){
        return i+j+k+l;
    }
}
