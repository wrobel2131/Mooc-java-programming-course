
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give a string:");
        String userStringInput = scan.nextLine();
        System.out.println("Give an integer:");
        int userIntegerInput = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double userDoubleInput = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean userBooleanInput = Boolean.valueOf(scan.nextLine());
        System.out.println("You gave the string " + userStringInput);
        System.out.println("You gave the integer " + userIntegerInput);
        System.out.println("You gave the double " + userDoubleInput);
        System.out.println("You gave the boolean " + userBooleanInput);
        

        // Write your program here

    }
}
