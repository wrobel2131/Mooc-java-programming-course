
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        List<Integer> list = new ArrayList<>();
        while(true) {
            int num = Integer.valueOf(scanner.nextLine());
            if(num == 9999) {
                break;
            }
            list.add(num);
        }
        
        if(list.isEmpty()) {
            return;
        }
        
        int min = list.get(0);
        List<Integer> smallestIndicies = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) < min) {
                min = list.get(i);
                smallestIndicies.add(i);
            }
        }
        System.out.println("Smallest number: " + min);
        for (Integer index: smallestIndicies) {
            System.out.println("Found at index: " + index);
        }

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        
    }
}
