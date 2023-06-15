package corejava2;

import java.util.Scanner;

public class IcecreamShop {
    public static void main(String[] args){
        String userInput = "";
        String type;
        String flavor = "";
        int price = 0;
        int quantity = 0;

        int totalPrice = 0;
        int count = 0;
        String billStr ="";

        Scanner scanner = new Scanner(System.in);
        // Greeting 
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("-------------------Welcome to the ICECREAM SHOP--------------------------");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Hello, What's your name?");
        String name = scanner.nextLine();
        System.out.println("Hi "+ name + "! How are you today? ");
        scanner.nextLine();
        System.out.println("Ah, that's why you are here for some icecream! \nHope you are ready!!");
        scanner.nextLine();
        System.out.println("-------------------------------------------------------------------------");
        System.out.print("Cool cool! ");

        while (!userInput.equalsIgnoreCase("no")) {
            // Ask for Type of Icecream
            System.out.println("What would you like to order? (Say \'no\' to exit the shop) \n1. Scopes \n2. Exquisite\n");
            userInput = scanner.nextLine().toLowerCase();

            // Handle Input for each Type of Icecream: Ask for Flavor
            switch (userInput){
                case "1":
                case "scope":
                    type = "scope";
                    System.out.println("\nWhich flavor do you want? "+
                                            "\n1. Vanilla     $100"
                                           +"\n2. Chocolate   $150"
                                           +"\n3. Strawberry  $150" 
                                           +"\n4. Mango       $200\n");
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
                case "Exquisite":
                    type = "Exquisite";
                    System.out.println("Which flavor do you want? "+
                                            "\n1. Green tea  $100"
                                           +"\n2. Black tea  $150"
                                           +"\n3. Mint       $150" 
                                           +"\n4. Herb       $200\n");
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
                    System.out.println("Um..." +name+ "..? I dont understand..");
                    continue;
            }
            if(userInput != "no"){
                // Ask for quantity of the icecream
                System.out.println("How many do you want?\n");
                quantity = scanner.nextInt();
                scanner.nextLine();

                // calculate, add to the bill
                int semiTotal = quantity*price;
                count ++;

                String formattedString = String.format("%d  %-12s $%d   %d   $%d", count, flavor, price, quantity, semiTotal);
                billStr += formattedString +"\n";
                totalPrice += semiTotal;
                System.out.println("==================================================");
                System.out.println("No.  Flavor    Price  Qty  Amount");
                System.out.println("--------------------------------------------------");
                System.out.println(billStr);
                System.out.println("--------------------------------------------------");
                System.out.println("Your total price is:       $"+totalPrice);
                System.out.println("==================================================");
            }
            
            
        }
        System.out.println("----------------------------------------------------------------");
        System.out.println("Good bye "+name +"! Come again :)");
        scanner.close();
    }
    
}
