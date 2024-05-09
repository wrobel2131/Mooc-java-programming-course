/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author other21
 */
public class Item {
    private String id;
    private String name;
    
    public Item(String id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public String getId() {
        return this.id;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return this.id + ": " + this.name;
    }
    
    public boolean equals(Object compared) {
        Item comparedItem = (Item) compared;
        return compared instanceof Item && this.id.equals(comparedItem.getId());
    }
    
}
