package corejava11.BankProjectV6;

public class User extends Person{
    String address;
    String accountNo;
    int balance;
    public User(int type,String id, String password, String name, String email, int balance, String address, String accountNo){
        super(type, id, password, name, email);
        this.address=address;
        this.accountNo =accountNo;
        this.balance = balance;
    }

    public String getAddress(){
        return this.id;
    }
    public String getAccountNo(){
        return this.password;
    }
    public int getBalance(){
        return this.balance;
    }
    public void setAddress(String address){
       this.address = address;
    }
    public void setBalance(int balance){
       this.balance = balance;
    }
    public void printPersonalDetails(){
        System.out.println("-------------------------------");
        System.out.println("Name: "+this.name
                          +"\nAddress: "+this.address
                          +"\nEmail: "+this.email
                          +"\nAccount number: "+this.accountNo);
    }
}
