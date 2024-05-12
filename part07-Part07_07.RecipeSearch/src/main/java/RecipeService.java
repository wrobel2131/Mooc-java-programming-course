
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
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
public class RecipeService {
    private List<Recipe> recipes;
    private static final int RECIPE_NAME_STATE = 0;
    
    
    public RecipeService() {
        this.recipes = new ArrayList<>();
    }
    
    public void listRecipesByIngredient(String ingredient) {
        System.out.println("Recipes:");
        this.recipes
                .stream()
                .filter(recipe -> recipe.getIngredients().contains(ingredient))
                .forEach(recipe -> System.out.println(recipe));
    }
    
    public void listRecipesByCookingTime(int maxCookingTimeInMinutes) {
        System.out.println("Recipes:");
        this.recipes
                .stream()
                .filter(recipe -> recipe.getTimeInMinutes() <= maxCookingTimeInMinutes)
                .forEach(recipe -> System.out.println(recipe));
    }
    
    public void listRecipesByName(String searchWord) {
        System.out.println("Recipes:");
        this.recipes
                .stream()
                .filter(recipe -> recipe.getName().contains(searchWord))
                .forEach(recipe -> System.out.println(recipe));
    }
    
    public void loadRecipesFromFile(String fileName) {
        Scanner fileScanner;
        try {
            fileScanner = new Scanner(Paths.get(fileName));
        } catch(IOException ex) {
            System.out.println("Error: " + ex.getMessage() +" while opening "
                    + "file with name: " + fileName);
            return;
        }
        
        this.addRecipesToList(fileScanner);
        
    }
    
    public void listAllRecipes() {
        System.out.println("Recipes:");
        this.recipes
                .forEach((recipe) -> System.out.println(recipe));
    }
    
    
    
    private void addRecipesToList(Scanner fileScanner) {
        RecipeState currentState = RecipeState.RECIPE_NAME;
        String recipeName = null;
        int recipeTimeInMinutes = -1;
        List<String> recipeIngredients = new ArrayList<>();
        
        while(fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            
            if(line.isEmpty()) {
                //add object to the list and reset whole process
                this.recipes.add(new Recipe(recipeName, recipeTimeInMinutes, recipeIngredients));
                recipeName = null;
                recipeTimeInMinutes = -1;
                recipeIngredients = new ArrayList<>();
                currentState = RecipeState.RECIPE_NAME;
                continue;
            }

        
            switch (currentState) {
                case RECIPE_NAME:
                    //assing name of the recipe
                    recipeName = line;
                    currentState = RecipeState.RECIPE_TIME;
                    break;
                case RECIPE_TIME:
                    //assing time of the recipe
                    try {
                        recipeTimeInMinutes = Integer.parseInt(line);
                        currentState = RecipeState.RECIPE_INGREDIENTS;
                    } catch(NumberFormatException ex) {
                        System.out.println(ex.getMessage());
                        return;
                    }
                    
                    break;
                case RECIPE_INGREDIENTS:
                    //assign ingredients
                    recipeIngredients.add(line);
                    break;
            }
            
            if(!fileScanner.hasNextLine()) {
                this.recipes.add(new Recipe(recipeName, recipeTimeInMinutes, recipeIngredients));
            }
            
            
        }
    }
   
    
    
    
}
