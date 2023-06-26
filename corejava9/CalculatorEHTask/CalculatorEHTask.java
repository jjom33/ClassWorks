package corejava9.CalculatorEHTask;
import java.util.InputMismatchException;
import java.util.Scanner;;
public class CalculatorEHTask {
    CalculatorEHTask(){   
    }

    public void calculate(){
        Scanner scanner = new Scanner(System.in);
        String userInput="";
        do{
            if(!userInput.equals("exit")){
                try{
                    System.out.println("\nEnter 1: ");
                    int num1 = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter 2: ");
                    int num2 = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter operation (+, -, *, /, %): ");
                    String operation = scanner.nextLine();

                    double result=0;
                    switch(operation){
                        case "+":
                            result = num1 + num2;
                            break;
                        case "-":
                            result = num1- num2;
                            break;
                        case "*":
                            result = num1*num2;
                            break;
                        case "/":
                            result = num1/ num2;
                            break;
                        case "%":
                            result = num1%num2;
                            break;
                        default:
                            throw new InputMismatchException("There is no such operation");
                    }
                    System.out.println("calculation result: "+num1+" "+operation+" "+num2+" = "+result);
                    System.out.println("\nContinue another calculation? (yes / exit)");
                    userInput =scanner.nextLine();
                } catch (ArithmeticException |ArrayIndexOutOfBoundsException|InputMismatchException |NumberFormatException e){
                    System.out.println("!Exception caught: \n\t"+e+"\nPlease try again");
                } 
            }
        }while(!userInput.equals("exit"));
        scanner.close();
    }
        
        
     
}
