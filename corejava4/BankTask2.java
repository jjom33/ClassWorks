package corejava4;

public class BankTask2 {
    public static void main(String[] args){
// Setting up accounts
        BankTaskV1 user1 = new BankTaskV1("AB10001", "qwerty111", 8000);
        BankTaskV1 user2 = new BankTaskV1("AB10002", "qwerty222", 100500);
        BankTaskV1 user3 = new BankTaskV1("AB10003", "qwerty333", 500);
        BankTaskV1 user4 = new BankTaskV1("AB10004", "qwerty444", 123000);
        BankTaskV1 user5 = new BankTaskV1("AB10005", "qwerty555", 750000);
        BankTaskV1[] bankAccounts={user1, user2, user3, user4, user5};
        
        CheckBalance chatBot = new CheckBalance();
        chatBot.greeting();
        String userName = chatBot.ask("What's your name?");
        String userInput = chatBot.ask("Hi "+userName+"! I am ABChatbot, and I'm here to help you. \nHow can I help you?");


        while (!userInput.equalsIgnoreCase("no")) {
        BankTaskV1 currUserAccount=null;
        String InputId =chatBot.ask("What is your <Account Id>?");
        String InputPassword = chatBot.ask("What is your <Password>?");

        currUserAccount = chatBot.authenticate(InputId, InputPassword, bankAccounts);
        if (currUserAccount == null){
            chatBot.say("Please try again with correct information.");
        }else{
            chatBot.displayBalance(currUserAccount);
        }
        
        userInput = chatBot.ask("Do you want to do something more? (yes / no)");
    }
        chatBot.say("Thank you for using AB BANK "+userName+"! ");
    }   

     
}
