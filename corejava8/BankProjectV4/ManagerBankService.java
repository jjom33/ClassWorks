package corejava8.BankProjectV4;

public class ManagerBankService extends BankService implements ShowOptions{
    Manager manager;
    public ManagerBankService(Manager manager){
        this.manager=manager;
    }

    public void showOptions(){
        String userInput = "";
        while (!userInput.equalsIgnoreCase("no")) {
            userInput = this.ask("Hi! I am AB Bank Chatbot. How can I help you?  \n1. Add new user\n2. List all users");
            switch (userInput){
                case "1":
                    String newName = this.ask("Enter name of the new user: ");
                    String newId = this.ask("Enter id for a new user: ");
                    String newPassword = this.ask("Enter password for a new user: ");
                    String newAddress = this.ask("Enter address of new user: ");
                    int newBalance = Integer.parseInt(this.ask("Enter the balance for the new user"));
                    User newUser = new User(newId, newPassword,newName, newBalance, newAddress, "1020392919");
                    AuthenticationClass.addNewUser(newUser);
                    this.say("added new user "+newName+ " to the Bank.");
                    break;
                case "2":
                    System.out.println("List of all the users of AB Bank: ");
                    for(int i=0;i<AuthenticationClass.userListLength;i++){
                        
                        AuthenticationClass.userAccounts[i].printPersonalDetails();
                    }
                default:
                    System.out.println("");
            }
            userInput = this.ask("Do you want to do something more? (yes / no)");
        }
        this.say("Thank you for using AB BANK! ");
    }
}
