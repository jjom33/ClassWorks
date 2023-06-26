package corejava10.BankProjectV5;

public class ChatBot extends Conversation{
    AuthenticationClass auth;
    BankService bankService;
    int personType;
    Person person;
    
    public ChatBot(AuthenticationClass auth){
        this.auth = auth;
    }
    
    public void authentication(){
        
        while (this.personType == 0){
            try{
            this.personType= Integer.parseInt(this.ask("What are you?\n1. Personal User\n2. Manager"));
        } catch(NumberFormatException e){
            System.out.println("Please enter number");
        }
        }
        
        String inputId =this.ask("What is your <Id>?");
        String inputPassword = this.ask("What is your <Password>?");
        this.person = auth.authenticate(inputId,inputPassword, this.personType);
    }
    
    public void setBankServiceForChatBot(){
        if (this.personType==1){
            this.bankService = new UserBankService((User)this.person);
        }else{
            System.out.println("Manager Service: ");
            this.bankService = new ManagerBankService((Manager)this.person);
        }
    }

    public void chatBotStart(){
        this.authentication();
        this.setBankServiceForChatBot();
        try{
            this.person.printPersonalDetails();
            this.bankService.showOptions();
        } catch(NullPointerException e){
            System.out.println("Please restart the program with correct user information");
        }
    }

}
