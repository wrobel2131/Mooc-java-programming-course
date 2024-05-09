
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container firstContainer = new Container();
        Container secondContainer = new Container();


        while (true) {
            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);

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
                    firstContainer.add(value);
                break;
                case "move":
                    int firstContainerValue = firstContainer.contains();
                    if(firstContainerValue > value) {
                        firstContainer.remove(value);
                        secondContainer.add(value);
                    } else {
                        int valueToRemove = firstContainerValue;
                        firstContainer.remove(value);
                        secondContainer.add(valueToRemove);
                    }
                    
                break;
                case "remove":
                    secondContainer.remove(value);
                break;
                default:
                break;
            }
            


            
            


        }
    }

}
