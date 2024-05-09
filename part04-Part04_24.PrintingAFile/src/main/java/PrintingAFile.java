
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) {

        String path = "data.txt";
        
        try {
            Scanner scanner = new Scanner(Paths.get(path));
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch(Exception ex) {
            System.out.println(ex);
        }
    }
}
