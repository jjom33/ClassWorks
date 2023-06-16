package corejava4;
import java.util.Scanner;


public class BankTaskV1Main {
    public static void main(String[] args){
        // Setting up accounts
        BankTaskV1 user1 = new BankTaskV1("AB10001", "qwerty111", 8000);
        BankTaskV1 user2 = new BankTaskV1("AB10002", "qwerty222", 100500);
        BankTaskV1 user3 = new BankTaskV1("AB10003", "qwerty333", 500);
        BankTaskV1 user4 = new BankTaskV1("AB10004", "qwerty444", 123000);
        BankTaskV1 user5 = new BankTaskV1("AB10005", "qwerty555", 750000);
        BankTaskV1[] bankAccounts={user1, user2, user3, user4, user5};

        // Chatbot greeting
        Scanner scanner = new Scanner(System.in);
        System.out.println("<<AB BANK>>");
        System.out.println("Welcome to AB BANK! \n What's your name?");
        String name = scanner.nextLine();
        System.out.println("\nHi "+name+"! I am ABChatbot, and I'm here to help you. \nHow can I help you?");
        String userInput = scanner.nextLine();

        // Keep asking till user inputs 'no'
        while (!userInput.equalsIgnoreCase("no")) {
            BankTaskV1 currUserAccount=null;

            System.out.println("\nOkay. What is your <Account Id>?");
            String userAccountId = scanner.nextLine();
            System.out.println("What is your <Password>?");
            String userPassword = scanner.nextLine();

            // Check for account info
            for (BankTaskV1 account : bankAccounts) {
                if (account.getAccountId().equals(userAccountId)) {
                    if (account.getPassword().equals(userPassword)){
                        currUserAccount = account;
                        System.out.println("\n[You are now logged into: "+ userAccountId+"]");
                        break;
                    }
                    else{
                        System.out.println("\nThat is not a correct password");
                    }
                }
            }
            if (currUserAccount == null){
                System.out.println("\nPlease try again with correct information.");
            }else{
                System.out.println("\n=> Your balance is: "+ currUserAccount.getBalance());
            }

            // Ask for more tasks
            System.out.println("\n"+name+ ", Do you want to do something else? (yes / no)");
            userInput = scanner.nextLine();
        }
        System.out.println("\nThank you for using AB BANK "+name+"! ");
        scanner.close();
    }
}