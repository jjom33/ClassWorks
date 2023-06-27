package corejava11.BankProjectV6;

public abstract class Person{
    String id;
    String password;
    String name;
    String email;
    int type; //1 for User, 2 for manager

    public Person(int type,String id, String password, String name,String email){
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
    public String getEmail(){
        return this.email;
    }
     public void setName(String name){
        this.name = name;
    }
     public void setId(String id){
        this.id = id;
    }
    public void setPassword(String password){
         this.password=password;
    }
    public void setEmail(String email){
         this.email=email;
    }
    
    public abstract void printPersonalDetails();
}
