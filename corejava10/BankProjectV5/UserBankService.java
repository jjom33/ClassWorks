package corejava10.BankProjectV5;

public class UserBankService extends BankService implements CheckBalance,ShowOptions{
    User user;
    public UserBankService(User user){
        this.user=user;
    }

    public void showOptions(){
        String userInput = "";
        while (!userInput.equalsIgnoreCase("no")) {
            userInput = this.ask("Hi! I am AB Bank Chatbot. How can I help you?  \n1. Check Balance");
            switch (userInput){
                case "1":
                    this.displayBalance(this.user);
                    break;
                default:
                    System.out.println("Sorry, we dont have that option yet.");
            }
            userInput = this.ask("Do you want to do something more? (yes / no)");
        }
        this.say("Thank you for using AB BANK! ");
    }
    
    public void displayBalance(User user){
        if (user instanceof User){
System.out.println("\n=> Your balance is: "+ ((User)user).getBalance());
      
        }
          else{
            System.out.println("no");
        }
    }
}
