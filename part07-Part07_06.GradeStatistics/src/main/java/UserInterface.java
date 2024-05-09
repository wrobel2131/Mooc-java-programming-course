
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author other21
 */
public class UserInterface {
    private final GradeService gradeService;
    private final Scanner scanner;
    
    public UserInterface(GradeService gradeService, Scanner scanner) {
        this.gradeService = gradeService;
        this.scanner = scanner;
    }
    
    public void analyzePoints() {
        while(true) {
            System.out.println("Enter point totals, -1 stops:");
            int userInput = Integer.parseInt(scanner.nextLine());
            if(userInput == -1) {
                break;
            }
            
            this.gradeService.addPoints(userInput);
        }
        System.out.println("Point average (all): " + this.gradeService.totalPointsAverage());
        System.out.println("Point average (passing): " + this.passingPointsAverageDisplay());
        System.out.println("Pass percentage: " + this.gradeService.passPercentage());
        System.out.println("Grade distribution:");
        this.gradeService.printGradeDistribution();
    }
    
    private String passingPointsAverageDisplay() {
        Double passingAverage = gradeService.passingGradePointsAverage();
        if(passingAverage < 0) {
            return "-";
        }
        return passingAverage.toString();
    }
}
