
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String fileName = scanner.nextLine();
        try {
            Scanner fileScanner = new Scanner(Paths.get(fileName));
            while(fileScanner.hasNextLine()) {
                String[] nameAndAge = fileScanner.nextLine().split(",");
                String name = nameAndAge[0];
                int age = Integer.valueOf(nameAndAge[1]);
                String yearWord = age == 1 ? "year" : "years";
                System.out.println(name + ", age: " + age + " " + yearWord);
                
            }
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}
