
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author other21
 */
public class JokeManager {
    private ArrayList<String> jokes;
    private final Random random;
    
    public JokeManager() {
        this.jokes = new ArrayList<>();
        this.random = new Random();
    }
    
    public void addJoke(String joke) {
        this.jokes.add(joke);
    }
    
    public String drawJoke() {
        if(this.jokes.isEmpty()) {
            return "Jokes are in short supply.";
        }
         int jokeIndex = random.nextInt(this.jokes.size());
         return this.jokes.get(jokeIndex);
        
    }
    
    public void printJokes() {
        for(String joke: jokes) {
            System.out.println(joke);
        }
    }
    
}
