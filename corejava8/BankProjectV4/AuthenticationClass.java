package corejava8.BankProjectV4;

public class AuthenticationClass implements Authentication{
    static User[] userAccounts;
    static Manager[] managerAccounts;
    static int userListLength = 5;
    public AuthenticationClass(){
        User user1  = new User("AB10001", "qwerty111", "J Jung",8000, "111 A street, A city, NY 1001", "111101234");
        User user2 = new User("AB10002", "qwerty222", "Ji Jung",100500,  "222 B street, B city, NY 1002", "111101234");
        User user3 = new User("AB10003", "qwerty333", "Jiy Jung",500,  "333 C street, C city, NY 1003", "111101234");
        User user4 = new User("AB10004", "qwerty444", "Jiyeo Jung",123000,  "444 D street, A city, NY 1004", "111101234");
        User user5 = new User("AB10005", "qwerty555", "Jiyeon Jung",750000,  "555 E street, A city, NY 1005", "111101234");
        User[] userAccounts={user1, user2, user3, user4, user5};
        Manager company1 = new Manager("BUS1001", "qwerty111","Manager Jiyeon Jung", "111 A street, A city, NY 1001", "+111101234");
        Manager company2 = new Manager("BUS1002", "qwerty222","J Jung", "111 A street, A city, NY 1001", "+111101234");
        Manager company3 = new Manager("BUS1003", "qwerty111","J Jung", "111 A street, A city, NY 1001", "+111101234");
        Manager company4 = new Manager("BUS1004", "qwerty111","J Jung", "111 A street, A city, NY 1001", "+111101234");
        Manager company5 = new Manager("BUS1005", "qwerty111","J Jung", "111 A street, A city, NY 1001", "+111101234");
        Manager[] managerAccounts = {company1, company2, company3, company4, company5};
        
        AuthenticationClass.userAccounts=userAccounts;
        AuthenticationClass.managerAccounts=managerAccounts;
    }

    public Person authenticate(String id, String password, String personType){
        Person person = null;
        Person[] personList=null;
        if (personType.equals("1")){
            personList = AuthenticationClass.userAccounts;
        }else{
            personList = AuthenticationClass.managerAccounts;
        }
        for (Person p : personList) {
                if (p.getId().equals(id)) {
                    if (p.getPassword().equals(password)){
                        person = p;
                        System.out.println("\n[You are now logged into: "+ id+"]");
                        break;
                    }
                    else{
                        System.out.println("\nThat is not a correct password");
                        break;
                    }
                }
        }
       if (person == null){
            System.out.println("Please try again with correct information.");
        }return person;
    }
    
    public static void addNewUser(User user){
        User[] newUserAccounts= new User[AuthenticationClass.userListLength+1];
        //copy to new list
        for (int i=0;i<AuthenticationClass.userListLength;i++){
            newUserAccounts[i]=AuthenticationClass.userAccounts[i];
        }
        newUserAccounts[AuthenticationClass.userListLength] = user;
        AuthenticationClass.userAccounts = newUserAccounts;
        AuthenticationClass.userListLength +=1;
        System.out.println("new user added: ");
        user.printPersonalDetails();

    }
}
