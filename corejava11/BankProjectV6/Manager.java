package corejava11.BankProjectV6;

public class Manager extends Person{
    String address;
    String phone;
    public Manager(int type, String id, String password, String name, String email,String address, String phone){
        super(type, id,password,name,email);
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
