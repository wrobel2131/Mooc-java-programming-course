
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString() {
        if(this.elements.isEmpty()) {
            return "The collection " + this.name +" is empty.";
        }
        String elementsOrElement = " elements";
        if(this.elements.size() == 1) {
            elementsOrElement = " element";
        }
        String elementsOutput = "";
        for(String element: this.elements) {
            elementsOutput +=element;
            if(this.elements.indexOf(element) < this.elements.size()-1) {
                elementsOutput += "\n";
            }
        }
        return "The collection " + this.name +" has " + this.elements.size() + elementsOrElement 
                + ":\n" + elementsOutput;
    }
    
}
