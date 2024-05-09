
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeService gradeService = new GradeService();
        UserInterface userInterface = new UserInterface(gradeService, scanner);
        
        userInterface.analyzePoints();
    }
}
