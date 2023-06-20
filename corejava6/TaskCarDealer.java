package corejava6;
import java.util.Scanner;
public class TaskCarDealer {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        BMW x1 = new BMW("x1");
        BMW x2 = new BMW("x2");
        BMW x3 = new BMW("x3");
        BMW[] bmwList = {x1,x2,x3};
        x2.updateDailySale(2, 1);
        x3.updateDailySale(3, 13);

        BMW currCar;
        System.out.println("What is your name: \n1.Person1 \n2.Person2 \n3.Person3");
        int salesPersonNum = scanner.nextInt();
                
                // System.out.println("---Sales For Today--- \nEnter car brand: ");
                // String carBrand = scanner.nextLine();
        String salesPersonInput="";
        do{
            if (!salesPersonInput.equalsIgnoreCase("no")) {
                        System.out.println("What is the model?\n1.X1\n2.X2\n3.X3");
                        int carIndex=scanner.nextInt();
                        currCar = bmwList[carIndex-1];
                            
                        System.out.println("How many "+currCar.getModelName()+ " this you sell today?: ");
                        int numOfCarSold = scanner.nextInt();
                        currCar.updateDailySale(salesPersonNum, numOfCarSold);
                        currCar.updateMonthlySale();
                        // currCar.printDailySale();
                        scanner.nextLine();
                        System.out.println("Do you want to enter more sales? (yes/no)");
                        salesPersonInput = scanner.nextLine();
                    }
            }while (!salesPersonInput.equalsIgnoreCase("no"));
        System.out.println("=============== Total Car Sales Report ===============");
        for(int i=0; i<bmwList.length;i++){
            bmwList[i].printDailySale();
            System.out.println();
        }    
        scanner.close();
    }
}
