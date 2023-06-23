package corejava8.BankProjectV4;

public abstract class Person{
    String id;
    String password;
    String name;

    public Person(String id, String password, String name){
        this.id = id;
        this.password = password;
        this.name = name;
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
