package corejava1;
import java.util.Scanner;

public class BakeryShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Price of each pastry
        double blackCurrentPrice = 5;
        double whiteForestPrice = 3;
        double chocolatePrice = 4;
        double redVelvetPrice = 4.5;

        // Get the number of pastries from the user
        System.out.print("Enter the number of Black Current pastries: ");
        int blackCurrentCount = scanner.nextInt();

        System.out.print("Enter the number of White Forest pastries: ");
        int whiteForestCount = scanner.nextInt();

        System.out.print("Enter the number of Chocolate pastries: ");
        int chocolateCount = scanner.nextInt();

        System.out.print("Enter the number of Red Velvet pastries: ");
        int redVelvetCount = scanner.nextInt();

        // Calculate the amount for each pastry
        double blackCurrentAmount = blackCurrentPrice * blackCurrentCount;
        double whiteForestAmount = whiteForestPrice * whiteForestCount;
        double chocolateAmount = chocolatePrice * chocolateCount;
        double redVelvetAmount = redVelvetPrice * redVelvetCount;

        // Calculate the total amount
        double totalAmount = blackCurrentAmount + whiteForestAmount + chocolateAmount + redVelvetAmount;

        // Print the itemized bill
        System.out.println("======================================");
        System.out.println("Menu Item           Price  qty payment");
        System.out.println("======================================");
        System.out.println("Black Current        "+ blackCurrentPrice +"   "+ blackCurrentCount +"   "+ blackCurrentAmount);
        System.out.println("White Forest         "+ whiteForestAmount +"  "+ whiteForestCount +"   "+ whiteForestAmount);
        System.out.println("Chocolate            " + chocolateAmount +"   "+ chocolateCount +"   "+ chocolateAmount);
        System.out.println("Red Velvet           " + redVelvetAmount +"   "+ redVelvetCount +"   "+ redVelvetAmount);
        System.out.println("======================================");
        System.out.println("Total Amount:                 " + totalAmount);
        System.out.println("======================================");

        scanner.close();
    }
}
