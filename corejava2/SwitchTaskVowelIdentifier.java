package corejava2;

import java.util.Scanner;

public class SwitchTaskVowelIdentifier {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character (Lowercase or Uppercase): ");
        
        String input = scanner.next();
        char character = input.toLowerCase().charAt(0);
        String characterType;
        if(!Character.isLetter(character)){
            System.out.println(character + " is not a character.");
        }
        else{
            switch (character) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                characterType = "Vowel";
                break;
            
            default:
                characterType = "Consonant";
                break;
            }
            System.out.println(input + " is a "+ characterType);
        }
        scanner.close();
    }
}
