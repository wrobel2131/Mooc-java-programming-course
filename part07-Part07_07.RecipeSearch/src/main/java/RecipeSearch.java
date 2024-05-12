
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RecipeService recipeService = new RecipeService();

        UserInterface userInterface = new UserInterface(scanner, recipeService);
        userInterface.searchRecipes();
    }

}
