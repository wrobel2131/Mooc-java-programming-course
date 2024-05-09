
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstContainer = 0;
        int secondContainer = 0;


        while (true) {
            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] inputParts = input.split(" ");
            String command = inputParts[0];
            int value = Integer.parseInt(inputParts[1]);
            if(value < 0) {
                continue;
            }
            
            switch(command) {
                case "add":
                    if(value + firstContainer > 100) {
                        firstContainer = 100;
                    } else {
                        firstContainer += value;
                    }
                break;
                case "move":
                    int liquidToMove = value;
                    if(firstContainer < value) {
                        liquidToMove = firstContainer;
                        firstContainer = 0;
                    } else {
                        firstContainer-=value;
                    }

                    if(secondContainer + liquidToMove > 100) {
                        secondContainer = 100;
                    } else {
                        secondContainer += liquidToMove;
                    }
                break;
                case "remove":
                    if(secondContainer < value) {
                        secondContainer = 0;
                    } else {
                        secondContainer -= value;
                    }
                break;
                default:
                break;
            }
            


            
            

        }
    }
    

}
