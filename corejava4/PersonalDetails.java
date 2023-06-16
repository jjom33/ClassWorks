package corejava4;

public class PersonalDetails {
    String accountId;
    String password;
    int balance;
    String name;
    String address;
    String mobileNum;
    public PersonalDetails(String accountId, String password, int balance,String name, String address, String mobileNum){
        this.accountId = accountId;
        this.password = password;
        this.balance = balance;
        this.name = name;
        this.address = address;
        this.mobileNum = mobileNum;
    }
    // Getter method
    public String getAccountId() {
        return accountId;
    }
    public String getPassword() {
        return password;
    }
    public int getBalance() {
        return balance;
    }
    //polymorphism
    public void printPersonalDetails(String name){
        System.out.println("-------------------------------");
        System.out.println("Name: "+this.name);
    }
    public void printPersonalDetails(String name, String address){
        System.out.println("-------------------------------");
        System.out.println("Name: "+this.name
                        + "\nAddress: "+this.address);
    }
    public void printPersonalDetails(String name, String address, String mobileNum){
        System.out.println("-------------------------------");
        System.out.println("Name: "+this.name
                          +"\nAddress: "+this.address
                          +"\nMobile number: "+this.mobileNum);
    }
}
