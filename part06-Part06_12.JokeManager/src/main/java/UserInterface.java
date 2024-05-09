
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
    private JokeManager jokeManager;
    private final Scanner scanner;
    
    public UserInterface(JokeManager jokeManager, Scanner scanner) {
        this.jokeManager = jokeManager;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            this.printCommands();
            String command = scanner.nextLine();
            if(command.equals("X")) {
                break;
            } else if(command.equals("1")) {
                System.out.println("Write the joke to be added:");
                String joke = scanner.nextLine();
                jokeManager.addJoke(joke);
            } else if(command.equals("2")) {
                System.out.println("Drawing a joke.");
                System.out.println(this.jokeManager.drawJoke());
            } else if(command.equals("3")) {
                System.out.println("Printing the jokes.");
                this.jokeManager.printJokes();
            }
        }
        
    }
    
    private void printCommands() {
        System.out.println("Commands: ");
        System.out.println("1 - add a joke");
        System.out.println("2 - draw a joke");
        System.out.println("3 - list jokes");
        System.out.println("X - stop");
    }
}
