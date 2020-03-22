package edu.lab1;

import java.util.HashSet;
import java.util.Set;

public abstract class Item {
    private String name;
   // private float weight;
    private final Set<String> prop;

    public Item(String name,HashSet<String> prop){
        this.name = name;
       // this.weight = weight;
        this.prop = prop;
    }
    public abstract void getInfo();
}
