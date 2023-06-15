package corejava3;
import java.util.Scanner;
public class ArrayTask2 {
    public static void main(String[] args){
        String[] subjectNames = {"Java", "Python", "Web", "C", "CPP", "Spring boot"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student Name:");
        String student_name = scanner.nextLine();
        System.out.println("Enter Student ID:");
        String student_id = scanner.nextLine();
        System.out.println("Enter the branch:");
        String branch = scanner.nextLine();
        System.out.println("Enter the sem:");
        String sem = scanner.nextLine();

        String[] studentRecord = {student_name, student_id, branch, sem};

        int[] scores = new int[subjectNames.length];
        for(int i=0;i<subjectNames.length;i++){
            System.out.println("Enter " + student_name + "'s "+ subjectNames[i] +" score:");
            int score = scanner.nextInt();
            scores[i] = score;
        }

        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i]; // Add each score to the sum
        }

        double average = (double) sum / scores.length;
        String grade ="";
        if (90 <= average && average <= 100) {
            grade = "A++";
        }else if(80 <= average  && average < 90){
            grade = "A+";
        }else if(70 <= average  && average < 80){
            grade = "B++";
        }else if(60 <= average  && average < 70){
            grade = "B+";
        }else if(50 <= average  && average < 60){
            grade = "C";
        }else{
            grade = "E";
        }

        
        System.out.println("--------------------------------------");
        System.out.println("CIT REPORT CARD");
        System.out.println("--------------------------------------");
        // String studentInfo = "";
        for (int i = 0; i < studentRecord.length; i++) {
            System.out.print(studentRecord[i] + "   ");
        }
        System.out.println("\n--------------------------------------");
        for (int i = 0; i < scores.length; i++) {
            System.out.println((i+1) +". "+subjectNames[i] + "   "+scores[i]);
        }
        System.out.println("--------------------------------------");
        System.out.println("Total: "+sum+"   Average: "+((int)(average*10))/10.0+"   Grade: "+grade);
        System.out.println("--------------------------------------");
        scanner.close();
    }
}
