
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author other21
 */
public class BirdsDatabase {
    private Map<String, Bird> birds;
    
    public BirdsDatabase() {
        this.birds = new HashMap<>();
    }
    
    public void addBird(Bird bird) {
        this.birds.put(bird.getName(), bird);
    }
    
    public Bird getBird(String name) {
        if(!this.birds.containsKey(name)) {
            throw new RuntimeException("Not a bird!");
        }
        return birds.get(name);
    }
    
    public List<Bird> getAllBirds() {
        return this.birds
                .values()
                .stream()
                .collect(Collectors.toList());
    }
    
    public void addObservationToBird(String name) {
        Bird updatedBird = this.getBird(name);
        updatedBird.addObservation();
        this.birds.put(name, updatedBird);
    }
    
}
