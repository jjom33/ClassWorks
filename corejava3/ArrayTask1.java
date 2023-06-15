package corejava3;
import java.lang.reflect.Array;
import java.util.Scanner;
public class ArrayTask1 {
    public static void main(String[] args ){
        String[] monthNames = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Whats the number of your Birth Month?\n"
                            +"1. Jan\n"
                            +"2. Feb\n"
                            +"3. Mar\n"
                            +"4. Apr\n"
                            +"5. May\n"
                            +"6. Jun\n"
                            +"7. Jul\n"
                            +"8. Aug\n"
                            +"9. Sep\n"
                            +"10. Oct\n"
                            +"11. Nov\n"
                            +"12. Dec\n");
        int month = scanner.nextInt();
        System.out.println("Your birth month is "+monthNames[month-1]);
        scanner.close();
    }
}
