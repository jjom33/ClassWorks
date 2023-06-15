package corejava2;

import java.util.Scanner;

public class UserInputInfiniteTask {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String userInput = "";

        for (;;) {
            System.out.println("Do you want to continue? (y / n):");
            userInput = scanner.nextLine().toLowerCase();

            if (userInput.equals("n")) {
                break;
            }
            else if (userInput.equals("y")) {
                System.out.println("Java is Easy to Learn");
            } else {
                System.out.println("Invalid input! Please type 'y' for yes or 'n' for no.");
            }
        }
        scanner.close();
    }
    
}
