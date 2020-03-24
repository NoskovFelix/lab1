package edu.lab1;

import java.util.HashSet;
import java.util.Set;

public class Item {
    private String name;
    private Set<String> prop;
    private int weight;
    private boolean ItemAlreadyPlaced = false;
    public Item(String name, int weight,HashSet<String> prop){
        this.name = name;
        this.weight = weight;
        this.prop = prop;
    }
    public Set<String> getProp(){
        return prop;
    }
    public boolean setItemsStatus(){
        return ItemAlreadyPlaced = true;
    }
    public int getWeight(){
        return weight;
    }
    public String getName(){
        return name;
    }
    public void getInfo(){

        System.out.println("Name = " + name + "\n" + "weight = " + weight + "\n" + "Properties = " + prop);
    }
}
