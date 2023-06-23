package corejava7;

public class OracleDB implements MyInterface{
    @Override
    public void connect(){
        System.out.println("Connecting to oracle DB");
    }
}
