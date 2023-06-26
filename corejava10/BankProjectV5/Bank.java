package corejava10.BankProjectV5;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    Map<String, Person> bankMap;

    public Bank(){
        User user1  = new User(1,"AB10001", "qwerty111", "J Jung",8000, "111 A street, A city, NY 1001", "111101234");
        User user2 = new User(1,"AB10002", "qwerty222", "Ji Jung",100500,  "222 B street, B city, NY 1002", "111101234");
        User user3 = new User(1,"AB10003", "qwerty333", "Jiy Jung",500,  "333 C street, C city, NY 1003", "111101234");
        User user4 = new User(1,"AB10004", "qwerty444", "Jiyeo Jung",123000,  "444 D street, A city, NY 1004", "111101234");
        User user5 = new User(1,"AB10005", "qwerty555", "Jiyeon Jung",750000,  "555 E street, A city, NY 1005", "111101234");
        User[] userAccounts={user1, user2, user3, user4, user5};
        this.bankMap = new HashMap<>();
        for (User user : userAccounts) {
            bankMap.put(user.getId(), user);
        }
        Manager company1 = new Manager(2,"BUS1001", "qwerty111","Manager Jiyeon Jung", "111 A street, A city, NY 1001", "+111101234");
        Manager company2 = new Manager(2,"BUS1002", "qwerty222","J Jung", "111 A street, A city, NY 1001", "+111101234");
        Manager company3 = new Manager(2,"BUS1003", "qwerty111","J Jung", "111 A street, A city, NY 1001", "+111101234");
        Manager company4 = new Manager(2,"BUS1004", "qwerty111","J Jung", "111 A street, A city, NY 1001", "+111101234");
        Manager company5 = new Manager(2,"BUS1005", "qwerty111","J Jung", "111 A street, A city, NY 1001", "+111101234");
        Manager[] managerAccounts = {company1, company2, company3, company4, company5};
        // Map<String, Manager> managerMap = new HashMap<>();
        for (Manager manager : managerAccounts) {
            bankMap.put(manager.getId(), manager);
        }
    }
    
    public Map<String,Person> getBankMap(){
        return this.bankMap;
    }
    
    public int countUsers(){
        int userCount = 0;
        for (Object obj : this.bankMap.values()) {
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
        this.bankMap.put(user.getId(), user);
        System.out.println("new user added: ");
        user.printPersonalDetails();
    }

    public void addNewManager(Manager manager){
        this.bankMap.put(manager.getId(), manager);
    }
    
}
