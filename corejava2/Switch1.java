package corejava2;
import java.util.Scanner;

public class Switch1 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter Month \n1.Jan\n2.Feb\n ... \n12.Dec");
    
    int month = scanner.nextInt();
    String season;
    
    switch (month) {
        
        case 12:
        case 1:
        case 2:
            season = "Winter";
            break;
        case 3:
        case 4:
        case 5:
            season= "Spring";
            break;
        case 6:
        case 7:
        case 8:
            season="Summer";
            break;
        case 9:
        case 10:
        case 11:
            season="Fall";
            break;
        default:
            season = "Invalid Month";
            break;
    }
    System.out.println("Month "+ month + " falls in "+ season);
    scanner.close();
    }
}
