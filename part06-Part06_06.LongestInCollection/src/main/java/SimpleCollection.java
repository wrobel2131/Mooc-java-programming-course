
import java.util.ArrayList;
import java.util.Objects;

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
    
    public String longest() {
        if(this.elements.isEmpty()) {
            return null;
        }
        
        return this.elements.stream()
                .filter(Objects::nonNull)
                .reduce(this.elements.get(0), 
                (longest, element) -> longest.length() < element.length() ? element : longest);           
    }       

}
