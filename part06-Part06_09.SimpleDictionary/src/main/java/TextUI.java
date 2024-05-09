
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
public class TextUI {
    private final Scanner scanner;
    private SimpleDictionary simpleDictionary;
    
    
    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }
    
    public void start() {
        
        while(true) {
            String command = scanner.nextLine();
            
            
            
            if(command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if(command.equals("add")) {
                System.out.println("Word: ");
                String word = scanner.nextLine();
                System.out.println("Translation: ");
                String translation = scanner.nextLine();
                this.simpleDictionary.add(word, translation);
            } else if(command.equals("search")) {
                System.out.println("To be translated: ");
                String wordToTranslate = scanner.nextLine();
                String translated = this.simpleDictionary.translate(wordToTranslate);
                if(translated == null) {
                    System.out.println("Word " + wordToTranslate + " was not found");
                } else {
                    System.out.println("Translation: " + translated);
                }
                
            } else {
                System.out.println("Unknown command");
            }
            
        }
    }
}
