package corejava11.BankProjectV6;

import java.util.HashMap;
import java.util.Map;

public class BankAccounts {
    static Map<String, Person> bankMap;

    public BankAccounts(){
        User user1  = new User(1,"AB10001", "qwerty111", "J Jung","asdf@gmail.com",8000, "111 A street, A city, NY 1001", "111101234");
        User user2 = new User(1,"AB10002", "qwerty222", "Ji Jung","asdf@gmail.com",100500,  "222 B street, B city, NY 1002", "111101234");
        User user3 = new User(1,"AB10003", "qwerty333", "Jiy Jung","asdf@gmail.com",500,  "333 C street, C city, NY 1003", "111101234");
        User user4 = new User(1,"AB10004", "qwerty444", "Jiyeo Jung","asdf@gmail.com",123000,  "444 D street, A city, NY 1004", "111101234");
        User user5 = new User(1,"AB10005", "qwerty555", "Jiyeon Jung","asdf@gmail.com",750000,  "555 E street, A city, NY 1005", "111101234");
        User[] userAccounts={user1, user2, user3, user4, user5};
        BankAccounts.bankMap = new HashMap<>();
        for (User user : userAccounts) {
            bankMap.put(user.getId(), user);
        }
        Manager company1 = new Manager(2,"BUS1001", "qwerty111","Manager Jiyeon Jung", "asdf@gmail.com","111 A street, A city, NY 1001", "+111101234");
        Manager company2 = new Manager(2,"BUS1002", "qwerty222","J Jung","asdf@gmail.com", "111 A street, A city, NY 1001", "+111101234");
        Manager company3 = new Manager(2,"BUS1003", "qwerty111","J Jung","asdf@gmail.com", "111 A street, A city, NY 1001", "+111101234");
        Manager company4 = new Manager(2,"BUS1004", "qwerty111","J Jung", "asdf@gmail.com","111 A street, A city, NY 1001", "+111101234");
        Manager company5 = new Manager(2,"BUS1005", "qwerty111","J Jung", "asdf@gmail.com","111 A street, A city, NY 1001", "+111101234");
        Manager[] managerAccounts = {company1, company2, company3, company4, company5};
        // Map<String, Manager> managerMap = new HashMap<>();
        for (Manager manager : managerAccounts) {
            bankMap.put(manager.getId(), manager);
        }
    }
    
    public Map<String,Person> getBankMap(){
        return BankAccounts.bankMap;
    }
    
    public int countUsers(){
        int userCount = 0;
        for (Object obj : BankAccounts.bankMap.values()) {
            if (obj instanceof User) {
                userCount++;
            }
        }
        return userCount;
    }

    public void printAllUserInfos(){
        for (Person person : bankMap.values()) {
            if (person instanceof User) {
                person.printPersonalDetails(); 
            }
        }   
    }
    
    public Person authenticate(String id, String password, int personType) {
        
        Person person=bankMap.containsKey(id)/*&& bankMap.get(id).getType()==personType*/? bankMap.get(id):null;
        
        if (person != null){
            if (person.getPassword().equals(password)) {
                System.out.println("Succefully logged in with ["+id+"]");
                return person;
            }else{
                System.out.println("Wront password");
            }
        }
        System.out.println("There is no such id as: "+id);
        return person;
    }
    
    public void addNewUser(User user){
        BankAccounts.bankMap.put(user.getId(), user);
        System.out.println("new user added: ");
        user.printPersonalDetails();
    }

    public void addNewManager(Manager manager){
        BankAccounts.bankMap.put(manager.getId(), manager);
    }
    public User findUser(String id){
        User user=  (User)BankAccounts.bankMap.get(id);
        if(user==null){
            System.out.println("there is no such id");
        }
        return user;
    }
    public boolean updateUser(String id, int option, String changeTo){
        User user = (User)BankAccounts.bankMap.get(id);
        switch(option){
            case 1:
                user.setEmail(changeTo);
                break;
            case 2:
                user.setAddress(changeTo);
                break;
            case 3:
                user.setPassword(changeTo);
            default:
                System.out.println("There is no such option");
                return false;
        }
        return true;
    }
    public User deleteUser(String id){
        return (User)BankAccounts.bankMap.remove(id);
    }
    
}
