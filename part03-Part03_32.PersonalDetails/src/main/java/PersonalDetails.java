
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String longestName = "";
        int count = 0;
        int sum =0; 
        while(true) {
            String input = scanner.nextLine();
            if(input.isEmpty()) {
                break;
            }
            String[] nameAndBirth = input.split(","); 
            String name = nameAndBirth[0];
            int birth = Integer.valueOf(nameAndBirth[1]);
            if(longestName.length() < name.length()) {
                longestName = name;
            }
            sum+=birth;
            count++;
        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth yeqrs: " + (1.0*sum/count));
    }
}
