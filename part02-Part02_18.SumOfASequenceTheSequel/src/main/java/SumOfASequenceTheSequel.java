
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First number?");    
        int lowerBound = Integer.valueOf(scanner.nextLine());

        System.out.print("Last number?");    
        int upperBound = Integer.valueOf(scanner.nextLine());
        int sum=0;
        if(lowerBound < upperBound) {
            for (int i = lowerBound; i <= upperBound; i++) {
                sum+=i;
            }
            System.out.println("The sum is " + sum);
        }
        
    }
}
