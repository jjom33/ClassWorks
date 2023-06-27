package corejava11.BankProjectV6;

public class ManagerBankService extends BankService implements ShowOptions,UpdateUserInformation{
    Manager manager;
    public ManagerBankService(Manager manager){
        this.manager=manager;
    }

    public void showOptions(){
        String userInput = "";
        while (!userInput.equalsIgnoreCase("no")) {
            userInput = this.ask("Hi! I am AB Bank Chatbot. How can I help you?  \n1. Add new user\n2. List all users\n3. Update user information\n4. Search user\n5. Delete user\n");
            switch (userInput){
                case "1":
                    this.managerAddNewUser();
                    break;
                case "2":
                    this.managerListAllUsers();
                    break;
                case "3":
                    this.managerUpdateUser();
                    break;
                case "4":
                    this.managerFindUser();
                    break;
                case "5":
                    this.managerDeleteUser();
                default:
                    System.out.println("");
            }
            userInput = this.ask("Do you want to do something more? (yes / no)");
        }
        this.say("Thank you for using AB BANK! ");
    }

    protected void managerAddNewUser(){
        String newName = this.ask("Enter name of the new user: ");
                    String newId = this.ask("Enter id for a new user: ");
                    String newPassword = this.ask("Enter password for a new user: ");
                    String newAddress = this.ask("Enter address of new user: ");
                    String newEmail = this.ask("Enter email of new user: ");
                    int newBalance;
        while(true){
            try{
                newBalance= Integer.parseInt(this.ask("Enter the balance for the new user"));
                break;
            }catch(NumberFormatException e){
                System.out.println(" Please enter balance with an integer");
             }
        }
        User newUser = new User(1, newId, newPassword,newName, newEmail, newBalance, newAddress, "1020392919");
        Bank.bank.addNewUser(newUser);
        this.say("added new user "+newName+ " to the Bank.");
                    
    }

    public void managerListAllUsers(){
        System.out.println("List of all the users of AB Bank: ");
        Bank.bank.printAllUserInfos();
    }
    public void managerUpdateUser(){
        String userId = this.ask("Enter User ID to update: ");
        int option;
        while(true){
            try{
                option= Integer.parseInt(this.ask("What field do you want to update?\n1.Email\n2.Address\n3.Password"));
                break;
            }catch(NumberFormatException e){
                System.out.println(" Sorry we don't have that option yet.");
            }
        }
        String changeTo = this.ask("Enter value to update: ");
        if (Bank.bank.updateUser(userId, option, changeTo)){
            this.say("successfully updated");
            Bank.bank.findUser(userId).printPersonalDetails();
        }
    }
    public void managerDeleteUser(){
        String userId = this.ask("Enter User ID to delete: ");
        Bank.bank.findUser(userId).printPersonalDetails();
        int confirm=2;
        while(true){
            try{
                confirm = Integer.parseInt(ask("Would you like to delete user ["+ userId +"] permanently? You cannot undo this. \n\t1. yes, delete\n\t2. no"));
                if (confirm!=1 && confirm!=2){
                    throw new NumberFormatException();
                }
                break;
            }catch(NumberFormatException e){
                System.out.println("Please choose between 1 or 2");
            }
        }
        if (confirm==1){
            User deletedUser = Bank.bank.deleteUser(userId);
            this.say("Deleted user:");
            deletedUser.printPersonalDetails();
        }else{
            this.say("Cancel deleting user");
        }

    }

    public void managerFindUser(){
        
        User user = null;
        while(user==null){
            String userId = this.ask("Enter User ID to search: ");
            user = Bank.bank.findUser(userId);
        }
        user.printPersonalDetails();
        
    }
}
    

