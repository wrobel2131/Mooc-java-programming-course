
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while(true) {
            String input = scanner.nextLine();
            if(input.isEmpty()) {
                break;
            }
            String[] splitInput = input.split(" ");
            int splitInputLength = splitInput.length;
            System.out.println(splitInput[splitInputLength-1]);
        }
    }
}
