
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    // implement an equals method here for checking the equality of objects
    
    public boolean equals(Object compared) {
        Person comparedPerson = (Person) compared;
        return this == compared || (compared instanceof Person && this.name.equals(comparedPerson.name)
                && this.height == comparedPerson.height && this.weight == comparedPerson.weight 
                && this.birthday.equals(comparedPerson.birthday));
    }
}
