package corejava2;

import java.util.Scanner;

public class IcecreamShop {
    public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);
        String userInput = "";
        String type ="";
        String flavor = "";
        int price = 0;
        //String input2 = "";
        int quantity = 0;
        int totalPrice = 0;
        int count = 0;
        String billStr ="";

        
        System.out.println("Welcome to the Icecream SHop");
        System.out.println("Hello, What's your name?");
        String name = scanner.nextLine();
        System.out.println("Hi "+ name + "! How are you today? ");
        String feeling = scanner.nextLine();
        System.out.print("Great! ");

        while (!userInput.equalsIgnoreCase("no")) {
            System.out.println("What would you like to order? (Say \'no\' to exit the shop) \n1. Scopes \n2. Exquite: ");
            userInput = scanner.nextLine().toLowerCase();
            String bill = "";
            System.out.println("you said "+userInput);
            switch (userInput){
                case "1":
                case "scope":
                    type = "scope";
                    System.out.println("Which flavor do you want? "+
                                           " \n1. Vanilla "
                                           + "\n2. Chocolate "
                                           +" \n3. Strawberry" 
                                           +"\n4. Mango");
                    userInput = scanner.nextLine().toLowerCase();
                    
                    switch (userInput){
                        case "1":
                        case "vanilla":
                            flavor="Vanilla";
                            price = 100;
                            break;
                        case "2":
                        case "chocolate":
                            flavor="Chocolate";
                            price = 150;
                            break;
                        case "3":
                        case "strawberry":
                            flavor="Strawberry";
                            price = 150;
                            break;
                        case "4":
                        case "mango":
                            flavor="Mango";
                            price = 200;
                            break;
                        default:
                            flavor ="";
                            price =0;
                    }
                    break;
                case "2":
                case "exquite":
                    type = "Exquite";
                    System.out.println("Which flavor do you want? "+
                                           " \n1. Green tea "
                                           + "\n2. Black tea "
                                           +" \n3. Mint" 
                                           +"\n4. Herb");
                    userInput = scanner.nextLine().toLowerCase();
                    
                    switch (userInput){
                        case "1":
                        case "greentea":
                            flavor="Green tea";
                            price = 100;
                            break;
                        case "2":
                        case "blacktea":
                            flavor="Black tea";
                            price = 150;
                            break;
                        case "3":
                        case "mint":
                            flavor="Mint";
                            price = 150;
                            break;
                        case "4":
                        case "herb":
                            flavor="Herb";
                            price = 200;
                            break;
                        default:
                            flavor ="";
                            price =0;
                    }
                    break;
                case "no":
                case "n":
                case "exit":
                    userInput = "no";
                    break;
                default:
                    System.out.println("I dont understand..");
                    continue;
            }
            System.out.println("How many do you want?");
            quantity = scanner.nextInt();
            int semiTotal = quantity*price;
            count ++;
            billStr += count + "   "+ flavor + "   "+ price + "   "+ quantity + "   "+ semiTotal +"\n";
            totalPrice += semiTotal;
            System.out.println("No.  Flavor  Price  Qty  Total Price");
            System.out.println(billStr);
            System.out.println("Your total price is:     "+totalPrice);
            userInput="";
            type=""; flavor=""; price=0;quantity=0;
            
        }
        
        System.out.println("Exiting the program.");
        scanner.close();
    }
    
}
