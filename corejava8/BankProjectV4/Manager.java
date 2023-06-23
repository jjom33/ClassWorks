package corejava8.BankProjectV4;

public class Manager extends Person{
    String address;
    String phone;
    public Manager(String id, String password, String name, String address, String phone){
        super(id,password,name);
        this.address=address;
        this.phone=phone;
    }
    public void printPersonalDetails(){
        System.out.println("-------------------------------");
        System.out.println("Name: "+this.name
                          +"\nAddress: "+this.address
                          +"\nAccount number: "+this.phone);
    }
}
