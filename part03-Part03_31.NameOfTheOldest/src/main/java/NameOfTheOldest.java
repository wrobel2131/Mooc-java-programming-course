
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int oldestAge = 0;
        String oldestName = "";
        while(true) {
            String fixedInput = scanner.nextLine();
            if(fixedInput.isEmpty()) {
                break;
            }
            
            String[] nameAndAge = fixedInput.split(",");
            int age = Integer.valueOf(nameAndAge[1]);
            if(oldestAge < age) {
                oldestAge = age;
                oldestName = nameAndAge[0];
            }
                  
        }
        System.out.println("Name of the oldest: " + oldestName);
    }
}
