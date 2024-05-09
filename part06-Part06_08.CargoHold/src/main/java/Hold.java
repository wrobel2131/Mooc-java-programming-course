
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author other21
 */
public class Hold {
    
    private final ArrayList<Suitcase> suitcases;
    private final int maxWeight;
    
    public Hold(int maxWeight) {
        this.suitcases = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        int totalWeight = this.suitcases
                .stream()
                .mapToInt(Suitcase::totalWeight).sum();
        if(totalWeight+suitcase.totalWeight() <= maxWeight) {
            this.suitcases.add(suitcase);
        }
    }
    
    public void printItems() {
        this.suitcases
                .stream()
                .forEach(suitcase -> suitcase.printItems());
    }
    
    @Override
    public String toString() {
        String suitcaseOrSuitcases = this.suitcases.size() == 1 ? "suitcase" : "suitcases";
        int totalWeight = this.suitcases
                .stream()
                .mapToInt(Suitcase::totalWeight).sum();
        return this.suitcases.size() + " " + suitcaseOrSuitcases + " (" + totalWeight + " kg)";
    }
}
