package corejava2;

import java.util.Scanner;

public class While {
    public static void main(String[] args){
        

        // Prints number from 10 to 20
        System.out.println("1. Prints number from 10 to 20");
        int num = 10;
        while(num<21){
            System.out.print(num + " ");
            num++; 
        }

        // Print even numbers only from range 100 to 120
        System.out.println("\n\n2. Print even numbers only from range 100 to 120");
        int num2 = 100;
        while(num2 < 121){
            if((num2%2==0)){
                System.out.print(num2 + " ");
            }
            num2++;
        }

        // Find the mid point number of two given numbers
        System.out.println("\n\n3. Find the mid point number of two given numbers");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the start number: "); 
        int input1 = scanner.nextInt(); 
        System.out.println("Enter the end number: "); 
        int input2 = scanner.nextInt(); 
        while(input1 < input2){
            input1++;
            input2--;
        }
        System.out.println("mid point is: "+input1);
        scanner.close();
    }
}
