package corejava6.TaskAbstract_GadgetStore;

import java.util.Scanner;

public class TaskAbstract {
    public static void main(String[] args){
        Macbook macbookPro1 = new Macbook("MacBook Pro 1(M2)", 2022, 512, 16, 16, 1700);
        Macbook macbookAir1 = new Macbook("MacBook Air(M2)", 2022, 256, 8, 15, 1300);
        Macbook macbookAir2 = new Macbook("MacBook Air(M2)", 2022, 512, 8, 15, 1500);
        Macbook macbookPro2 = new Macbook("MacBook Pro", 2015, 512, 8, 13, 800);
        Laptop[] laptopList ={macbookPro1,macbookPro2,macbookAir1,macbookAir2};
        Laptop.laptopList = laptopList;
        Mouse mouse1 = new Mouse("Mouse 111","BrandA" , "Vertical", "Green", 20);
        Keyboard keyboard1 = new Keyboard("Amazing Keybord", "blue", "AAA", "Full-size", "retro", 100);
        Keyboard keyboard2 = new Keyboard("Office Keybord", "slient beige", "BBB", "Compact 75%", "White", 92);
        Keyboard keyboard3 = new Keyboard("traveler's Keybord", "brown", "AAA", "60%", "Black", 50);
        Headphone headphone = new Headphone("Noise canceling Headphone", "CCC", 1, "Red", 34);
        Accessory[] accessoriesList ={mouse1, keyboard1, keyboard2,keyboard3,headphone};
        Accessory.accessoriesList = accessoriesList;
        Microwave microwave1 = new Microwave("Kitchen microwave", 900, "MC makers", "black", 2023, 100);
        Microwave microwave2 = new Microwave("Kitchen microwave", 900, "MC makers", "black", 2023, 100);
        AirConditioner air1 = new AirConditioner("Super Cooling Air conditioner", "Split type", "Ice.corp", "White", 2023, 500);
        AirConditioner air2 = new AirConditioner("All-4-in-1 Air conditioner", "central control", "Ice.corp", "White", 2021, 810);
        HomeAppliance[] homeAppliancesList = {microwave1,microwave2,air1,air2};
        HomeAppliance.homeAppliancesList = homeAppliancesList;

        Customer customer1 = new Customer("jj", 300);
        Customer customer2 = new Customer("shopper", 500);
        Customer[] customers = {customer1, customer2};
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("================ Welcome to AAA Electronic Shop ==================");
        System.out.println("What's your user name? ");
        String username = scanner.nextLine();
        // Set up customer info
        Customer currCustomer=null;
        for (int i=0;i<customers.length;i++){
            if(customers[i].getName().equals(username)){currCustomer=customers[i];}
        }
        if (currCustomer==null){
            currCustomer=new Customer(username, 0);
            System.out.println("Are you a new customer? We made you a new account!");
        }
        double giftcard = currCustomer.getGiftCardBalance();
        System.out.println("You have giftcard amount of $"+giftcard);

        // Start shopping
        String userInput="";
        Product[] departmentList={};
        Product currProduct;
        do{
            if (!userInput.equalsIgnoreCase("exit")) {
                String bill ="";
                double totalPrice=0;
                int billCount = 0;
                do{
                    if(!userInput.equals("no")){
                        // load list for selected department
                        System.out.println("\nChoose a department to shop:");
                        System.out.println("\t1.Laptop (Mac..)\n\t2.Accessories (Headphones, mouse, keyboards..)\n\t3.Home Appliacnes (Mircrowave, Air conditioner, refrigerator..)\n");
                        String department = scanner.nextLine();
                        switch(department){
                            case "1":
                                departmentList = laptopList;
                                //display products
                                System.out.println("\n-------------------------------------------------------");
                                Laptop.printAlldescription();
                                System.out.println("-------------------------------------------------------");
                                break;
                            case "2":
                                departmentList = accessoriesList;
                                //display products
                                System.out.println("\n-------------------------------------------------------");
                                Accessory.printAlldescription();
                                System.out.println("-------------------------------------------------------");
                                break;
                            case "3":
                                departmentList = homeAppliancesList;
                                //display products
                                System.out.println("\n-------------------------------------------------------");
                                HomeAppliance.printAlldescription();
                                System.out.println("-------------------------------------------------------");
                                break;
                            
                            default:
                                System.out.println("Sorry, we don't have that department yet");
                        }

                        // Create bill for the customer
                        String billTitle =
                                    "\n\n\t<You have $"+giftcard+" in your giftcard>"
                                    +"\n\t================= "+username+"'s Bill ================="
                                    +"\n\tNo. \tItem \t    Price      Qty \tTotal"
                                    +"\n\t----------------------------------------------\n";
                        

                        System.out.println("\nWhich product do you want to buy?");
                        int productNum = Integer.parseInt(scanner.nextLine());
                        currProduct = departmentList[productNum-1];
                        System.out.println("\nHow many of ["+currProduct.getModelName()+"] do you want?");
                        int quantity = Integer.parseInt(scanner.nextLine());
                        double semiTotal = quantity* currProduct.getPrice();
                        totalPrice += semiTotal;
                        bill +=String.format("\t%d  %-18s $%.1f   %d   $%.1f", billCount+1, currProduct.getModelName(), currProduct.getPrice(), quantity, semiTotal)+"\n";

                        System.out.println(billTitle + bill 
                                +"\t----------------------------------------------\n"
                                +"\tYour total price is:           \t $"+totalPrice
                                +"\n\t=============================================");
                        System.out.println("\nDo you want to shop more? \n\tyes -> keep shopping \n\tno -> make payment\n ");
                        userInput = scanner.nextLine();
                    }
                    
                }while(!userInput.equals("no"));

                // yes -> make payment
                double payment = totalPrice-giftcard;
                String paymentTitle ="\n\t================= Payment ================="
                                    +"\n\tTotal Price: $"+totalPrice
                                        +"\n\tGift card: $"+giftcard
                                        +"\n\t--------------------------------------------";
                if (payment== 0.0){
                    System.out.println( paymentTitle
                                        +"\n\tPayment complete."
                                        +"\n\tYour gift card is exhausted!");
                    currCustomer.setGiftCardBalance(payment);
                }
                else if(payment > 0){
                    System.out.println(paymentTitle
                                        +"\n\tRemaining Payment: $"+payment+" needs to be paid.");
                    currCustomer.setGiftCardBalance(payment);
                }else{
                    System.out.println(paymentTitle
                                        +"\n\tPayment complete."
                                        +"\n\tRemaining Gift card: $"+(payment*-1));
                    currCustomer.setGiftCardBalance(payment*-1);
                }
                
                System.out.println("\nWould you like to exit or shop more? ('Type 'exit' to exit the store')");
                userInput = scanner.nextLine();
                }
            }while (!userInput.equalsIgnoreCase("exit"));
            System.out.println("--------------------------------------------------------------"
                                +"\n\t Thank you for shopping at AAA Electrionic Shop! ");
           
        scanner.close();
    }
}

