
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author other21
 */
public class Room {
    private ArrayList<Person> people;
    
    public Room() {
        this.people = new ArrayList<>();
    }
    
    public void add(Person person) {
        this.people.add(person);
    }
    
    public boolean isEmpty() {
        return this.people.isEmpty();        
    }
    
    public ArrayList<Person> getPersons() {
        return this.people;
    }
    
    public Person shortest() {
        if(this.isEmpty()) {
            return null;
        }
        
        return this.people
                .stream()
                .filter(Objects::nonNull)
                .min(Comparator.comparingInt(Person::getHeight))
                .orElse(null);
    }
    
    public Person take() {
        if(this.isEmpty()) {
            return null;
        }
        
        return this.people.remove(this.people.indexOf(this.shortest()));
    }
}
