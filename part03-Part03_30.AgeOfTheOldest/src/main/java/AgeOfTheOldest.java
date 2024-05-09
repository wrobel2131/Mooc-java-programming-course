
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
        while(true) {
            String fixedInput = scanner.nextLine();
            if(fixedInput.isEmpty()) {
                break;
            }
            
            String[] nameAndAge = fixedInput.split(",");
            int age = Integer.valueOf(nameAndAge[1]);
            if(oldest < age) {
                oldest = age;
            }
                  
        }
        System.out.println("Age of the oldest: " + oldest);

    }
}
