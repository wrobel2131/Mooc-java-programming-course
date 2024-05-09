
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
    }
    
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        for(Integer num: numbers) {
            if(num >= lowerLimit && num <= upperLimit) {
                System.out.println(num);
            }
        }
    }
}
