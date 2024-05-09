
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Whichi file should have its content printed?");
        String pathToFile = scanner.nextLine();
        
        try {
            Scanner fileScanner = new Scanner(Paths.get(pathToFile));
            while(fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
        } catch(Exception ex) {
            System.out.println(ex);
        }
    }
}
