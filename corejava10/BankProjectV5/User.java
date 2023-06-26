package corejava10.BankProjectV5;

public class User extends Person{
    String address;
    String accountNo;
    int balance;
    public User(int type,String id, String password, String name, int balance, String address, String accountNo){
        super(type, id, password, name);
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
    public void printPersonalDetails(){
        System.out.println("-------------------------------");
        System.out.println("Name: "+this.name
                          +"\nAddress: "+this.address
                          +"\nAccount number: "+this.accountNo);
    }
}
