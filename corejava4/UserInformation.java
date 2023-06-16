package corejava4;

public class UserInformation extends Conversation{
    // For BankTask2
     public BankTaskV1 authenticate(String id, String password, BankTaskV1[] bankAccounts) {
        BankTaskV1 userAccount = null;
        for (BankTaskV1 account : bankAccounts) {
                if (account.getAccountId().equals(id)) {
                    if (account.getPassword().equals(password)){
                        userAccount = account;
                        System.out.println("\n[You are now logged into: "+ id+"]");
                        break;
                    }
                    else{
                        System.out.println("\nThat is not a correct password");
                        break;
                    }
                }
        }
        System.out.println("There is no account with such id "+id);
        return userAccount;
     }
     //For BankTask3
     public PersonalDetails authenticate(String id, String password, PersonalDetails[] bankAccounts) {
        PersonalDetails userAccount = null;
        for (PersonalDetails account : bankAccounts) {
                if (account.getAccountId().equals(id)) {
                    if (account.getPassword().equals(password)){
                        userAccount = account;
                        System.out.println("\n[You are now logged into: "+ id+"]");
                        break;
                    }
                    else{
                        System.out.println("\nThat is not a correct password");
                        break;
                    }
                }
        }
        // System.out.println("There is no account with such id "+id);
        return userAccount;
     }
}
