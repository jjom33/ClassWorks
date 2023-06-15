package corejava1;
import java.util.Scanner;

public class PhotoFrame {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of Photo frame side1: ");
        int side1 = scanner.nextInt();
        System.out.print("Enter length of Photo frame side2: ");
        int side2 = scanner.nextInt();

        if(side1==side2){
            System.out.println("The frame is a square");
        }
        else{
            System.out.println("The frame is a rectangle");
        }
        scanner.close();
    }
}
