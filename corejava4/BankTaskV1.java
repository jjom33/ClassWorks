package corejava4;

public class BankTaskV1 {
    String accountId;
    String password;
    int balance;
    public BankTaskV1(String accountId, String password, int balance){
        this.accountId = accountId;
        this.password = password;
        this.balance = balance;
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
}
