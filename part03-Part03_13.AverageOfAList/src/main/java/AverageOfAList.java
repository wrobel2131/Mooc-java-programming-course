
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        List<Integer> list = new ArrayList<>();
        while(true) {
            int num = Integer.valueOf(scanner.nextLine());
            if(num == -1) {
                break;
            }
            list.add(num);
        }
        int sum = 0;
        for(Integer item: list) {
            sum += item;
        }
        
        System.out.println("Average: " + (1.0*sum/list.size()));
        
    }
}
