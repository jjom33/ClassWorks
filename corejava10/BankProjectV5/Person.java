package corejava10.BankProjectV5;

public abstract class Person{
    String id;
    String password;
    String name;
    int type; //1 for User, 2 for manager

    public Person(int type,String id, String password, String name){
        this.type = type;
        this.id = id;
        this.password = password;
        this.name = name;
    }
    public int getType(){
        return this.type;
    }
    public String getId(){
        return this.id;
    }
    public String getPassword(){
        return this.password;
    }
    public String getName(){
        return this.name;
    }
    public abstract void printPersonalDetails();
}
