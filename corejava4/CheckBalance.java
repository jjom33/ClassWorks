package corejava4;

public class CheckBalance extends UserInformation {
    public void displayBalance(BankTaskV1 userAccount) {
         System.out.println("\n=> Your balance is: "+ userAccount.getBalance());
    }

    public void displayBalance(PersonalDetails userAccount) {
         System.out.println("\n=> Your balance is: "+ userAccount.getBalance());
    }
}
