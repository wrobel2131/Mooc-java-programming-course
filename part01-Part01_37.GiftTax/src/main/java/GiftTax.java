
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int giftValue = Integer.valueOf(scan.nextLine());
        double giftTax = calculateGiftTax(giftValue);
        if(giftTax == 0) {
            System.out.println("No tax!");
        } else {
            System.out.println("Tax: " + giftTax);
        }
        
        
    }
    
    private static double calculateGiftTax(int giftValue) {
        double giftTax = 0.0;
        if(giftValue > 1000000) {
            giftTax = 142100 + (giftValue - 1000000) * 0.17;
        } else if(giftValue >= 200000) {
            giftTax = 22100 + (giftValue - 200000) * 0.15;

        } else if(giftValue >= 55000) {
            giftTax = 4700 + (giftValue - 55000) * 0.12;

        } else if(giftValue >= 25000) {
            giftTax = 1700 + (giftValue - 25000) * 0.1;

        } else if(giftValue >= 5000) {
            giftTax = 100 + (giftValue - 5000) * 0.08;

        } else {
            giftTax = 0.0;
        }
        return giftTax;
    }
}
