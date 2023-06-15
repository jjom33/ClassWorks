package corejava1;
import java.util.Scanner;

public class TriangleIdentifier {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length of side1: ");
        int side1 = scanner.nextInt();
        System.out.print("Enter length of side2: ");
        int side2 = scanner.nextInt();
        System.out.print("Enter length of side3: ");
        int side3 = scanner.nextInt();
        
        int sideSum = side1+side2+side3;
        int longestSide = Math.max(Math.max(side1, side2), side3);
        
        if(sideSum - longestSide > longestSide){ //condition for a triangle
            if((side1==side2)&&(side1==side3)){
                System.out.println("The triangle is a Equilateral");
            }
            else if((side1==side2)||(side2==side3)||(side1==side3)){
                System.out.println("The triangle is a Isosceles");
            }
            else{
                System.out.println("The triangle is a Scalene");
            }
        }
        else{
            System.out.println("This is not a triangle");
        }
        

        scanner.close();
    }
}
