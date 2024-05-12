
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Map;
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
    private final Scanner scanner;
    private final RecipeService recipeService;
    private Map<String, String> commands;
    
    public UserInterface(Scanner scanner, RecipeService recipeService) {
        this(scanner, recipeService, Map
                .of(
                        "list", "lists the recipes", 
                        "stop", "stops the program",
                        "find name", "searches recipes by name",
                        "find cooking time", "searches recipes by cooking time",
                        "find ingredient", "searches recipes by ingredient"
                ));
    }
    
    public UserInterface(Scanner scanner, RecipeService recipeService, Map<String, String> commands) {
        this.scanner = scanner;
        this.commands = commands;
        this.recipeService = recipeService;
    }
    
    public void searchRecipes() {
       String fileName = this.getFileName();
       recipeService.loadRecipesFromFile(fileName);
       this.listAllCommands();
       this.performCommandAction();
       
        
    }
    
    private String getFileName() {
       System.out.println("File to read: ");
       String fileName = this.scanner.nextLine();
       System.out.println("");
       return fileName;
    }
    
    private void listAllCommands() {
        System.out.println("Commands:");
        this.commands.forEach((key, val) -> System.out.println(key + " - " + val));
        System.out.println("");
    }
    
    private void performCommandAction() {
        while(true) {
            System.out.println("Enter command: ");
            String command = this.scanner.nextLine();
            if(!this.commands.containsKey(command)) {
                continue;
            }
            if(command.equals("stop")) {
                break;
            } else if(command.equals("list")) {
                this.recipeService.listAllRecipes();
            } else if(command.equals("find name")) {
                System.out.println("Searched word:");
                String searchWord = this.scanner.nextLine();
                this.recipeService.listRecipesByName(searchWord);
            } else if(command.equals("find cooking time")) {
                System.out.println("Max cooking time:");
                int maxCookingTimeInMinutes = Integer.parseInt(this.scanner.nextLine());
                this.recipeService.listRecipesByCookingTime(maxCookingTimeInMinutes);
            } else if(command.equals("find ingredient")) {
                System.out.println("Ingredient:");
                String ingredientToSearch = scanner.nextLine();
                this.recipeService.listRecipesByIngredient(ingredientToSearch);
            }
            
        }
    }
}
