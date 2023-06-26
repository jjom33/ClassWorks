package corejava10.BankProjectV5;

import java.util.Map;

public class AuthenticationClass implements Authentication{
    static Bank bank;
    static Map<String,Manager> managerAccounts;
    public AuthenticationClass(){
        AuthenticationClass.bank = new Bank();
    }

    public Person authenticate(String id, String password, int personType){
        Person person = AuthenticationClass.bank.authenticate(id, password, personType);
        
       if (person == null){
            System.out.println("Please try again with correct information.");
        }return person;
    }
}
