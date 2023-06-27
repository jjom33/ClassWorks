package corejava11.BankProjectV6;

import java.util.Scanner;

public class Conversation {
    private Scanner scanner;
    public Conversation() {
        scanner = new Scanner(System.in);
    }
    public void say(String message) {
        System.out.println(message);
    }

    public String ask(String question) {
        System.out.println("\n"+question);
        return scanner.nextLine();
    }

    public void greeting(){
        System.out.println("<<AB BANK>>");
        System.out.println("Welcome to AB BANK!");
    }
    
}