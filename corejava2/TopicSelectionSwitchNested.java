package corejava2;

import java.util.Scanner;

public class TopicSelectionSwitchNested {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a topic (enter name or its number): \n1.JS \n2.Java \n3.RDBMS");
        
        String topic = scanner.next().toLowerCase().replaceAll(" ", "");;
        String subTopic;
        String subtopicInput;
        
        switch (topic) {
            case "js":
            case "1":
                topic="JS";
                System.out.println("Choose JS subtopic (enter name or its number): \n1.JS variables\n2.ES6\n3.Premises");
                subtopicInput = scanner.next().toLowerCase().replaceAll(" ", "");;
                switch (subtopicInput){
                    case "jsvariables":
                    case "1":
                        subTopic = "JS variables";
                        break;
                    case "es6":
                    case "2":
                        subTopic = "ES6";
                        break;
                    case "premises":
                    case "3":
                        subTopic = "Premises";
                        break;
                    default:
                        subTopic = "";
                }
                break;
            case "java":
            case "2":
                topic="Java";
                System.out.println("Choose Java subtopic (enter name or its number): \n1.Core Java\n2.Multi Threading\n3.Swing");
                subtopicInput = scanner.next().toLowerCase().replaceAll(" ", "");;
                switch (subtopicInput){
                    case "corejava":
                    case "1":
                        subTopic = "Core Java";
                        break;
                    case "multithreading":
                    case "2":
                        subTopic = "Multi Threading";
                        break;
                    case "swing":
                    case "3":
                        subTopic = "Swing";
                        break;
                    default:
                        subTopic = "";
                }
                break;
            case "rdbms":
            case "3":
                topic="RDBMS";
                System.out.println("Choose RDBMS subtopic (enter name or its number): \n1.SQL\n2.Oracle\n3.mySql");
                subtopicInput = scanner.next().toLowerCase().replaceAll(" ", "");;
                switch (subtopicInput){
                    case "sql":
                    case "1":
                        subTopic = "SQL";
                        break;
                    case "oracle":
                    case "2":
                        subTopic = "Oracle";
                        break;
                    case "mysql":
                    case "3":
                        subTopic = "mySql";
                        break;
                    default:
                        subTopic = "";
                }
                break;
            
            default:
                subTopic = "";
                break;
            }
            if(subTopic==""){
                System.out.println("There is no such topic as " + topic);
            }else{
                System.out.println("You selected topic \"" + topic +"\" and subtopic \""+ subTopic+"\".");
            }
        scanner.close();
    }
}
