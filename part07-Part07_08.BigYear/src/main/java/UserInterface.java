
import java.util.List;
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
    private static final List<String> COMMANDS = List.of(
            "Add", "Observation", "All", "One", "Quit"
    );
    private final BirdsDatabase birdsDatabase;
    private final Scanner scanner;
    
    public UserInterface(Scanner scanner, BirdsDatabase birdsDatabase) {
        this.birdsDatabase = birdsDatabase;
        this.scanner = scanner;
    }
    
    public void useBirdDatabase() {
        while(true) {
            System.out.println("?");
            String command = this.scanner.nextLine();
            switch(command) {
                case "Add":
                    this.addCommand();
                break;
                case "Observation":
                    this.observationCommand();
                break;
                case "All":
                    this.allCommand();
                break;
                case "One":
                    this.oneCommand();
                break;
                case "Quit":
                    return;
            }
        }
    }
    
    private void addCommand() {
        System.out.println("Name:");
        String name = scanner.nextLine();
        System.out.println("Name in Latin:");
        String latinName = scanner.nextLine();
        this.birdsDatabase.addBird(new Bird(name, latinName));
    }
    
    private void observationCommand() {
        System.out.println("Bird?");
        String name = scanner.nextLine();
        try {
            this.birdsDatabase.addObservationToBird(name);
        } catch(RuntimeException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    private void allCommand() {
        this.birdsDatabase.getAllBirds().forEach(b -> System.out.println(b));
    }
    
    private void oneCommand() {
        System.out.println("Bird?");
        String name = scanner.nextLine();
        try {
            System.out.println(this.birdsDatabase.getBird(name));
        } catch(RuntimeException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
