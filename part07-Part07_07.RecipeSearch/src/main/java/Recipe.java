
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author other21
 */
public class Recipe {
    private String name;
    private int timeInMinutes;
    private List<String> ingredients;
    
    public Recipe(String name, int timeInMinutes, List<String> ingredients) {
        this.name = name;
        this.timeInMinutes = timeInMinutes;
        this.ingredients = ingredients;
    }
    
    public Recipe(String name, int timeInMinutes) {
        this(name, timeInMinutes, new ArrayList<>());
    }
   

    public String getName() {
        return this.name;
    }
    
    public int getTimeInMinutes() {
        return this.timeInMinutes;
    }
    
    public List<String> getIngredients() {
        return this.ingredients;
    }
    
    @Override
    public String toString() {
        return this.name + ", cooking time: " + this.timeInMinutes;
    }
}
