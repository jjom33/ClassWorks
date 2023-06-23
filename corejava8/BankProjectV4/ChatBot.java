package corejava8.BankProjectV4;

public class ChatBot extends Conversation{
    AuthenticationClass auth;
    BankService bankService;
    String personType;
    Person person;
    User user;
    Manager manager;
    
    public ChatBot(AuthenticationClass auth){
        this.auth = auth;
    }
    public void authentication(){
        this.personType= this.ask("What are you?\n1. Personal User\n2. Manager");
        String inputId =this.ask("What is your <Id>?");
        String inputPassword = this.ask("What is your <Password>?");
        this.person = auth.authenticate(inputId,inputPassword,this.personType);
        //Type casting
        if (this.personType.equals("1")) {
            this.user = (User) this.person;
        } else {
            this.manager = (Manager) this.person;
        }

    }
    
    public void setBankServiceForChatBot(){
        if (this.personType.equals("1")){
            this.bankService = new UserBankService(this.user);
        }else{
            this.bankService = new ManagerBankService(this.manager);
        }
    }

    public void chatBotStart(){
        this.person.printPersonalDetails();
        this.bankService.showOptions();
    }

}
