
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
public class Suitcase {
    private  final ArrayList<Item> items;
    private final int maxWeight;
    
    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }
    
    public void addItem(Item item) {
        if(this.totalWeight() + item.getWeight() <= this.maxWeight) {
            this.items.add(item);
        }
       
    }
    
    public void printItems() {
        this.items.stream().forEach(i -> System.out.println(i));
    }
    
    public int totalWeight() {
        return this.items.stream().mapToInt(Item::getWeight).sum();
    }
    
    public Item heaviestItem() {
        return this.items
                .stream()
                .filter(Objects::nonNull)
                .max(Comparator.comparingInt(Item::getWeight))
                .orElse(null);
                
    }
    
    
    @Override
    public String toString() {
        String itemsCount = this.items.size() > 0 ? String.valueOf(this.items.size()) : "no";
        String itemOrItems = this.items.size() == 1 ? "item" : "items";
        return itemsCount + " " + itemOrItems + " (" + this.totalWeight() + " kg)";
    }
}
