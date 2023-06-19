package corejava4;

public class BankTask4 {
    public static void main(String[] args){
        // Setting up accounts
        PersonalDetails user1 = new PersonalDetails("AB10001", "qwerty111", 8000, "J Jung", "111 A street, A city, NY 1001", "+111101234");
        PersonalDetails user2 = new PersonalDetails("AB10002", "qwerty222", 100500, "Ji Jung", "222 B street, B city, NY 1002", "+111101234");
        PersonalDetails user3 = new PersonalDetails("AB10003", "qwerty333", 500, "Jiy Jung", "333 C street, C city, NY 1003", "+111101234");
        PersonalDetails user4 = new PersonalDetails("AB10004", "qwerty444", 123000, "Jiyeo Jung", "444 D street, A city, NY 1004", "+111101234");
        PersonalDetails user5 = new PersonalDetails("AB10005", "qwerty555", 750000, "Jiyeon Jung", "555 E street, A city, NY 1005", "+111101234");
        PersonalDetails[] bankAccounts={user1, user2, user3, user4, user5};

        BusinessAccount company1 = new BusinessAccount("BUS1001", "qwerty111", 8000000, "SUMMER COMPANY", "111 A street, A city, NY 1001", "+111101234");
        BusinessAccount company2 = new BusinessAccount("BUS1002", "qwerty222", 8000000, "WINTER COMPANY", "111 A street, A city, NY 1001", "+111101234");
        BusinessAccount company3 = new BusinessAccount("BUS1003", "qwerty111", 8000000, "SUMMER COMPANY", "111 A street, A city, NY 1001", "+111101234");
        BusinessAccount company4 = new BusinessAccount("BUS1004", "qwerty111", 8000000, "SUMMER COMPANY", "111 A street, A city, NY 1001", "+111101234");
        BusinessAccount company5 = new BusinessAccount("BUS1005", "qwerty111", 8000000, "SUMMER COMPANY", "111 A street, A city, NY 1001", "+111101234");
        BusinessAccount[] businessAccounts = {company1, company2, company3, company4, company5};
        
        CheckBalance chatBot = new CheckBalance();
        chatBot.greeting();
        // Authentication
        PersonalDetails currUserAccount=null;

        String accountType = chatBot.ask("What is your account type?\n1. Business Account\2. Personal Account");

        String InputId =chatBot.ask("What is your <Account Id>?");
        String InputPassword = chatBot.ask("What is your <Password>?");
        switch (accountType){
            case "1":
            case "business":
                currUserAccount = chatBot.authenticate(InputId, InputPassword, businessAccounts);
                break;
            case "2":
            case "personal":
                currUserAccount = chatBot.authenticate(InputId, InputPassword, bankAccounts);
                break;
            default:
                System.out.println("We dont have that type yet.");
        }
        
        if (currUserAccount == null){
            chatBot.say("Please try again with correct information.");
        }
        //Print personal information
        currUserAccount.printPersonalDetails("name", "address", "mobile number");
        String userInput = chatBot.ask("Hi! I am ABChatbot. How can I help you?  \n1. Check Balance");
        
        // Do tasks according to the user input
        while (!userInput.equalsIgnoreCase("no")) {
            switch (userInput){
                case "1":
                    chatBot.displayBalance(currUserAccount);
                    break;
                default:
                    System.out.println("Sorry, we dont have that option yet.");
            }
            userInput = chatBot.ask("Do you want to do something more? (yes / no)");
        }
        chatBot.say("Thank you for using AB BANK! ");
    }   
}
