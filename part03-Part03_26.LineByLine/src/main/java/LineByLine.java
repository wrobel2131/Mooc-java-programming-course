
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            String input = scanner.nextLine();
            if(input.isEmpty()) {
                break;
            }
            String[] splitInput = input.split(" ");
            for (int i = 0; i < splitInput.length; i++) {
                System.out.println(splitInput[i]);
            }

        }

        

    }
}
